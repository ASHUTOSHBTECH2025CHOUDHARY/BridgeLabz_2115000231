import java.util.List;
import java.util.Arrays;

public class Text {

    public static String censor(String inputText, List<String> forbiddenWords) {
        for (String word : forbiddenWords) {
            String mask = "*".repeat(word.length());
            inputText = inputText.replaceAll("(?i)\\b" + word + "\\b", mask);
        }
        return inputText;
    }
    public static void main(String[] args) {
        String Text = "This is a damn bad example with some stupid words.";
        List<String> bannedWords = Arrays.asList("damn", "stupid");
        String censored= censor(Text, bannedWords);
        System.out.println(censored);
    }
}