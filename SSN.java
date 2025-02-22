import java.util.regex.*;

public class SSN{
    // Checks if SSN is valid
    public static boolean checkSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
    }
    public static void main(String[] args) {
        String ssn1 = "123-45-6789";
        String ssn2 = "123456789";
        // Print validation results
        System.out.println(ssn1 + " is " + (checkSSN(ssn1) ? "valid" : "invalid"));
        System.out.println(ssn2 + " is " + (checkSSN(ssn2) ? "valid" : "invalid"));
    }
}