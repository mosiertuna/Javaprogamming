package hust.soict.dsai.screen;
import hust.soict.dsai.Aims.cart.Carts.Carts;
import hust.soict.dsai.Aims.media.Book;
import hust.soict.dsai.Aims.media.CompactDisc;
import hust.soict.dsai.Aims.media.DigitalVideoDisc;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;
public class CartScreen extends JFrame {
    private Carts cart;

    public CartScreen(Carts cart) {
        super();
        this.cart = cart;
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setVisible(true);

        this.setSize(new Dimension(1024, 768));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/dsai/screen/cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart); // Pass the cart object
                    loader.setController(controller); // Set the controller programmatically
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    fxPanel.setScene(scene);


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public static void main(String[] args) {
        Carts cart = new Carts();
        // Compact Discs
        CompactDisc cd = new CompactDisc( "Yunomi's Vol4 CD", "Music", 10.99f, "Yunomi", 180, "Yunomi");
        CompactDisc cd1 = new CompactDisc( "Dung_dz", "Pop", 12.99f, "Aimer", 170, "Aimer");
        CompactDisc cd2 = new CompactDisc( "Nightcore Hits", "Remix", 8.99f, "Various Artists", 200, "Various");
        CompactDisc cd3 = new CompactDisc( "Jazz Vibes", "Jazz", 14.99f, "Norah Jones", 240, "Norah Jones");
        CompactDisc cd4 = new CompactDisc( "Epic Classics", "Classical", 9.99f, "Ludwig Orchestra", 120, "Beethoven");

// Digital Video Discs
        DigitalVideoDisc dvd = new DigitalVideoDisc( "Highlight MV", "Music", 11.99f, "Hatsune Miku", 123);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc( "Interstellar", "Sci-fi", 19.99f, "Christopher Nolan", 169);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc( "Inception", "Thriller", 17.99f, "Christopher Nolan", 148);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc( "Frozen 2", "Animation", 14.99f, "Disney", 103);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc( "The Matrix", "Action", 12.99f, "Lana Wachowski", 136);

// Books
        Book book = new Book("Dune Book", "Sci-fi", 9.99f);
        Book book1 = new Book("1984", "Dystopian", 8.99f);
        Book book2 = new Book("To Kill a Mockingbird", "Classic", 7.99f);
        Book book3 = new Book("The Hobbit", "Fantasy", 10.49f);
        Book book4 = new Book("The Catcher in the Rye", "Classic", 6.99f);

        Carts.addMedia(cd);
        Carts.addMedia(cd1);
        Carts.addMedia(cd2);
        Carts.addMedia(cd3);
        Carts.addMedia(cd4);

        Carts.addMedia(dvd);
        Carts.addMedia(dvd2);
        Carts.addMedia(dvd3);
        Carts.addMedia(dvd4);
        Carts.addMedia(dvd1);

        Carts.addMedia(book);
        Carts.addMedia(book1);
        Carts.addMedia(book2);
        Carts.addMedia(book3);
        Carts.addMedia(book4);

        new CartScreen(cart);
    }
}