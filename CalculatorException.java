import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorException {
    public static void main(String[] args) {
        //Input Reader
        Scanner inputReader = new Scanner(System.in);
        // trycatch
        try {
            double dividend = inputReader.nextDouble();
            double divisor = inputReader.nextDouble();

            if (divisor == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                double quotient = dividend / divisor;
                System.out.println("Result " + quotient);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid numeric value.");
        }
    }
}
