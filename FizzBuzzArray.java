import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String [] args){
        // Read input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Create array
        String[] fizzbuzz = new String[number + 1];

        // Fill array
        for (int i = 1; i < fizzbuzz.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzz[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzbuzz[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzbuzz[i] = "Buzz";
            }
        }

        // Print results
        for (int i = 1; i < fizzbuzz.length; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("Position " + i + " = " + fizzbuzz[i]);
            }
            System.out.println("Position " + i + " = " + i);
        }
    }
}
