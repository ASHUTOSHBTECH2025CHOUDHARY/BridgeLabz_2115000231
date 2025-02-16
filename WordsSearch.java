import java.util.Scanner;

public class WordsSearch {
    public static String searchLine(String[] lines, String key) {
        for (String line : lines) {
            if (line.contains(key)) {
                return line;
            }
        }
        return "No match found";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt(); // Number of lines
        scan.nextLine(); // Consume newline
        String[] lines = new String[count];

        for (int i = 0; i < count; i++) {
            lines[i] = scan.nextLine(); // Read input lines
        }

        String key = scan.nextLine(); // Search term
        scan.close();

        String match = searchLine(lines, key);
        System.out.println("Found: " + match);
    }
}

