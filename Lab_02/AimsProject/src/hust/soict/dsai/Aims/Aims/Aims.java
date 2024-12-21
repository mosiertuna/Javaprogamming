package hust.soict.dsai.Aims.Aims;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

import hust.soict.dsai.Aims.cart.Carts.Carts;
import hust.soict.dsai.Aims.media.Book;
import hust.soict.dsai.Aims.media.CompactDisc;
//import hust.soict.dsai.Aims.cart.Carts.Carts;
import hust.soict.dsai.Aims.media.DigitalVideoDisc;
import hust.soict.dsai.Aims.media.Media;
import hust.soict.dsai.Aims.media.Playable;
import hust.soict.dsai.Aims.store.Store.Store;
import hust.soict.dsai.screen.CartScreen;
import hust.soict.dsai.screen.StoreScreen;
import hust.soict.dsai.execption.*;

public class Aims {

    private static Store store;
    private static Carts cart;
    private static StoreScreen storeScreen;
    private static CartScreen cartScreen;

    public static Store getStore() {
        return store;
    }

    public static Carts getCart() {
        return cart;
    }

    public static StoreScreen getStoreScreen() {
        return storeScreen;
    }

    /*public static CartScreen getCartScreen() {
        return cartScreen;
    }*/
	
public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void filterCartMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart by Id");
        System.out.println("2. Filter medias in cart by title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void updateStoreMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add media to store");
        System.out.println("2. Remove Media from store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void sortCartMenu(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort by Title and Cost");
        System.out.println("2. Sort by Cost and Title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Media> media = new ArrayList<Media>();
        Carts cart = new Carts();
		Store store = new Store(); 
		//CompactDisc
		CompactDisc cd = new CompactDisc("Ronaldo",7,"Penaldo",0,"The real GOAT","Music",77.77f);
		CompactDisc cd1 = new CompactDisc("Messi",10,"Pepsi",1,"The fake GOAT","Tango",10.10f);
		CompactDisc cd2 = new CompactDisc("Neymar",10,"BreakAnkle",2,"Prince","Samba",17.27f);
		CompactDisc cd3 = new CompactDisc("Mbappe",18,"WCat18",3,"World cup","Music",40.70f);
		CompactDisc cd4 = new CompactDisc("Vinicius",15,"Ballon Do'or",4,"Best","Samba",22.22f);
		//dvd
		DigitalVideoDisc dvd = new DigitalVideoDisc("Haitet2014","Comedy","Quang Thang",14,14.55f);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Haitet2015","Sci-fi","Quang",15,14.45f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Haitet2016","Animation","Thang",16,1.55f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Haitet2017","Comedy","Quan",17,4.55f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Haitet2018","Animation","Thanh",18,34.55f);
		//book
		Book book = new Book(1,"I am Zlatan","Sci-fi",14.55f);
    Book book1 = new Book(2,"Tuky","Classic",4.55f);
		Book book2 = new Book(3,"Tram cam vi Lap trinh Huong doi tuong","Horror",1.55f);
		Book book3 = new Book(4,"Toi tai gioi","Fantasy",12.55f);
		Book book4 = new Book(5,"Ban cung the","Sci-fi",13.55f);
        media.add(cd1);
        media.add(dvd2);
        media.add(book4);
        for(Media m : media){
            System.out.println(m.toString());
        }


