import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (character >= 'a' && character <= 'z') {
                result += (char) (character - 'a' + 'A');
            } else if (character >= 'A' && character <= 'Z') {
                result += (char) (character - 'A' + 'a');
            } else {
                result += character;
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Converted String: " + result);
    }
}