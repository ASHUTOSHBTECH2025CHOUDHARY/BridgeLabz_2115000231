import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateUpdater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LocalDate inputDate = LocalDate.parse(input.next());

        LocalDate newDate = inputDate.plusYears(2).plusMonths(1).plusDays(7).minusWeeks(3);

        System.out.println(newDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        input.close();
    }
}

