package hust.soict.dsai.aims.Aims;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CD;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.media.books;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
	private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	
		// Sample media items for the store
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", 19.95f, "Roger Allers", 87));
        store.addMedia(new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, "George Lucas", 124));
        store.addMedia(new DigitalVideoDisc("The Matrix", "Science Fiction", 19.95f, "Lana Wachowski, Lilly Wachowski", 136));
        store.addMedia(new DigitalVideoDisc("Gladiator", "Action", 18.95f, "Ridley Scott", 155));
        store.addMedia(new DigitalVideoDisc("Interstellar", "Science Fiction", 21.95f, "Christopher Nolan", 169));
        store.addMedia(new DigitalVideoDisc("Pulp Fiction", "Crime", 19.95f, "Quentin Tarantino", 154));
        store.addMedia(new CD("The Dark Side of the Moon", "Progressive Rock", 17.95f, "Pink Floyd",2212));
        store.addMedia(new CD("Hotel California", "Rock", 15.95f, "Eagles",442));
        store.addMedia(new CD("Thriller", "Pop", 14.95f, "Michael Jackson",3131));
        store.addMedia(new CD("Rumours", "Rock", 16.95f, "Fleetwood Mac",22));
        store.addMedia(new CD("Born to Run", "Rock", 14.95f, "Bruce Springsteen",213));
        store.addMedia(new books("Pride and Prejudice", "Romance", 12.99f));
        store.addMedia(new books("Moby-Dick", "Adventure", 15.99f));
        store.addMedia(new books("Harry Potter", "Fantasy", 29.99f));
        store.addMedia(new books("To Kill a Mockingbird", "Classic", 14.99f));
        store.addMedia(new books("The Great Gatsby", "Classic", 13.99f));

        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3\n");
        System.out.print("Enter option: ");
    }

    public static void viewStore() {
        store.print();
        int choice;
        do {
            storeMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                	seeCurrentCart();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media' details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4\n");
        System.out.print("Enter option: ");
    }

    public static void seeMediaDetails() {
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();
        for (Media media : store.getItemsInStore()) {
            if (media.isMatch(title)) {
                System.out.println(media);
                mediaDetailsMenu(media);
                return;
            }
        }
        System.out.println("Media not found.");
    }

    public static void mediaDetailsMenu(Media media) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if (media instanceof Playable) {
            System.out.println("2. Play");
        }
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2\n");
        System.out.print("Enter option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                cart.addMedia(media);
                break;
            case 2:
                if (media instanceof Playable) {
                    ((Playable) media).play();
                } else {
                    System.out.println("This media cannot be played.");
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void addMediaToCart() {
        System.out.print("Enter the title of the media to add to cart: ");
        String title = scanner.nextLine();
        for (Media media : store.getItemsInStore()) {
            if (media.isMatch(title)) {
                cart.addMedia(media);
                return;
            }
        }
        System.out.println("Media not found in the store.");
    }

    public static void playMedia() {
        System.out.print("Enter the title of the media to play: ");
        String title = scanner.nextLine();
        for (Media media : store.getItemsInStore()) {
            if (media.isMatch(title)) {
                if (media instanceof Playable) {
                    ((Playable) media).play();
                    return;
                } else {
                    System.out.println("This media cannot be played.");
                    return;
                }
            }
        }
        System.out.println("Media not found in the cart or cannot be played.");
    }

    public static void updateStore() {
        System.out.println("Update Store Menu:");
        System.out.println("1. Add Media");
        System.out.println("2. Remove Media");
        System.out.print("Please choose an option (1-2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                // Adding Media
                System.out.print("Enter media type (DVD/CD/Book): ");
                String mediaType = scanner.nextLine();
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Enter category: ");
                String category = scanner.nextLine();
                System.out.print("Enter cost: ");
                float cost = scanner.nextFloat();
                scanner.nextLine(); // Consume newline

                Media media = null;

                switch (mediaType.toLowerCase()) {
                    case "dvd":
                        System.out.print("Enter director: ");
                        String director = scanner.nextLine();
                        System.out.print("Enter length (in minutes): ");
                        int length = scanner.nextInt();
                        media = new DigitalVideoDisc(title, category, cost, director, length);
                        break;
                    case "cd":
                        System.out.print("Enter artist: ");
                        String artist = scanner.nextLine();
                        System.out.print("Enter length (in minutes): ");
                        int length1 = scanner.nextInt();
                        media = new CD(title, category, cost, artist, length1);
                        break;
                    case "book":
                        media = new books(title, category, cost);
                        break;
                    default:
                        System.out.println("Invalid media type.");
                        return;
                }

                store.addMedia(media);
                break;

            case 2:
                // Removing Media
                System.out.print("Enter the title of the media to remove: ");
                String title0 = scanner.nextLine();
                removeMediaByTitle(title0);
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void removeMediaByTitle(String title) {
        Media mediaToRemove = null;

        for (Media media : store.getItemsInStore()) {
            if (media.isMatch(title)) {
                mediaToRemove = media;
                break;
            }
        }

        if (mediaToRemove != null) {
            store.removeMedia(mediaToRemove);
        } else {
            System.out.println("Media with title '" + title + "' not found in the store.");
        }
    }

    public static void seeCurrentCart() {
        cart.print();
        int choice;
        do {
            cartMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    filterMediasInCart();
                    break;
                case 2:
                    sortMediasInCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMedia();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
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
        System.out.print("Please choose a number: 0-1-2-3-4-5\n");
        System.out.print("Enter option: ");
    }

    public static void filterMediasInCart() {
        System.out.println("Filter by: ");
        System.out.println("1. By ID");
        System.out.println("2. By Title");
        System.out.print("Please choose a number: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter the ID to filter: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                boolean foundById = false;
                for (Media media : cart.getItemsOrdered()) {
                    if (media.getId() == id) {
                        media.print();
                        foundById = true;
                    }
                }
                if (!foundById) {
                    System.out.println("No media found with ID: " + id);
                }
                break;
            case 2:
                System.out.print("Enter the title to filter: ");
                String title = scanner.nextLine();
                boolean foundByTitle = false;
                for (Media media : cart.getItemsOrdered()) {
                    if (media.isMatch(title)) {
                        media.print();
                        foundByTitle = true;
                    }
                }
                if (!foundByTitle) {
                    System.out.println("No media found with title: " + title);
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void sortMediasInCart() {
        System.out.println("Sort by: ");
        System.out.println("1. By Title");
        System.out.println("2. By Cost");
        System.out.print("Please choose a number: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                cart.sortCartByTitle();
                cart.print();
                break;
            case 2:
                cart.sortCartByCost();
                cart.print();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void removeMediaFromCart() {
        System.out.print("Enter the title of the media to remove from cart: ");
        String title = scanner.nextLine();
        Media mediaToRemove = null;

        for (Media media : cart.getItemsOrdered()) {
            if (media.isMatch(title)) {
                mediaToRemove = media;
                break;
            }
        }

        if (mediaToRemove != null) {
            cart.removeMedia(mediaToRemove);
        } else {
            System.out.println("Media with title '" + title + "' not found in the cart.");
        }
    }
    public static void placeOrder() {
        if (cart == null || cart.getItemsOrdered().isEmpty()) {
            System.out.println("No items in the cart to place an order.");
        } else {
            System.out.println("Order has been placed.");
            cart.clear();  // Clear the cart after placing the order
        }
    }
}
	