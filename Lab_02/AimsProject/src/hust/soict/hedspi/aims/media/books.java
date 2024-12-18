package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;

public class books extends Media {
	private List<String> authors = new ArrayList<String>();
	public List<String> getAuthors() {
		return authors;
	}
	public books(String title, String category, float cost) {
		super(title, category, cost);
	}
	public books(String title, String category, float cost, List<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
	
	// addAuthor method
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author is already existed in the list");
            return;
        }    
        authors.add(authorName);
        System.out.println("Added successfully.");
    }
    
	// removeAuthor method
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Cannot find the author in the list.");
            return;
        }
        authors.remove(authorName);
        System.out.println("Deleted successfully.");
    }

    @Override
    public void print() {
        System.out.println("Book: " + this.getTitle() + " | Category: " + this.getCategory() + " | Cost: " + this.getCost());
    }

    @Override
    public String toString() {
        return "Book: " + super.toString();
    }
	
}
