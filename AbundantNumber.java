import java.util.Scanner;

public class AbundantNumber {
    public static void main(String [] args){
        // Create a Scanner
        Scanner sc = new Scanner(System.in);

        //integer input from the user
        int number = sc.nextInt();

        // Initialize a variable the sum of the divisors of the number
        int sum = 0;

        // Loop through all integer to find divisors
        for(int i = 1; i < number; i++) { // Changed `i=0` to `i=1` to prevent division by zero
            // Check if 'i' is a divisor of 'number'
            if(number % i == 0) {
                // Add the divisor to the sum
                sum += i;
            }
        }

        // Check if the sum of the divisors is greater tahan the number itself
        if(sum > number) {
            // If true, the number is an abundant number
            System.out.println("It is a Abundant number");
        } else {
            // Otherwise, the number is not an abundant number
            System.out.println("It is not a Abundant number");
        }
    }
}
