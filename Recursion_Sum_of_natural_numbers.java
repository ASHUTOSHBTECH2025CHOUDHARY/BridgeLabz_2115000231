public class Convertor_Calculator {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmToMiles = 0.621371;
        return km * kmToMiles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;
        return meters * metersToFeet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters;
    }

    // Main method to demonstrate the usage of the UnitConverter class
    public static void main(String[] args) {
        // Example conversions
        double km = 10.0;
        double miles = 6.21371;
        double meters = 5.0;
        double feet = 16.4042;

        System.out.println(km + " kilometers = " + convertKmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " kilometers");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}