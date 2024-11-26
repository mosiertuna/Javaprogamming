package aims;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0; // Thêm biến class để lưu số lượng DVD
    private int id; // Thêm biến instance để lưu ID của mỗi DVD
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    @Override
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: %.2f $", title, category, director, length, cost);
    }

    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

    
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.id = ++nbDigitalVideoDiscs; // Cập nhật ID và số lượng DVD
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.id = ++nbDigitalVideoDiscs; // Cập nhật ID và số lượng DVD
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.id = ++nbDigitalVideoDiscs; // Cập nhật ID và số lượng DVD
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) {
        super();
        this.id = ++nbDigitalVideoDiscs; // Cập nhật ID và số lượng DVD
        this.title = title;
    }

    public int getId() {
        return id;
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