        store.addMedia(cd);
        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);
        store.addMedia(cd4);

        store.addMedia(dvd);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);

        store.addMedia(book);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(book4);


        int choice;
        String userTitle;
        Media mediaByTitle;
        do {
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: // View store
                    int storeChoice;
                    do {
                        store.printStore();
                        storeMenu();
                        storeChoice = scanner.nextInt();
                        switch (storeChoice) {
                            case 1:
                                System.out.println("Enter the title of media: ");
                                scanner.nextLine();

                                userTitle = scanner.nextLine();
                                mediaByTitle = store.findMediaByTitle(userTitle);
                                if (mediaByTitle != null) {
                                    int mediaDetailMenuChoice;

                                    mediaDetailsMenu();
                                    mediaDetailMenuChoice = scanner.nextInt();
                                    switch (mediaDetailMenuChoice) {
                                        case 1:
                                            System.out.println("Enter the title of media: ");
                                            cart.addMedia(mediaByTitle);
                                            System.out.println("Added " + mediaByTitle.getTitle() + " to cart successfully");
                                            break;
                                        case 2:
                                            System.out.println("Playing " + mediaByTitle.getTitle());
                                            break;
                                        case 0:
                                            System.out.println("Returning to store menu...");
                                            break;
                                        default:
                                            System.out.println("Invalid choice. Please try again.");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Enter the title of media: ");
                                scanner.nextLine();
                                userTitle =  scanner.nextLine().trim();
                                mediaByTitle = store.findMediaByTitle(userTitle);
                                if(mediaByTitle != null){
                                    cart.addMedia(mediaByTitle);
                                    System.out.println("Added " + mediaByTitle.getTitle() + " to cart successfully");
                                }else{
                                    System.out.println("Title does not exist");
                                }
                                break;
                            case 3:
                                System.out.println("Enter the title of the media to play: ");
                                scanner.nextLine(); // Consume the leftover newline
                                String titleToPlay = scanner.nextLine();

                                Media mediaToPlay = store.findMediaByTitle(titleToPlay);
                                if (mediaToPlay != null) {
                                    if (mediaToPlay instanceof Playable) {
                                        ((Playable) mediaToPlay).play();
                                    } else {
                                        System.out.println("The selected media is not playable.");
                                    }
                                } else {
                                    System.out.println("Media not found in the store.");
                                }
                                break;

                            case 4:
                                int cartChoice;
                                do {
                                    cart.printCart();
                                    cartMenu();
                                    cartChoice = scanner.nextInt();
									CartMenuChoice(cartChoice, cart,scanner);
                                    //CartMenuChoice(cartChoice, cart);
                                } while (cartChoice != 0);
                                break;
                            case 0:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    } while (storeChoice != 0);
                    break;

                case 2: // Update store
                    int updateChoice;
                    do {
                        updateStoreMenu(); // Display the update store menu
                        updateChoice = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        switch (updateChoice) {
                            case 1: // Add media to store
                                System.out.println("Enter details of the media to add:");
                                System.out.print("Type (CD/DVD/Book): ");
                                String type = scanner.nextLine();
                                System.out.println(type);
                                Media newMedia = null;
                                if ("CD".equalsIgnoreCase(type)) {
                                    System.out.print("Enter ID: ");
                                    int id = scanner.nextInt();
                                    scanner.nextLine();  // Consume newline left-over

                                    System.out.print("Enter Title: ");
                                    String title = scanner.nextLine();

                                    System.out.print("Enter Category: ");
                                    String category = scanner.nextLine();

                                    System.out.print("Enter Cost: ");
                                    float cost = scanner.nextFloat();
                                    scanner.nextLine();  // Consume newline left-over

                                    System.out.print("Enter Artist: ");
                                    String artist = scanner.nextLine();

                                    System.out.print("Enter Length: ");
                                    int length = scanner.nextInt();
                                    scanner.nextLine();  // Consume newline left-over

                                    System.out.print("Enter Director: ");
                                    String director = scanner.nextLine();

                                    // Create the new CompactDisc object
                                    newMedia = new CompactDisc(artist, length , director, id, title, category, cost);

                                } else if ("DVD".equalsIgnoreCase(type)) {
                                    System.out.print("Enter Title: ");
                                    String title = scanner.nextLine();

                                    System.out.print("Enter Category: ");
                                    String category = scanner.nextLine();

																		System.out.print("Enter director: ");
                                    String director = scanner.nextLine();

                                    System.out.print("Enter Cost: ");
                                    float cost = scanner.nextFloat();
                                    scanner.nextLine();  // Consume newline left-over

                                    System.out.print("Enter Length: ");
                                    int length = scanner.nextInt();
                                    scanner.nextLine();  // Consume newline left-over

                                    // Create the new DigitalVideoDisc object
																		//	DigitalVideoDisc dvd = new DigitalVideoDisc("Haitet2014","Comedy","Quang Thang",14,14.55f);
                                    newMedia = new DigitalVideoDisc(title, category, director, length, cost);
                                } else if ("Book".equalsIgnoreCase(type)) {
                                    System.out.print("Enter ID, Title, Category, and Cost: ");

                                    System.out.print("Enter ID: ");
                                    int id = scanner.nextInt();
                                    scanner.nextLine();  // Consume newline left-over

                                    System.out.print("Enter Title: ");
                                    String title = scanner.nextLine();

                                    System.out.print("Enter Category: ");
                                    String category = scanner.nextLine();

                                    System.out.print("Enter Cost: ");
                                    float cost = scanner.nextFloat();
                                    scanner.nextLine();  // Consume newline left-over

                                    newMedia = new Book(id, title, category, cost);
                                }

                                if (newMedia != null) {
                                    store.addMedia(newMedia);
                                    System.out.println("Media added successfully!");
                                } else {
                                    System.out.println("Invalid media type.");
                                }
                                break;

                            case 2: // Remove media from store
                                System.out.println("Enter the title of the media to remove: ");
                                String titleToRemove = scanner.nextLine();
                                Media mediaToRemove = store.findMediaByTitle(titleToRemove);
                                if (mediaToRemove != null) {
                                    store.removeMedia(mediaToRemove);
                                    System.out.println("Media removed successfully!");
                                } else {
                                    System.out.println("Media not found in the store.");
                                }
                                break;

                            case 0: // Back to main menu
                                System.out.println("Returning to the main menu...");
                                break;

                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    } while (updateChoice != 0);
                    break;

                    case 3: // See current cart
                    int cartChoice;
                    do {
                        cartMenu();
                        cartChoice = scanner.nextInt();
                        CartMenuChoice(cartChoice, cart, scanner);
                    } while (cartChoice != 0);
                    break;
                

                case 0: // Exit
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
        

    }

    private static void CartMenuChoice(int cartChoice, Carts cart, Scanner scanner) {
        switch (cartChoice) {
            case 1:
                int filterCartMenu;
                do {
                    filterCartMenu();
                    filterCartMenu = scanner.nextInt();
                    switch (filterCartMenu) {
                        case 1:
                            System.out.println("Enter the ID:");
                            int id = scanner.nextInt();
                            cart.filterById(id);
                            break;
                        case 2:
                            System.out.println("Enter the title:");
                            scanner.nextLine(); // Consume leftover newline
                            String title = scanner.nextLine();
                            cart.filterByTitle(title);
                            break;
                        case 0:
                            System.out.println("Returning to cart menu...");
                            break;
                    }
                } while (filterCartMenu != 0);
                break;
            case 2:
                int sortCartMenu;
                do {
                    sortCartMenu();
                    sortCartMenu = scanner.nextInt();
                    switch (sortCartMenu) {
                        case 1:
                            System.out.println("Sorting by Title then Cost:");
                            Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
                            cart.printCart();
                            break;
                        case 2:
                            System.out.println("Sorting by Cost then Title:");
                            Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
                            cart.printCart();
                            break;
                        case 0:
                            System.out.println("Returning to cart menu...");
                            break;
                    }
                } while (sortCartMenu != 0);
                break;
            case 3:
                System.out.println("Enter the title to remove:");
                scanner.nextLine(); // Consume leftover newline
                String titleToRemove = scanner.nextLine();
                Media mediaToRemove = cart.findMediaByTitle(titleToRemove);
                if (mediaToRemove != null) {
                    cart.removeMedia(mediaToRemove);
                    System.out.println("Removed from cart.");
                } else {
                    System.out.println("Media not found in the cart.");
                }
                break;
            case 4:
                System.out.println("Enter the title to play:");
                scanner.nextLine(); // Consume leftover newline
                String titleToPlay = scanner.nextLine();
                Media mediaToPlay = cart.findMediaByTitle(titleToPlay);
                if (mediaToPlay != null && mediaToPlay instanceof Playable) {
                    ((Playable) mediaToPlay).play();
                } else if (mediaToPlay == null) {
                    System.out.println("Media not found in the cart.");
                } else {
                    System.out.println("The selected media is not playable.");
                }
                break;
            case 5:
                System.out.println("Placing order...");
                cart.emptyCart();
                break;
            case 0:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    

    public static void openStoreScreen() {
        storeScreen = new StoreScreen(store);
    }

    public static void closeStoreScreen() {
        storeScreen.setVisible(false);
        storeScreen = null;
    }

    public static void openCartScreen() {
        cartScreen = new CartScreen(cart);
    }

    public static void closeCartScreen() {
        cartScreen.setVisible(false);
        cartScreen = null;
    }

 


}
