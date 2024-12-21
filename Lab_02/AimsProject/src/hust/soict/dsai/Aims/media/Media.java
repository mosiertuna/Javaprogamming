package hust.soict.dsai.Aims.media;
import java.util.Comparator;
public abstract class Media {
  public int id;
  public String title;
  public String category;
  public float cost;
    // Default constructor
    public Media() {
      // TODO Auto-generated constructor stub
      
    }

  public static void main(String[] args) {
    // Example usage (optional, can be removed if not required)
    
  }

  public boolean isMatch(String title) {
    String[] keywords = title.split("\\s+");
    for (String word : keywords) {
        if (this.title.toLowerCase().contains(word.toLowerCase()))
            return true;
    }
    return false;
}
//getter and setter options
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
   // Comparators
   public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
   public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

   @Override
   public boolean equals(Object obj) {
       if (this == obj) return true; 
       if (obj == null || getClass() != obj.getClass()) return false;

       Media media = (Media) obj;
       return this.title != null && this.title.equals(media.title);
   }

   @Override
   public int hashCode() {
       return title != null ? title.hashCode() : 0;
   }

   @Override
   public String toString(){
    return "Media{" + 
           ", title='"+title+'\''+
           ", category='" + category +'\''+
           ", cost='"+cost+'\''+
           '}';
   }
}
