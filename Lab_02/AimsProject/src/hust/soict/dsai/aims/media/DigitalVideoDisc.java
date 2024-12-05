package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class DigitalVideoDisc extends Media implements  Playable{
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
    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public void print() {
        System.out.println("Digital Video Disc: " + this.getTitle() + 
                           " | Category: " + this.getCategory() + 
                           " | Director: " + this.getDirector() + 
                           " | Length: " + this.getLength() + " minutes | Cost: " + this.getCost());
    }

    @Override
    public String toString() {
        return "Digital Video Disc: " + super.toString() + 
               " | Director: " + this.getDirector() + 
               " | Length: " + this.getLength() + " minutes";
    }   
	
	
	




}
