import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;
public class EmailExtract {
    public static List<String> extractEmails(String inputText) {
        String Regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern emailPattern = Pattern.compile(Regex);
        Matcher emailMatcher = emailPattern.matcher(inputText);
        List<String> extractedEmails = new ArrayList<>();
        while (emailMatcher.find()) {
            extractedEmails.add(emailMatcher.group());
        }
        return extractedEmails;
    }
    public static void main(String[] args) {
        List<String> emails=extractEmails("Contact us at support@example.com and info@company.org");
        for(String i:emails){
            System.out.println(i);
        }
    }
}
