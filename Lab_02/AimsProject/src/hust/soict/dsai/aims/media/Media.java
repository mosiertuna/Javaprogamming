package hust.soict.dsai.aims.media;

public abstract class Media implements Comparable<Media> {
	private int id;
	private String title;
	private String category;
	private float cost;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu obj là một thể hiện của Track
        if (this == obj) return true; // So sánh tham chiếu
        if (!super.equals(obj)) return false; // Kiểm tra title bằng phương thức equals() của Media
        if (obj == null || getClass() != obj.getClass()) return false; // Kiểm tra null và kiểu

        Media media = (Media) obj; // Ép kiểu
        return title != null ? title.equals(media.title) : media.title == null; // So sánh title
    }
    

	
	


}
