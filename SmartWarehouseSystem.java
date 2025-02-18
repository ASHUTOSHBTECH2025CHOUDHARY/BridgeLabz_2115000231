import java.util.*;
// Base class for items
abstract class WarehouseItem {
    private String itemName;

    public WarehouseItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return "Item: " + itemName;
    }
}
// Electronics category
class Electronics extends WarehouseItem {
    public Electronics(String itemName) {
        super(itemName);
    }
}
// Groceries category
class Groceries extends WarehouseItem {
    public Groceries(String itemName) {
        super(itemName);
    }
}
// Furniture category
class Furniture extends WarehouseItem {
    public Furniture(String itemName) {
        super(itemName);
    }
}
// Generic storage
class Storage<T extends WarehouseItem> {
    private List<T> inventory = new ArrayList<>();

    public void storeItem(T item) { // Store item
        inventory.add(item);
    }

    public T fetchItem(int index) { // Get item
        return inventory.get(index);
    }

    public List<T> fetchAllItems() { // Get all
        return inventory;
    }
}
// Warehouse operations
class WarehouseManager {
    public static void showItems(List<? extends WarehouseItem> items) { // Display items
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

// Main execution
public class SmartWarehouseSystem {
    public static void main(String[] args) {
        // Electronics storage
        Storage<Electronics> electronics = new Storage<>();
        electronics.storeItem(new Electronics("Laptop"));
        electronics.storeItem(new Electronics("Smartphone"));
        // Groceries storage
        Storage<Groceries> groceries = new Storage<>();
        groceries.storeItem(new Groceries("Apples"));
        groceries.storeItem(new Groceries("Bread"));
        // Furniture storage
        Storage<Furniture> furniture = new Storage<>();
        furniture.storeItem(new Furniture("Chair"));
        furniture.storeItem(new Furniture("Table"));
        // Show electronics
        System.out.println("Electronics:");
        WarehouseManager.showItems(electronics.fetchAllItems());
        // Show groceries
        System.out.println("Groceries");
        WarehouseManager.showItems(groceries.fetchAllItems());
        // Show furniture
        System.out.println("Furniture:");
        WarehouseManager.showItems(furniture.fetchAllItems());
    }
}