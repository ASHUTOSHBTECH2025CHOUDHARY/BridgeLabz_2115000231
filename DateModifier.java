import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(scanner.next());

        LocalDate modifiedDate = date.plusYears(2).plusMonths(1).plusDays(7).minusWeeks(3);

        System.out.println("Updated Date: " + modifiedDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        scanner.close();
    }
}

