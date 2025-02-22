import java.util.regex.*;
import java.util.*;

public class Dates {
    public static List<String> getDates(String input) {
        List<String> result = new ArrayList<>();
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b"; // Pattern for dates

        Matcher match = Pattern.compile(regex).matcher(input);
        while (match.find()) {
            result.add(match.group()); // Store matches
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "Dates include 12/05/2023, 15/08/2024, and 29/02/2020.";
        System.out.println(getDates(text)); // Display output
    }
}

