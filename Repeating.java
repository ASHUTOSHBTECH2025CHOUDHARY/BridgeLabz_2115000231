import java.util.regex.*;
import java.util.Set;
import java.util.HashSet;

public class Repeating{
    public static Set<String> findDuplicates(String text) {
        String regex = "\\b(\\w+)\\b(?:.*?\\b\\1\\b)";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        Set<String> result = new HashSet<>();
        while (matcher.find()) {
            result.add(matcher.group(1));
        }
        return result;
    }
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Set<String> words = findDuplicates(text);
        System.out.println(String.join(", ", words));
    }
}

