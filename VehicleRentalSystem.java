
import java.util.ArrayList;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle implements Insurable {
    //Variable of class
    private String vehicleNumber;
    private String type;
    protected double rentalRate;
    private String insurancePolicyNumber;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Getter methods for vehicle details
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateRentalCost(int days);

    // Implementing insurance methods from Insurable interface
    @Override
    public double calculateInsurance() {
        return rentalRate * 0.1; // 10% of rental rate as insurance cost
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: [Confidential]";
    }
}
class Car extends Vehicle {
    //using constructor to initialize object and calling parent constructor
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }
    //implementing abstract methods
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
class Bike extends Vehicle {
    //using constructor to initialize object and calling parent constructor
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }
    //implementing abstract methods
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.9; // 10% discount on bike rentals
    }
}

class Truck extends Vehicle {
    //using constructor to initialize object and calling parent constructor
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }
    //implementing abstract methods
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.2; // 20% surcharge on truck rentals
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Creating a list of different vehicle types
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C123", 50, "CAR-INS-001"));
        vehicles.add(new Bike("B456", 20, "BIKE-INS-002"));
        vehicles.add(new Truck("T789", 100, "TRUCK-INS-003"));

        int rentalDays = 5;

        // Iterating over the vehicle list to display rental and insurance details
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type " + vehicle.getType());
            System.out.println("Vehicle Number " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for " + rentalDays + " days " + vehicle.calculateRentalCost(rentalDays));
            System.out.println("Insurance Cost " + vehicle.calculateInsurance());
            System.out.println(vehicle.getInsuranceDetails());
        }
    }
}