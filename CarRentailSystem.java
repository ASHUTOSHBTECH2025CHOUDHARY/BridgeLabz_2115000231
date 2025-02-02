import java.util.Scanner;

class CarRental {
    // private Attributes of the CarRental object
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalRate;
    // Constructor to initialize rental details
    CarRental(String customerName, String carModel, int rentalDays, double rentalRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRate = rentalRate;
    }
    // Method for total rental cost
    public double calculateTotalCost() {
        return rentalDays * rentalRate;
    }

    // Method to display rental details
    public void showRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rental Rate: " + rentalRate);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = sc.nextLine();
        System.out.println("Enter car model:");
        String carModel = sc.nextLine();
        System.out.println("Enter rental days:");
        int rentalDays = sc.nextInt();
        System.out.println("Enter daily rental rate:");
        double rentalRate = sc.nextDouble();

        // Creating a CarRental object with parameterized constructor
        CarRental rental = new CarRental(customerName, carModel, rentalDays, rentalRate);

        // Displaying rental details
        System.out.println("Rental Details:");
        rental.showRentalDetails();
    }
}
