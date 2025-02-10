import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    //Variables of abstract
    private String itemName;
    private double price;
    private int quantity;

    // Using constructor to initialize object
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate the total cost of the item
    public abstract double calculateTotalPrice();

    // Method to fetch food item details
    public String getItemDetails() {
        return itemName + " | Price: $" + price + " | Quantity: " + quantity;
    }

    // Getters for price and quantity
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Interface for applying discounts
interface Discountable {
    void applyDiscount(double percentage);
}

class VegItem extends FoodItem implements Discountable {
    // Instance variable
    private double discount = 0.0;

    // Using constructor to initialize object and calling parent constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implementing abstract method
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    // Implementing interface method
    @Override
    public void applyDiscount(double percentage) {
        discount = (getPrice() * getQuantity()) * (percentage / 100);
    }
}

class NonVegItem extends FoodItem implements Discountable {
    // Instance variable
    private double extraCharge = 2.0;
    private double discount = 0.0;

    // Using constructor to initialize object and calling parent constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implementing abstract method
    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + (extraCharge * getQuantity());
        return total - discount;
    }

    // Implementing interface method
    @Override
    public void applyDiscount(double percentage) {
        double total = (getPrice() * getQuantity()) + (extraCharge * getQuantity());
        discount = total * (percentage / 100);
    }
}

public class OnlineDelivery {
    public static void main(String[] args) {
        // List to store ordered food items
        List<FoodItem> orderList = new ArrayList<>();

        // Creating and adding food items to the order list
        VegItem paneerWrap = new VegItem("Paneer Wrap", 6.0, 2);
        NonVegItem grilledChicken = new NonVegItem("Grilled Chicken", 12.0, 1);

        // Applying discounts
        paneerWrap.applyDiscount(10);
        grilledChicken.applyDiscount(5);

        orderList.add(paneerWrap);
        orderList.add(grilledChicken);

        // Display order summary
        System.out.println("Order Summary:");
        for (FoodItem item : orderList) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Cost: $" + item.calculateTotalPrice());
            System.out.println();
        }
    }
}
