package hust.soict.dsai.lab01;
import java.util.Scanner;
public class Add_Two_Matrices {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter rows of matric:");
		int row = scanner.nextInt();
		System.out.println("Enter columns of matric:");
		int column = scanner.nextInt();
		
		int[][] matrixA = new int[row][column];
		int[][] matrixB = new int[row][column];
		int[][] matrixC = new int[row][column];
		//Nhap du lieu cho ma tran A
		System.out.println("Enter matrixA:");
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<column; j++) {
				matrixA[i][j] = scanner.nextInt();
			}
		}
		//Nhap du lieu cho ma tran B
		System.out.println("Enter matrixB:");
		for(int i = 0; i<row; i++) {
			for (int j = 0; j<column; j++) {
				matrixB[i][j] = scanner.nextInt();
			}
		}
		
		//Cong tung phan tu 2 ma tran 
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<column; j++) {
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
		//Hien thi ket qua ma tran C
		System.out.println("MatrixC:");
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<column; j++) {
				System.out.print(matrixC[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
