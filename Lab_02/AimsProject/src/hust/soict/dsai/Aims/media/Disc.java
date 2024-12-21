package hust.soict.dsai.Aims.media;

public abstract class Disc extends Media {
    public int length;
    public String director;

    // Default constructor
    public Disc() {
        super(); // Gọi constructor của class cha (nếu có)
    }

    // Constructor with parameters
    public Disc(int length, String director) {
        super(); // Gọi constructor của class cha (nếu có)
        this.length = length;
        this.director = director;
    }

    // Getter and setter
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
