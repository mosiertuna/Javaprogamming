package hust.soict.hedspi.aims.store;
import java.util.ArrayList;

import java.util.Collections;

import hust.soict.hedspi.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	public void setItemsInStore(ArrayList<Media> itemsInStore) {
		this.itemsInStore = itemsInStore;
	}
	// Phương thức thêm Media vào cửa hàng
	public void addMedia(Media media) {
	    if (!checkMedia(media)) {
	        itemsInStore.add(media);
	        //System.out.println(media.getTitle() + " has been added to the store!");
	    } else {
	        System.out.println(media.getTitle() + " already exists in the store!");
	    }
	}

    // Phương thức xóa Media khỏi cửa hàng
	public void removeMedia(Media media) {
	    if (checkMedia(media)) {
	        itemsInStore.remove(media);
	        System.out.println(media.getTitle() + " has been deleted from the store!");
	    } else {
	        System.out.println("Cannot find " + media.getTitle() + " in the store!");
	    }
	}
    
    private boolean checkMedia(Media media) {
        for (Media item : itemsInStore) {
            if (item.equals(media)) {
                return true;
            }
        }
        return false;
    }

    // Phương thức hiển thị danh sách Media
    public void print() {
    	System.out.println("\n**********************STORE************************\nStore items:\n");
       for (Media media : itemsInStore) {
    	   System.out.println(media.toString());
       }
        System.out.println("**************************************************");
    }
    	
    
    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
    
    
    // Title sort method
    public void sortStoreByTitle() {
        Collections.sort(itemsInStore, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Cart sorted by title.");
    }

    // Cost sort method
    public void sortStoreByCost() {
        Collections.sort(itemsInStore, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Cart sorted by cost.");
    }
    public void clear() {
        itemsInStore.clear();
        //System.out.println("Cart has been cleared.");
    }
    

}
