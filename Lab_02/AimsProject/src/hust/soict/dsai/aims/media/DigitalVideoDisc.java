package hust.soict.dsai.aims.media;

	
public class DigitalVideoDisc extends Media implements Comparable<Media>, Playable{
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
	
	public DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	

	@Override
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $", getTitle(), getCategory(), director, length, getCost());
    }

    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
	@Override
	public int compareTo(Media other) {
	    int titleCompare = this.getTitle().compareTo(other.getTitle());
	    if (titleCompare != 0) {
	        return titleCompare;
	    } else {
	        int lengthCompare;
	        if (other instanceof DigitalVideoDisc) {
	            DigitalVideoDisc otherDisc = (DigitalVideoDisc) other;
	            lengthCompare = Integer.compare(otherDisc.getLength(), this.getLength());
	        } else {
	            lengthCompare = 0; // Nếu không phải Disc, coi như bằng nhau về độ dài
	        }
	        if (lengthCompare != 0) {
	            return lengthCompare;
	        } else {
	            return Float.compare(this.getCost(), other.getCost());
	        }
	    }
	}


   


}
