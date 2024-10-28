import java.util.Scanner;
public class SolveEquation {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option;
		while (true) {
			System.out.println("Choose type of equation you wanna solve\n"
					+ "1: Linear equation\n"
					+ "2: System equation\n"
					+ "3: Second-degree equation\n");
			option = scanner.nextInt();
			if(option == 1) {
				LinearEquation();
				break;
			}else if(option == 2) {
				SystemEquation();
				break;
			}else if (option == 3) {
				SecondDegreeEquation();
				break;
			} else {
				System.out.println("Choose 1 from 3!");
			}
		}
		
	}
	
	@SuppressWarnings("resource")
	private static void LinearEquation() {
		Scanner scanner1 = new Scanner(System.in);
		double A, B, C;
		System.out.println("Enter coefficients:");
		A = scanner1.nextDouble();
		B = scanner1.nextDouble();
		C = scanner1.nextDouble();
		
		if (A == 0) {
			if (B==C) {
				System.out.println("The equation has infinite solutions.");
			} else {
				System.out.println("The equation has no solution.");
			}
		} else {
			System.out.println("Solution of equation is" + (C-B)/A);
		}
	}
	
	@SuppressWarnings("resource")
	private static void SystemEquation() {
		Scanner scanner2 = new Scanner(System.in);
		double a11, a12, b1, b2, a21, a22;
		System.out.println("Enter coefficients of the first equation:");
		a11 = scanner2.nextDouble();
		a12 = scanner2.nextDouble();
		b1 = scanner2.nextDouble();
		System.out.println("Enter coefficients of the second equation:");
		a21 = scanner2.nextDouble();
		a22 = scanner2.nextDouble();
		b2 = scanner2.nextDouble();
		
		// Tính định thức D
        double d = a11 * a22 - a12 * a21;

        if (d == 0) {
            if (a11 * b2 - a21 * b1 == 0 && a12 * b2 - a22 * b1 == 0) {//D1=D2=0
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            // Sử dụng phương pháp thế để tìm nghiệm
            double x = (b1 * a22 - b2 * a12) / d;
            double y = (a11 * b2 - a21 * b1) / d;
            System.out.println("Nghiệm của hệ phương trình là: x = " + x + ", y = " + y);
        }
		
	}
	
	@SuppressWarnings("resource")
	private static void SecondDegreeEquation(){
		Scanner scanner3 = new Scanner(System.in);
		double a, b, c;
		System.out.println("Bao Phuc-Enter coefficients of the second equation:");
		a = scanner3.nextDouble();
		b = scanner3.nextDouble();
		c = scanner3.nextDouble();
		
		double delta = b*b-4*a*c;
		if ( delta == 0) {
			System.out.println("Phuong trinh co 1 nghiem duy nhat: " + (-b)/(2*a));
		} else if (delta < 0) {
			System.out.println("Phuong trinh khong co nghiem thuc.");
		} else {
			System.out.println("Phuong trinh co 2 nghiem phan biet.\n"
					+ "Nghiem thu nhat: " + (-b - Math.sqrt(delta))/(2*a) + "\n"
					+ "Nghiem thu hai: " + (-b + Math.sqrt(delta))/(2*a) + "\n");		
		}
	}

	
}

