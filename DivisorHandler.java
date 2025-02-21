import java.util.Scanner;


public class DivisorHandler {
    public static void main(String[] args) {
        //Taking input and initializing array
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {5, 15, 25, 35, 45};
        int index = scanner.nextInt();
        int divisor = scanner.nextInt();
        // nested try-catch
        try {
            int value = numbers[index];
            try {
                int result = value / divisor;
                System.out.println( result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        } finally {
            System.out.println("Process completed.");
        }

        scanner.close();
    }
}
