package hust.soict.hedspi.aims.media;

public class Disc extends Media {
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

	public  Disc(String title, String category, float cost, String director, int length) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	public  Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		this.director = director;
	}
	public  Disc(String title, String category, float cost) {
		super(title, category, cost);
	}


	
}
