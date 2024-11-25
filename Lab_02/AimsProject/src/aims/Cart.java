package aims;

public class Cart {
    private DigitalVideoDisc[] items;
    private int qtyOrdered;
    private static final int MAX_ITEMS = 10; // Giới hạn số lượng DVD trong giỏ

    public Cart() {
        items = new DigitalVideoDisc[MAX_ITEMS];
        qtyOrdered = 0;
    }

    // Phương thức thêm DVD vào giỏ
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_ITEMS) {
            items[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    // Phương thức xóa DVD khỏi giỏ
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i].getTitle().equals(disc.getTitle())) {
                // Di chuyển phần tử cuối cùng đến vị trí bị xóa
                items[i] = items[qtyOrdered - 1];
                items[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" is not found in the cart.");
    }

    // Phương thức tính tổng chi phí
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += items[i].getCost();
        }
        return total;
    }

    // Phương thức hiển thị thông tin giỏ hàng
    public void displayCart() {
        System.out.println("Current items in the cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("- " + items[i].getTitle() + ": $" + items[i].getCost());
        }
        System.out.println("Total cost: $" + totalCost());
    }
}
