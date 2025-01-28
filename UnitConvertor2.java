public class UnitConvertor2 {

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double poundsToKilograms(double pounds) {
        double poundsToKilograms = 0.453592; // Conversion factor
        return pounds * poundsToKilograms;
    }

    // Convert kilograms to pounds
    public static double kilogramsToPounds(double kilograms) {
        double kilogramsToPounds = 2.20462; // Conversion factor
        return kilograms * kilogramsToPounds;
    }

    // Convert gallons to liters
    public static double gallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541; // Conversion factor
        return gallons * gallonsToLiters;
    }

    // Convert liters to gallons
    public static double litersToGallons(double liters) {
        double litersToGallons = 0.264172; // Conversion factor
        return liters * litersToGallons;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test conversions
        double fahrenheit = 98.6;
        double celsius = 37;
        double pounds = 10;
        double kilograms = 5;
        double gallons = 2;
        double liters = 10;

        System.out.println(fahrenheit + "°F = " + fahrenheitToCelsius(fahrenheit) + "°C");
        System.out.println(celsius + "°C = " + celsiusToFahrenheit(celsius) + "°F");
        System.out.println(pounds + " pounds = " + poundsToKilograms(pounds) + " kilograms");
        System.out.println(kilograms + " kilograms = " + kilogramsToPounds(kilograms) + " pounds");
        System.out.println(gallons + " gallons = " + gallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + litersToGallons(liters) + " gallons");
    }
}