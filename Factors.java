import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; // Index to keep track of the number of factors

        // Loop through numbers from 1 to the input number
        for (int i = 1; i <= number; i++) {
            // Check if 'i' is a factor of the input number
            if (number % i == 0) {
                // If the array is full, double its size
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    // Copy existing factors to the new array
                    for(int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                // Add the factor to the array and increment the index
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

