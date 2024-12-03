package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{
	@Override
	public int compare(Media m1, Media m2) {
		try {
			if(m1.getTitle().compareTo(m2.getTitle()) > 0) {
				return -1;
			} else if (m1.getTitle().compareTo(m2.getTitle()) < 0) {
				return 1;
			} else {
				if(m1.getCost() > m2.getCost()) {
					return -1;
				} else if(m1.getCost() < m2.getCost()) {
					return 1;
				}
			}
		} catch (NullPointerException e) {
			if(m1.getTitle() == null && m2.getTitle() == null) {
				return -1;
			}
			if(m1.getTitle() != null && m2.getTitle() == null) {
				return -1;
			}
			if(m1.getTitle() == null && m2.getTitle() != null) {
				return 1;
			}
		}
		return 0;
	}
}
