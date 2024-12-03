package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store() {
        this.itemsInStore = new ArrayList<Media>();
    }

    // Phương thức thêm Media vào cửa hàng
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Media \"" + media.getTitle() + "\" has been added to the store.");
    }

    // Phương thức xóa Media khỏi cửa hàng
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Media \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("Media \"" + media.getTitle() + "\" not found in the store.");
        }
    }
    
    // Phương thức kiểm tra Media
    public boolean checkMedia(Media media) {
        return itemsInStore.contains(media);
    }

    // Phương thức hiển thị danh sách Media
    public void listMedia() {
        System.out.println("***********************STORE***********************");
        System.out.println("Media List:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, itemsInStore.get(i).getTitle());
        }
        System.out.println("***************************************************");
    }
}
