import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] values = new double[10];
        double sum = 0.0;
        int count = 0;

        System.out.println("You can input up to 10 positive numbers. Enter 0 or a negative value to stop.");

        while (true) {
            System.out.print("Enter a value: ");
            double input = scanner.nextDouble();

            if (input <= 0 || count == 10) {
                break;
            }

            values[count] = input;
            count++;
        }

        for (int i = 0; i < count; i++) {
            sum += values[i];
        }

        System.out.println("\nValues entered:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%.2f ", values[i]);
        }
        System.out.println("\nSum of values: " + sum);
    }
}
