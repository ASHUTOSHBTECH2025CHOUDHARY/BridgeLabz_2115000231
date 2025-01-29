import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime timeInGMT = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime timeInIST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime timeInPST = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in GMT: " + timeInGMT.format(timeFormat));
        System.out.println("Current Time in IST: " + timeInIST.format(timeFormat));
        System.out.println("Current Time in PST: " + timeInPST.format(timeFormat));
    }
}
