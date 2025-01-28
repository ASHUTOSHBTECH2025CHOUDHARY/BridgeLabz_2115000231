import java.util.Scanner;

public class Number_Analyss {

    // Method to check if a number is positive or negative
    public boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number_Analyss analyzer = new Number_Analyss();
        // Array to store 5 numbers
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        // Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (analyzer.isPositive(currentNumber)) {
                System.out.print("Number " + currentNumber + " is positive and ");
                if (analyzer.isEven(currentNumber)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number " + currentNumber + " is negative.");
            }
        }
        // Compare the first and last elements of the array
        int comparisonResult = analyzer.compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number (" + numbers[0] + ") is greater than the last number (" + numbers[numbers.length - 1] + ").");
        } else if (comparisonResult == 0) {
            System.out.println("The first number (" + numbers[0] + ") is equal to the last number (" + numbers[numbers.length - 1] + ").");
        } else {
            System.out.println("The first number (" + numbers[0] + ") is less than the last number (" + numbers[numbers.length - 1] + ").");
        }
    }
}
