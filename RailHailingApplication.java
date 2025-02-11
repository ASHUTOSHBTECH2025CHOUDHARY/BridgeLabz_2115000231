import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    //Variable of class Vehicle
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor to initialize vehicle details
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Method to retrieve vehicle details
    public String getVehicleDetails() {
        return String.format("Vehicle ID: %d, Driver: %s, Rate per Km: $%.2f", vehicleId, driverName, ratePerKm);
    }
}

interface Gps {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements Gps {

    //Variable of class
    private String location;


    // Constructor to initialize car details
    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    // Method to calculate fare for a Car
    @Override
    public double calculateFare(double distance) {
        return distance * 10;
    }

    // Method to get current location
    @Override
    public String getCurrentLocation() {
        return location;
    }


    // Method to update location
    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

class Bike extends Vehicle implements Gps {

    //Variable of class
    private String location;

    // Constructor to initialize bike details
    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    // Method to calculate fare for a Bike
    @Override
    public double calculateFare(double distance) {
        return distance * 5;
    }

    // Method to get current location
    @Override
    public String getCurrentLocation() {
        return location;
    }

    // Method to update location
    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

class Auto extends Vehicle implements Gps {
    //Variable of class
    private String location;

    // Constructor to initialize auto details
    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
    }

    // Method to calculate fare for an Auto
    @Override
    public double calculateFare(double distance) {
        return distance * 7;
    }

    // Method to get current location
    @Override
    public String getCurrentLocation() {
        return location;
    }

    // Method to update location
    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        // Creating ride objects
        rides.add(new Car(101, "John Doe", 10));
        rides.add(new Bike(102, "Emily Smith", 5));
        rides.add(new Auto(103, "Raj Kumar", 7));

        // Updating locations
        rides.get(0).updateLocation("Downtown");
        rides.get(1).updateLocation("City Center");
        rides.get(2).updateLocation("Main Street");

        double distance = 15.0; // Example trip distance

        // Displaying ride details dynamically
        rides.forEach(ride -> {
            System.out.println(ride.getVehicleDetails());
            System.out.printf("Estimated Fare for %.1f km: $%.2f%n", distance, ride.calculateFare(distance));

            if (ride instanceof Gps gpsEnabled) {
                System.out.println("Current Location: " + gpsEnabled.getCurrentLocation());
            }
            System.out.println();
        });
    }
}