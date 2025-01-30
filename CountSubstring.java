import java.util.Scanner;

public class CountSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String pattern = input.nextLine();
        int matchCount = 0;
        int patternLength = pattern.length();

        for (int i = 0; i <= text.length() - patternLength; i++) {
            if (text.startsWith(pattern, i)) {
                matchCount++;
            }
        }

        System.out.println("The substring appears: " + matchCount + " times");
    }
}