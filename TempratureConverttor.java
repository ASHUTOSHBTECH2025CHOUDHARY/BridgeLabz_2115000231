import java.util.Scanner;

public class TempratureConverttor {
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void solveint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for Fahrenheit to Celsius, 2 for Celsius to Fahrenheit: ");
        int choice = scanner.nextInt();
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        if (choice == 1) {
            System.out.println("Converted: " + fahrenheitToCelsius(temp) + " °C");
        } else if (choice == 2) {
            System.out.println("Converted: " + celsiusToFahrenheit(temp) + " °F");
        }
    }

    public static void main(String[] args) {
        solveint();
    }
}
