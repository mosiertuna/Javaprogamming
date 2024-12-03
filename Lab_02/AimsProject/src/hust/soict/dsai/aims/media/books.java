package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class books extends Media {
	private List<String> authors = new ArrayList<String>();
	public List<String> getAuthors() {
		return authors;
	}
	public books(int id, String title, String category, float cost,List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}
	
	public books(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	// addAuthor method
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Đã thêm vào " + getTitle());
		}
		else {
			System.out.println("Đã tồn tại trong " + getTitle());
		}
	}
	// removeAuthor method
	public void removeAuthor(String authorName) {
		if(authors.remove(authorName)) {
			System.out.println("Đã xóa khỏi " + getTitle());
		}
		else {
			System.out.println("Không thấy trong " + getTitle());
		}
	}
	
	
	@Override
	public int compareTo(Media o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
	
}
