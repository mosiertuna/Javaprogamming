package hust.soict.dsai.test.cart.CartTest;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.CD;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class CartTest {

	public static void main(String[] args) {
		Store store = new Store();
        Cart cart = new Cart();

        store.addMedia(new DigitalVideoDisc("The Matrix", "Science Fiction", 19.95f, "Lana Wachowski, Lilly Wachowski", 136));
        store.addMedia(new CD("Thriller", "Pop", 14.95f, "Michael Jackson",135));

        cart.addMedia(store.getItemsInStore().get(0));
        cart.addMedia(store.getItemsInStore().get(1)); 

        cart.print();
        System.out.println("Total cost: " + cart.totalCost());

        cart.removeMedia(store.getItemsInStore().get(0));
        cart.print();

	}

}
