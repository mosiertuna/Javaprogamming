package hust.soict.dsai.aims.media;

	
public class DigitalVideoDisc extends Media {
    private String director;
    private int length; 
    public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
        this.length = length;
	}
	
	
	
	@Override
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $", getTitle(), getCategory(), director, length, getCost());
    }

    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }

    
 




   


}
