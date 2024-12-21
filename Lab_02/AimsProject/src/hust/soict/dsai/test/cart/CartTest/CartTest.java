package hust.soict.dsai.test.cart.CartTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import hust.soict.dsai.Aims.cart.Carts.Carts;
import hust.soict.dsai.Aims.media.Book;
import hust.soict.dsai.Aims.media.CompactDisc;
import hust.soict.dsai.Aims.media.DigitalVideoDisc;
//import hust.soict.dsai.Aims.media.DigitalVideoDisc;
import hust.soict.dsai.Aims.media.Media;

public class CartTest {
  public static void main(String[] args) {
    // Create a new cart
    Carts cart = new Carts();

    // Create new dvd objects and add them to the cart
    //DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
    //cart.addDigitalVideoDisc(dvd1);

    //DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
    //cart.addDigitalVideoDisc(dvd2);

    //DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
    //cart.addDigitalVideoDisc(dvd3);

    // Test the print method
    cart.printCart(); 
    //polymophism
    List<Media> mediae = new ArrayList<Media>();

    //create some media here
    //dvd
    DigitalVideoDisc dvd = new DigitalVideoDisc(
                "Interstellar", "Science Fiction", "Christopher Nolan", 169, 19.99f);
    // CD
    CompactDisc cd = new CompactDisc(null, 0, null, 0, null, null, 0);
    cd.setTitle("Thriller");
    cd.setCategory("Music");
    cd.setArtist("Michael Jackson");
    cd.setCost(15.99f);
    // Book
    Book book = new Book();
    book.setTitle("To Kill a Mockingbird");
    book.setCategory("Novel");
    book.setCost(12.49f);
    book.addAuthor("Harper Lee");
    
    mediae.add(cd);
    mediae.add(dvd);
    mediae.add(book);
    for(Media m : mediae){
      System.out.println("VuQuangDung-20225818 - polymorphism!!!");
      System.out.println(m.toString());
    }

    // Print original list
    System.out.println("Original list:");
    for (Media media : mediae) {
        System.out.println(media.getTitle() + " - " + media.getCost());
    }

    // Sort by title then cost
    Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);
    System.out.println("\nSorted by Title, then Cost:");
    for (Media media : mediae) {
        System.out.println(media.getTitle() + " - " + media.getCost());
    }
    
    // Sort by cost then title
    Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);
    System.out.println("\nSorted by Cost, then Title:");
    for (Media media : mediae) {
        System.out.println(media.getTitle() + " - " + media.getCost());
    }



  }
}
