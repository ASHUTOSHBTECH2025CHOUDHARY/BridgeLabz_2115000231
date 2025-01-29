import java.time.LocalDate;
import java.util.Scanner;

public class DateComparision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate firstDate = LocalDate.parse(input.next());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate secondDate = LocalDate.parse(input.next());

        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is earlier.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is later.");
        } else {
            System.out.println("Both dates are identical.");
        }

        input.close();
    }
}

