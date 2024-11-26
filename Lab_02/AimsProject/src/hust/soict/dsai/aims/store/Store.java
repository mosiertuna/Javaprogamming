package aims;

public class Store {
	 private DigitalVideoDisc[] itemsInStore;
	    private int nbDVDs;

	    public Store() {
	        this.itemsInStore = new DigitalVideoDisc[100];
	        this.nbDVDs = 0;
	    }

	    public void addDVD(DigitalVideoDisc dvd) {
	        if (nbDVDs < itemsInStore.length) {
	            itemsInStore[nbDVDs++] = dvd;
	            System.out.println("DVD \"" + dvd.getTitle() + "\" has been added to the store.");
	        } else {
	            System.out.println("Cannot add DVD \"" + dvd.getTitle() + "\". Store is full.");
	        }
	    }

	    public void removeDVD(DigitalVideoDisc dvd) {
	        boolean found = false;
	        for (int i = 0; i < nbDVDs; i++) {
	            if (itemsInStore[i] != null && itemsInStore[i].equals(dvd)) {
	                for (int j = i; j < nbDVDs - 1; j++) {
	                    itemsInStore[j] = itemsInStore[j + 1];
	                }
	                itemsInStore[nbDVDs - 1] = null;
	                nbDVDs--;
	                System.out.println("DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("DVD \"" + dvd.getTitle() + "\" not found in the store.");
	        }
	    }
	    
	    public boolean checkDVD(DigitalVideoDisc dvd) {
	        for (int i = 0; i < nbDVDs; i++) {
	            if (itemsInStore[i] != null && itemsInStore[i].equals(dvd)) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public void listDVD() {
	        System.out.println("***********************STORE***********************");
	        System.out.println("DVD List:");
	        for (int i = 0; i < nbDVDs; i++) {
	            if (itemsInStore[i] != null) {
	                System.out.printf("%d. %s\n", i + 1, itemsInStore[i].getTitle());
	            }
	        }
	        System.out.println("***************************************************");
	    }
	    
	    
}
