package hust.soict.dsai.lab01;
import java.util.Scanner;
public class CreateTriangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//input n
		int n = keyboard.nextInt();
		//draw triangle with n height
		for (int i = 0; i<n; i++) {
			for(int j = 0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}

}
