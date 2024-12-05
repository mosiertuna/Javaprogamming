package hust.soict.dsai.test.store.StoreTest;

import hust.soict.dsai.aims.media.CD;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
        Store store = new Store();

        store.addMedia(new DigitalVideoDisc("The Matrix", "Science Fiction", 19.95f, "Lana Wachowski, Lilly Wachowski", 136));
        store.addMedia(new CD("Thriller", "Pop", 14.95f, "Michael Jackson",135));

        store.print();
        store.removeMedia(new DigitalVideoDisc("The Matrix", "Science Fiction", 19.95f, "Lana Wachowski, Lilly Wachowski", 136));
        store.print();
    }
}
