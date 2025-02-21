import java.io.*;

public class Interset {
    public static double computeInterest(double principal, double interestRate, int timePeriod) throws IllegalArgumentException {
        if (principal < 0 || interestRate < 0) {
            throw new IllegalArgumentException("Principal and interest rate must be positive values.");
        }
        return (principal * interestRate * timePeriod) / 100;
    }

    public static void main(String[] args) {
        try {
            double result = computeInterest(1500, 4.5, 5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
