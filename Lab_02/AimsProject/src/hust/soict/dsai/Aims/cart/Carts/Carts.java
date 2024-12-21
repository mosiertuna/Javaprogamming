package hust.soict.dsai.Aims.cart.Carts;

import hust.soict.dsai.Aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Carts {
    public static final int MAX_NUMBERS_ORDERS = 20; // Maximum number of items in the cart
    private static ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    
    
    
        // Method to add a Media object to the cart
        public static boolean addMedia(Media media) {
            if (itemsOrdered.size() < MAX_NUMBERS_ORDERS) {
            itemsOrdered.add(media);
            System.out.println("The media has been added.");
            return true;
        } else {
            System.out.println("The cart is full.");
            return false;
        }
    }

    // Method to remove a Media object from the cart
    public boolean removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media has been removed.");
            return true;
        } else {
            System.out.println("The media is not in the cart.");
            return false;
        }
    }

    // Method to calculate the total cost of the cart
    public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Print the contents of the cart
    public void printCart() {
        System.out.println("***************cart***********");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }
        System.out.println("***************************************");
    }

    // Search for a Media object by title
    public void searchMediaByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println("The media has been found.");
                System.out.println(media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The media with title '" + title + "' is not found.");
        }
    }
 
    //search for Media object by title
    public Media findMediaByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println("The media has been found.");
                System.out.println(media.toString());
                return media;
            }
        }
        // Nếu không tìm thấy media
        System.out.println("The media with title '" + title + "' is not found.");
        return null; // Trả về null nếu không tìm thấy
    }
    

    // Search for a Media object by ID
    public void searchMediaById(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("The media has been found.");
                System.out.println(media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The media with ID '" + id + "' is not found.");
        }
    }
    public static ObservableList<Media> getItemsOrdered() {
        return FXCollections.observableArrayList(itemsOrdered);
    }

    //clear method
    public void emptyCart(){
        itemsOrdered.clear();
    }

    public Media filterById(int id){
        for(Media media : itemsOrdered){
            if(media.getId()==id){
                System.out.println(media.title +" - "+media.cost+" - " + media.category );
                return media;
            }
        }
        System.out.println("Cannot found the id!!!");
        return null;
    }
    public Media filterByTitle(String title){
        for(Media media : itemsOrdered){
            if(media.getTitle()==title){
                System.out.println(media.id +" - "+media.cost+" - " + media.category );
                return media;
            }
        }
        System.out.println("Cannot found the id!!!");
        return null;
    }

    public void placeOrder() {
        itemsOrdered.clear();
    }
    
}
