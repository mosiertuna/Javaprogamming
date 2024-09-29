import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for (int i = 1; i <= n; i++) {
            // in khoảng trắng
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // in sao
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        keyboard.close();
    }
}