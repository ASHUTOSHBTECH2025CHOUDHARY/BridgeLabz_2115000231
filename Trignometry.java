public class Trignometry {

    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // Create an instance of TrigonometricCalculator
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        // Example angle in degrees
        double angle = 45.0;

        // Calculate trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine of " + angle + " degrees: " + results[0]);
        System.out.println("Cosine of " + angle + " degrees: " + results[1]);
        System.out.println("Tangent of " + angle + " degrees: " + results[2]);
    }
}
