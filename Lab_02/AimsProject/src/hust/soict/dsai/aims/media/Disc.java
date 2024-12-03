package hust.soict.dsai.aims.media;

public class Disc extends Media implements Comparable<Media>, Playable{
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

	public Disc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
        this.length = length;
	}

	@Override
	public int compareTo(Media other) {
	    int titleCompare = this.getTitle().compareTo(other.getTitle());
	    if (titleCompare != 0) {
	        return titleCompare;
	    } else {
	        int lengthCompare;
	        if (other instanceof Disc) {
	            Disc otherDisc = (Disc) other;
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


    @Override
    public void play() {
        System.out.println("Playing disc: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }


	
}
