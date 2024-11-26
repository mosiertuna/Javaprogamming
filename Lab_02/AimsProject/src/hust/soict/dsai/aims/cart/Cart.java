package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    private DigitalVideoDisc[] items;
    private int qtyOrdered;
    private static final int MAX_ITEMS = 10; // Giới hạn số lượng DVD trong giỏ

    public Cart() {
        items = new DigitalVideoDisc[MAX_ITEMS];
        qtyOrdered = 0;
    }

    // Phương thức thêm DVD vào giỏ
    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_ITEMS) {
            items[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
            return 1;
        } else {
            System.out.println("The cart is almost full.");
            return 0;
        }
    }
    // Phương thức thêm mảng DVD
    public int addDigitalVideoDisc(DigitalVideoDisc[] dvdArray) {
        int addCount = 0;
        for (DigitalVideoDisc disc : dvdArray) {
            if (qtyOrdered == MAX_ITEMS) {
                System.out.println("The cart is almost full. Can't add more discs");
                break;
            } else {
                items[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The DVD " + disc.getTitle() + " has been added!");
                addCount++;
            }
        }
        return addCount;
    }
    
    // Hàm thêm 2 đĩa
    public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 1 >= MAX_ITEMS) {
            System.out.println("The cart is almost full. Can't add more discs");
            return 0;
        } else {
            items[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The DVD " + dvd1.getTitle() + " has been added!");

            items[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The DVD " + dvd2.getTitle() + " has been added!");

            return 2; // Đã thêm 2 đĩa DVD
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
    
    //Phương thức print(_)
    public void print() {
        StringBuilder output = new StringBuilder();
        output.append("***********************CART***********************\n");
        output.append("Ordered Items:\n");

        for (int i = 0; i < items.length; i++) {
            DigitalVideoDisc item = items[i];
            if (item != null) {
                output.append(String.format("%d. %s\n", i + 1, item));
            }
        }

        output.append(String.format("Total cost: $%.2f\n", totalCost()));
        output.append("***************************************************");
        System.out.println(output.toString());
    }


}
    
        
