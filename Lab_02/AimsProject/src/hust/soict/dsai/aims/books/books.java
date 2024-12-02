package hust.soict.dsai.aims.books;
import java.util.ArrayList;
import java.util.List;

public class books {
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public books(int id, String title, String category, float cost, List<String> authors) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.authors = authors;
	}
	// addAuthor method
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Đã thêm vào " + title);
		}
		else {
			System.out.println("Đã tồn tại trong " + title);
		}
	}
	// removeAuthor method
	public void removeAuthor(String authorName) {
		if(authors.remove(authorName)) {
			System.out.println("Đã xóa khỏi " + title);
		}
		else {
			System.out.println("Không thấy trong " + title);
		}
	}
	
	
	
	
	
	
	
	

}
