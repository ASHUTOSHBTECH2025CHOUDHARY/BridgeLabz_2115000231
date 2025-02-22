import java.util.regex.*;
import java.util.*;

public class CapitalWords {
    public static List<String> extractCapitalizedWords(String text) {
        List<String> words = new ArrayList<>();
        String pattern = "\\b[A-Z][a-z]*\\b"; // Match capitalized

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            words.add(matcher.group()); // Add found word
        }

        return words;
    }

    public static void main(String[] args) {
        List<String> words = extractCapitalizedWords("The Eiffel Tower is in Paris and the Statue of Liberty is in New York.");

        System.out.println(words); // Print result
    }
}

