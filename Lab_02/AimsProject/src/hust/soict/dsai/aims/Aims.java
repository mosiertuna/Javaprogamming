package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        // Thêm một số media vào store
        addMediaToStore();

        // Hiển thị menu chính
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("AIMS:");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3 ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    storeMenu();
                    break;
                case 2:
                    updateStoreMenu();
                    break;
                case 3:
                    cartMenu();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    public static void storeMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Options:");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3-4 ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

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
                    cart.print();
                    break;
                case 0:
                    System.out.println("Back to main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

    @SuppressWarnings("resource")
	private static void seeMediaDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();

        Media media = store.findMediaByTitle(title);
        if (media == null) {
            System.out.println("Media not found.");
            return;
        }

        System.out.println(media);

        mediaDetailsMenu(media);
        scanner.close();
    }

    private static void mediaDetailsMenu(Media media) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Options:");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2 ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    cart.addMedia(media);
                    System.out.println("Added " + media.getTitle() + " to cart.");
                    break;
                case 2:
                    if (media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("This media cannot be played.");
                    }
                    break;
                case 0:
                    System.out.println("Back to store menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

    @SuppressWarnings("resource")
	private static void addMediaToCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();

        Media media = store.findMediaByTitle(title);
        if (media == null) {
            System.out.println("Media not found.");
            return;
        }

        cart.addMedia(media);
        System.out.println("Added " + media.getTitle() + " to cart.");

        if (media instanceof DigitalVideoDisc) {
            System.out.println("Number of DVDs in cart: " + cart.getItemsOrdered());
        }
        scanner.close();
    }

    private static void playMedia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();

        Media media = store.findMediaByTitle(title);
        if (media == null) {
            System.out.println("Media not found.");
            return;
        }

        if (media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("This media cannot be played.");
        }
    }

    private static void updateStoreMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Options:");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media");
            System.out.println("2. Remove a media");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2 ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                case 0:
                    System.out.println("Back to main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void cartMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Options:");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3-4-5 ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    filterMediaInCart();
                    break;
                case 2:
                    sortMediaInCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMediaInCart();
                    break;
                case 5:
                    placeOrder();
                    break;
                case 0:
                    System.out.println("Back to main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void filterMediaInCart() {
        // Implement the logic to filter media in the cart
    }

    private static void sortMediaInCart() {
        // Implement the logic to sort media in the cart
    }

    @SuppressWarnings("resource")
	private static void removeMediaFromCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the media to remove: ");
        String title = scanner.nextLine();

        Media media = cart.findMediaByTitle(title);
        if (media == null) {
            System.out.println("Media not found in the cart.");
            return;
        }

        cart.removeMedia(media);
        System.out.println("Removed " + media.getTitle() + " from the cart.");
        scanner.close();
    }

    @SuppressWarnings("resource")
	private static void playMediaInCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the media to play: ");
        String title = scanner.nextLine();

        Media media = cart.findMediaByTitle(title);
        if (media == null) {
            System.out.println("Media not found in the cart.");
            return;
        }

        if (media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("This media cannot be played.");
        }
        scanner.close();
    }

    private static void placeOrder() {
        System.out.println("Order created. Cart is now empty.");
        cart.getItemsOrdered().clear();
    }

    private static void addMediaToStore() {
        // Implement the logic to add media to the store
    }

    private static void removeMediaFromStore() {
        // Implement the logic to remove media from the store
    }
}
