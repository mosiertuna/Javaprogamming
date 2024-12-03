package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	private static final int MAX_ITEMS = 10; // Giới hạn số lượng DVD trong giỏ
	public static int getMaxItems() {
		return MAX_ITEMS;
	}

    // Phương thức thêm Media vào giỏ
    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("The media \"" + media.getTitle() + "\" has been added.");
    }

    // Phương thức xóa Media khỏi giỏ
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media \"" + media.getTitle() + "\" has been removed.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" is not found in the cart.");
        }
    }

    // Phương thức tính tổng chi phí
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Phương thức hiển thị thông tin giỏ hàng
    public void displayCart() {
        System.out.println("Current items in the cart:");
        for (Media media : itemsOrdered) {
            System.out.println("- " + media.getTitle() + ": $" + media.getCost());
        }
        System.out.println("Total cost: $" + totalCost());
    }

    // Phương thức print()
    public void print() {
        StringBuilder output = new StringBuilder();
        output.append("***********************CART***********************\n");
        output.append("Ordered Items:\n");
        
        int count = 1; // Biến đếm bắt đầu từ 1
        for (Media item : itemsOrdered) {
            if (item != null) {
                output.append(String.format("%d. %s\n", count++, item.getTitle())); // In ra tiêu đề của item
            }
        }

        output.append(String.format("Total cost: $%.2f\n", totalCost()));
        output.append("***************************************************");
        System.out.println(output.toString());
    }


    public Media findMediaByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
  



}
    
        
