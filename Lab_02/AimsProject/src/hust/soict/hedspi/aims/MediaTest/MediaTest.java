package hust.soict.hedspi.aims.MediaTest;

import java.util.ArrayList;
import java.util.List;
import hust.soict.hedspi.aims.media.CD;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.books;

public class MediaTest {
    public static void main(String[] args) {
    	List<Media> mediae = new ArrayList<Media>();
    	CD cd = new CD("Phim hành động", "Phim", 19.99f, null, 0);
    	DigitalVideoDisc dvd = new DigitalVideoDisc("Phim hành động", "Phim", 19.99f);
    	books book = new books( "Phim hành động", "Phim", 19.99f);
    	
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(book);
    	for(Media m: mediae) {
    		 System.out.println(m.toString());
    	}	
    	
    	
    }

}
