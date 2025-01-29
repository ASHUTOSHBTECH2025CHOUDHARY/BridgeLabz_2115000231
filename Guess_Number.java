import java.util.Random;
import java.util.Scanner;

public class Guess_Number{
    public static int g(int l, int h) {
        Random r = new Random();
        return r.nextInt(h - l + 1) + l;
    }
    public static String f(int g) {
        Scanner s = new Scanner(System.in);
        System.out.println("Is the number " + g + "? (Enter 'high', 'low', or 'correct')");
        return s.nextLine().toLowerCase();
    }
    public static void p() {
        int l = 1, h = 100;
        int g = 0;
        String f = "";
        while (!f.equals("correct")) {
            g = g(l, h);
            f = f(g);

            if (f.equals("high")) {
                h = g - 1;
            } else if (f.equals("low")) {
                l = g + 1;
            } else if (f.equals("correct")) {
                System.out.println("The computer guessed your number: " + g + "!");
            } else {
                System.out.println("Invalid feedback! Please enter 'high', 'low', or 'correct'.");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        p();
    }
}

