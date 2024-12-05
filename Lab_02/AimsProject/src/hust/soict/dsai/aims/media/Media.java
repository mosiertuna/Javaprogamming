package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
	private static int nbMedia = 0;
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
	public Media(String title, String category, float cost) {
		this.id = ++nbMedia;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object o) {
		Media media = (Media) o;
		try {
			String title = media.getTitle();
			return title.equals(this.getTitle());
		} catch (NullPointerException e) {
			return false;
		}
	}
	
	@Override
    public String toString() {
        return 	"ID: " + id + 
        		" | Title: " + title + 
        		" | Category: " + category +
        		" | Cost: " + cost;
    }
    
	public void print() {
		//phương thức cho các class con
	}
	
	public boolean isMatch(String title) {
		return this.getTitle().equalsIgnoreCase(title);
	}
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	
	


}
