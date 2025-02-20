import java.util.*;

class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Integer> cart = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedProducts = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        sortedProducts.put(price, product);
    }

    public void addToCart(String product) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + 1);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void displayCart() {
        System.out.println("Cart Items in Order Added:");
        cart.forEach((product, quantity) -> System.out.println(product + " x" + quantity));
    }

    public void displaySortedProducts() {
        System.out.println("Products Sorted by Price:");
        sortedProducts.forEach((price, product) -> System.out.println(product + " - $" + price));
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.2);

        cart.addToCart("Apple");
        cart.addToCart("Banana");
        cart.addToCart("Apple");

        cart.displayCart();
        System.out.println();
        cart.displaySortedProducts();
    }
}

