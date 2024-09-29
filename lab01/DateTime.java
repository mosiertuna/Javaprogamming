import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, year;

        while (true) {
            System.out.print("Enter month (1-12): ");
            month = scanner.nextInt();
            System.out.print("Enter year: ");
            year = scanner.nextInt();

            if (month >= 1 && month <= 12 && year > 0) {
                int days = getDaysInMonth(month, year);
                System.out.println("Number of days: " + days);
                break;
            } else {
                System.out.println("Invalid month or year. Please try again.");
            }
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; // This case will never be reached due to input validation
        }
    }
}