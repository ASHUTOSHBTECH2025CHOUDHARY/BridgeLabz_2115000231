import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots (delta is negative)
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 2) {
            System.out.println("The equation has two distinct real roots:");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root (repeated):");
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots (delta is negative).");
        }
    }
}
