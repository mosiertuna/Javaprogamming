package hust.soict.dsai.lab01;
import java.util.Scanner;

public class Calculate_Day_Of_Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        String yearInput;
        int year;

        // Check valid month input
        while (true) {
            System.out.println("Enter month you wanna know (full, abbreviation, number): ");
            monthInput = scanner.nextLine().trim();
            if (checkValidMonth(monthInput)) {
                break;
            } else {
                System.out.println("Invalid month. Enter again! ");
            }
        }

        // Check valid year input
        while (true) {
            System.out.println("Enter year you wanna know (xxxx): ");
            yearInput = scanner.nextLine().trim();
            if (yearInput.matches("\\d{4}")) {
                year = Integer.parseInt(yearInput);
                break;
            } else {
                System.out.println("Invalid year. Enter again!");
            }
        }

        // Get the number of days in the month
        int dayOfMonth = getDaysOfMonth(monthInput, year);
        System.out.println("The number of days in " + monthInput + " in " + year + " is: " + dayOfMonth);
    }

    // Valid month check
    private static boolean checkValidMonth(String month) {
        String[] validMonths = {
            "January", "Jan", "Jan.", "1",
            "February", "Feb", "Feb.", "2",
            "March", "Mar", "Mar.", "3",
            "April", "Apr", "Apr.", "4",
            "May", "5",
            "June", "Jun", "Jun.", "6",
            "July", "Jul", "Jul.", "7",
            "August", "Aug", "Aug.", "8",
            "September", "Sep", "Sep.", "9",
            "October", "Oct", "Oct.", "10",
            "November", "Nov", "Nov.", "11",
            "December", "Dec", "Dec.", "12"
        };
        // Check if month input is in validMonths
        for (String validMonth : validMonths) {
            if (validMonth.equalsIgnoreCase(month)) {
                return true;
            }
        }
        return false;
    }

    // Check leap year
    private static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get days of the month
    private static int getDaysOfMonth(String month, int year) {
        switch (month) {
            case "January":
            case "Jan":
            case "Jan.":
            case "1":
                return 31;
            case "February":
            case "Feb":
            case "Feb.":
            case "2":
                return checkLeapYear(year) ? 29 : 28;
            case "March":
            case "Mar":
            case "Mar.":
            case "3":
                return 31;
            case "April":
            case "Apr":
            case "Apr.":
            case "4":
                return 30;
            case "May":
            case "5":
                return 31;
            case "June":
            case "Jun":
            case "Jun.":
            case "6":
                return 30;
            case "July":
            case "Jul":
            case "Jul.":
            case "7":
                return 31;
            case "August":
            case "Aug":
            case "Aug.":
            case "8":
                return 31;
            case "September":
            case "Sep":
            case "Sep.":
            case "9":
                return 30;
            case "October":
            case "Oct":
            case "Oct.":
            case "10":
                return 31;
            case "November":
            case "Nov":
            case "Nov.":
            case "11":
                return 30;
            case "December":
            case "Dec":
            case "Dec.":
            case "12":
                return 31;
            default:
                return 0; 
        }
    }
}
