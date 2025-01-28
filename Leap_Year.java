import java.util.Scanner;

public class Leap_Year {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is in the Gregorian calendar
        if (year < 1582) {
            System.out.println("Please enter a year >= 1582.");
            return false;
        }

        // Leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
