package hust.soict.dsai.Aims.media;
import java.util.ArrayList;
import java.util.List;public class Book extends Media {    
    private List<String> authors = new ArrayList<String>();
    // Default constructor
    public Book() {
        // TODO Auto-generated constructor stub
    }

    // Add an author to the authors list
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) { // Ensure the author is not already in the list
            authors.add(authorName);
            System.out.println("Author \"" + authorName + "\" has been added.");
        } else {
            System.out.println("Author \"" + authorName + "\" is already in the list.");
        }
    }
    // Remove an author from the authors list
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) { // Ensure the author is present in the list
            authors.remove(authorName);
            System.out.println("Author \"" + authorName + "\" has been removed.");
        } else {
            System.out.println("Author \"" + authorName + "\" is not in the list.");
        }
    }
    public static void main(String[] args) {
        // Example usage (optional, can be removed if not required)
        Book myBook = new Book();
        myBook.addAuthor("J.K. Rowling");
        myBook.addAuthor("J.K. Rowling"); // Duplicate, should not be added
        myBook.removeAuthor("George Orwell"); // Not in the list
        myBook.removeAuthor("J.K. Rowling");
    }

    //constructor
    public Book(int id, String title, String category, float cost) {
			this.id = id;
      this.title = title;
			this.category = category;
			this.cost = cost;
	}
    
  public Book(String title, String category, float cost) {
    this.title = title;
    this.category = category;
    this.cost = cost;
  } 
    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;    }

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
}
