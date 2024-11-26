package aims;

public class StoreTest {
	public static void main(String[] args) {
		// Create a new store
        Store store = new Store();

        // Create some new DVDs and add them to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        store.addDVD(dvd3);

        // Check if DVDs are in the store
        System.out.println("DVD \"The Lion King\" is in the store: " + store.checkDVD(dvd1));
        System.out.println("DVD \"Star Wars\" is in the store: " + store.checkDVD(dvd2));
        System.out.println("DVD \"The Matrix\" is in the store: " + store.checkDVD(new DigitalVideoDisc("The Matrix", "Action", "Lana Wachowski", 136, 19.95f)));

        // Remove a DVD from the store
        store.removeDVD(dvd2);

        // Check if DVD is still in the store
        System.out.println("DVD \"Star Wars\" is in the store: " + store.checkDVD(dvd2));

        // List all DVDs in the store
        store.listDVD();
    }
}
