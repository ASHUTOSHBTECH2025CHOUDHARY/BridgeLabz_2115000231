import java.util.*;

class BookCategory {
    private String type;

    public BookCategory(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Genre: " + type;
    }
}

class ClothingCategory {
    private String fit;

    public ClothingCategory(String fit) {
        this.fit = fit;
    }

    @Override
    public String toString() {
        return "Size: " + fit;
    }
}

class GadgetCategory {
    private String maker;

    public GadgetCategory(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Brand: " + maker;
    }
}

class Product<T> {
    private String title;
    private double cost;
    private T type;

    public Product(String title, double cost, T type) {
        this.title = title;
        this.cost = cost;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public T getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product: " + title + ", Price: $" + cost + ", " + type;
    }
}

class DiscountManager {
    public static <T> void applyDiscount(Product<T> item, double percent) {
        double current = item.getCost();
        double newCost = current * (1 - percent / 100);
        item.setCost(newCost);
        System.out.println("Applied " + percent + "% discount to " + item.getTitle() + ". New price: $" + newCost);
    }
}

// Product storage
class ProductCatalog {
    private List<Product<?>> catalog = new ArrayList<>();

    public void addProduct(Product<?> item) {
        catalog.add(item);
    }

    public void displayCatalog() {
        for (Product<?> item : catalog) {
            System.out.println(item);
        }
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        // Create items
        Product<BookCategory> novel = new Product<>("The Great Gatsby", 25.99, new BookCategory("Fiction"));
        Product<ClothingCategory> tee = new Product<>("T-Shirt", 19.99, new ClothingCategory("M"));
        Product<GadgetCategory> mobile = new Product<>("Smartphone", 599.99, new GadgetCategory("Apple"));
        // Store items
        ProductCatalog storage = new ProductCatalog();
        storage.addProduct(novel);
        storage.addProduct(tee);
        storage.addProduct(mobile);
        // Show catalog
        System.out.println("Product Catalog:");
        storage.displayCatalog();
        // Apply price cuts
        System.out.println("\nApplying Discounts:");
        DiscountManager.applyDiscount(novel, 10);
        DiscountManager.applyDiscount(tee, 20);
        DiscountManager.applyDiscount(mobile, 15);
        // Show updated catalog
        System.out.println("\nUpdated Product Catalog:");
        storage.displayCatalog();
    }
}