import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataFormatter {
    public static String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format");
        }
    }

    public static void main(String[] args) {
        System.out.println(formatDate("2026-12-15"));
        try {
            System.out.println(formatDate("15-12-2026"));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}

class DateFormatterTest {
    @Test
    void testingValidDateFormat() {
        assertEquals("15-12-2026", DateFormatter.formatDate("2026-12-15"));
    }

    @Test
    void testingInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("15-12-2026"));
    }
}
