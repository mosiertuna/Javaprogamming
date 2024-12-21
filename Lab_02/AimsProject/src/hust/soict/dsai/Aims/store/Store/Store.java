package hust.soict.dsai.Aims.store.Store;

import hust.soict.dsai.Aims.media.Media;
import java.util.ArrayList;

// VŨ QUANG DŨNG - 20225818
public class Store {
    public static final int MAX_NUMBERS_ORDERS = 20; // Maximum number of items in the store

    // Collection to store Media objects
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    // Method to add a Media object to the store
    public boolean addMedia(Media media) {
        if (itemsInStore.size() < MAX_NUMBERS_ORDERS) {
            itemsInStore.add(media);
            System.out.println("The media has been added to the store.");
            return true;
        } else {
            System.out.println("The store is full. Cannot add more media.");
            return false;
        }
    }

    // Method to remove a Media object from the store
    public boolean removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The media has been removed from the store.");
            return true;
        } else {
            System.out.println("The media is not in the store.");
            return false;
        }
    }

    // Method to print all items in the store
    public void printStore() {
        System.out.println("*****************************Store***********");
        System.out.println("Items in Store:");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
        System.out.println("***************************************");
    }

    // Search for a Media object by title
    public void searchMediaByTitle(String title) {
        boolean found = false;
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println("TThe media has been found.");
                System.out.println(media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The media with title '" + title + "' is not found.");
        }
    }

    // findMediaByTitle
    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media; // Found
            }
        }
        return null; // Not found
    }

    /**
     * Get all items available in the store.
     *
     * @return ArrayList of Media objects currently in the store.
     */
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}
