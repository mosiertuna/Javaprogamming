package hust.soict.dsai.Aims.media;

public class DigitalVideoDisc extends Disc implements Playable{	
	private static int nbDigitalVideoDiscs = 0; // Class attribute
	private int id;  // Instance attribute
	// Constructor mặc định
	public DigitalVideoDisc() {
			updateID();
	}
	// Phương thức cập nhật ID
	private void updateID() {
			nbDigitalVideoDiscs++; // Tăng số lượng đối tượng DigitalVideoDisc
			id = nbDigitalVideoDiscs; // Gán ID cho đối tượng
	}
	// Constructor với tất cả các thuộc tính
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
			this.title = title;
			this.category = category;
			this.director = director;
			this.length = length;
			this.cost = cost;
			updateID();
	}
	// Constructor với tiêu đề, thể loại, đạo diễn và giá
	public DigitalVideoDisc(String title, String category, String director, float cost) {
			this.title = title;
			this.category = category;
			this.director = director;
			this.cost = cost;
			updateID();
	}
	// Constructor với tiêu đề, thể loại và giá
	public DigitalVideoDisc(String title, String category, float cost) {
			this.title = title;
			this.category = category;
			this.cost = cost;
			updateID();
	}
	// Constructor với chỉ tiêu đề
	public DigitalVideoDisc(String title) {
			this.title = title;
			updateID();
	}
	public DigitalVideoDisc(String text, String text2, float float1, String text3, int i) {
    //TODO Auto-generated constructor stub
  }
  // Setter tạm thời cho tiêu đề
	public void setTitle(String title) {
			this.title = title;
	}
	// Getter lấy tiêu đề
	public String getTitle() {
			return title;
	}
	// Getter lấy thể loại
	public String getCategory() {
			return category;
	}
	// Getter lấy đạo diễn
	public String getDirector() {
			return director;
	}
	// Getter lấy độ dài
	public int getLength() {
			return length;
	}
	// Getter lấy giá
	public float getCost() {
			return cost;
	}
	// Getter lấy ID
	public int getId() {
			return id;
	}
	//toString
	public String toString(){
		return id + ". DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$";
  }
	// Implement play() from Playable
	@Override
	public void play() {
			System.out.println("VuQuangDung-20225818 Playing DVD: "+ this.getTitle());
			System.out.println("VuQuangDung-20225818 DVD length: "+ this.getLength());
	}
}
