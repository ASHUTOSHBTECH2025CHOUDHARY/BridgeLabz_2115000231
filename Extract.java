import java.util.regex.*;
import java.util.*;

public class Extract {

    public static List<String> getLang(String text) {
        String pattern = "\\b(JavaScript|Java|Python|C\\+\\+|C|Go|Ruby|Swift|Kotlin|PHP)\\b";
        Pattern regex = Pattern.compile(pattern);
        Matcher match = regex.matcher(text);

        List<String> languages = new ArrayList<>();
        while (match.find()) {
            languages.add(match.group());
        }
        return languages;
    }

    public static void main(String[] args) {
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> result = getLang(input);
        System.out.println(result);
    }
}
