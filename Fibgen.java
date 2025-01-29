import java.util.Scanner;

public class Fibgen {

    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first + " " + second);

        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();

        if (terms < 2) {
            System.out.println("Please enter a number greater than or equal to 2.");
        } else {
            generateFibonacci(terms);
        }
    }
}
