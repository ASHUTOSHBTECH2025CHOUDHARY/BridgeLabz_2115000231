public class UnitConvertor {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3;
        return yards * yardsToFeet;
    }
    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333;
        return feet * feetToYards;
    }
    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }
    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }
    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesToCentimeters = 2.54;
        return inches * inchesToCentimeters;
    }
    // Main method for testing
    public static void main(String[] args) {
        // Test conversions
        double yards = 5;
        double feet = 10;
        double meters = 2;
        double inches = 50;

        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " centimeters");
    }
}
