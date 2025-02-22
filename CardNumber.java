import java.util.regex.*;

public class CardNumber {
    public static String checkCardType(String number) {
        String visaPattern = "^4[0-9]{15}$";
        String masterCardPattern = "^5[1-5][0-9]{14}$";
        if (Pattern.matches(visaPattern, number)) {
            return "Valid Visa Card";
        } else if (Pattern.matches(masterCardPattern, number)) {
            return "Valid MasterCard";
        }
        return "Invalid Card Number";
    }
    public static void main(String[] args) {
        String[] cards = { "4111111111111111", "5500000000000004" };
        for (String card : cards) {
            System.out.println(card + " -> " + checkCardType(card));
        }
    }
}

