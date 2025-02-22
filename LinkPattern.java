import java.util.regex.*;
import java.util.*;

public class LinkPattern {
    public static List<String> extractLinks(String text) {
        List<String> links = new ArrayList<>();
        String pattern = "\\bhttps?://\\S+\\b"; // Detects URLs

        Matcher matcher = Pattern.compile(pattern).matcher(text);
        while (matcher.find()) {
            links.add(matcher.group()); // Add found URLs
        }

        return links;
    }

    public static void main(String[] args) {
        String input = "Check https://example.com and http://site.org for details.";
        System.out.println(extractLinks(input)); // Print extracted URLs
    }
}

