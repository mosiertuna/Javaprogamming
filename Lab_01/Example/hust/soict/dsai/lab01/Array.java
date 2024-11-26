package hust.soict.dsai.lab01;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Nhập kích thước mảng
		System.out.println("Enter size of array:");
		int size = scanner.nextInt();
		double sum = 0;
		double[] array = new double[size];
		//Nhập dữ liệu mảng
		System.out.println("Enter elements of array:");
		for (int i = 0; i<size; i++) {
			array[i] = scanner.nextDouble();
			sum+=array[i];
		}
		
		Arrays.sort(array);
		double average = sum/size;
		
		System.out.println("The result of sorting array:");
		for (int i = 0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\nThe sum of array: " + sum);
		System.out.println("\nThe average of array: " + average);
		
	}
}
