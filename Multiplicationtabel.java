import java.util.Scanner;

public class Multiplicationtabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to generate its multiplication table (6 to 9): ");
        int num = input.nextInt();

        int[] results = new int[4]; // To store products for the range 6 to 9

        for (int j = 0; j < results.length; j++) {
            results[j] = num * (6 + j); // Store the result for each multiplication
        }

        System.out.println("Multiplication table for " + num + " from 6 to 9:");
        for (int k = 0; k < results.length; k++) {
            System.out.println(num + " x " + (6 + k) + " = " + results[k]);
        }
    }
}
