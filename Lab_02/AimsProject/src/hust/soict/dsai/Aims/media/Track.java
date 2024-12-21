package hust.soict.dsai.Aims.media;

public class Track implements Playable{
  private String title; 
  private int length;
  
  // Default constructor
  public Track() {
    super(); // Gọi constructor của class cha (nếu có)
}

// Constructor with parameters
public Track(int length, String title) {
    super(); // Gọi constructor của class cha (nếu có)
    this.length = length;
    this.title = title;
}
  
  //getter
  public String getTitle() {
    return title;
  }
  public int getLength() {
    return length;
  }

  // Implement play() from Playable
  @Override
  public void play() {
    System.out.println("Playing track: "+ this.getTitle());
    System.out.println("Track length: "+ this.getLength());
  }

  @Override
public boolean equals(Object obj) {
    if (this == obj) return true; // Kiểm tra nếu cả hai tham chiếu đến cùng một đối tượng
    if (obj == null || getClass() != obj.getClass()) return false; // Kiểm tra null hoặc khác lớp
    
    Track track = (Track) obj; // Ép kiểu đối tượng
    return this.length == track.length && 
           this.title != null && this.title.equals(track.title); // So sánh tiêu đề và độ dài
}
 //override cả hashCode() để đảm bảo các đối tượng tương đương (equals) có cùng mã băm.
@Override
public int hashCode() {
    int result = (title != null ? title.hashCode() : 0); // hashCode của tiêu đề
    result = 31 * result + length; // Kết hợp với độ dài
    return result;
}


}
