import java.util.Scanner;

public class DivisorCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int dividend = input.nextInt();
            int divisor = input.nextInt();
            int quotient = dividend / divisor;
            System.out.println(quotient);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } finally {
            System.out.println("The operation completed.");
        }
    }
}