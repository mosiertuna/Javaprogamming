package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
	
	@Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
	
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu obj là một thể hiện của Track
        if (this == obj) return true; // So sánh tham chiếu
        if (!super.equals(obj)) return false; // Kiểm tra title bằng phương thức equals() của Media
        if (obj == null || getClass() != obj.getClass()) return false; // Kiểm tra null và kiểu

        Track track = (Track) obj; // Ép kiểu
        return track.getTitle().equals(this.getTitle()) && track.getLength() == this.getLength(); // So sánh độ dài
    }
	
	

}
