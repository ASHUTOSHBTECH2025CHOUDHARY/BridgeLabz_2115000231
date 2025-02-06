import java.util.ArrayList;

class Product {
    //Instance variables
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // Returns product information
    public String getProductDetails() {
        return "Product " + name + " | Price " + price;
    }

    public double getPrice() {
        return price;
    }
}

// Order class (Aggregates multiple Products, belongs to a Customer)
class Order {
    //Instance variables
    private int orderId;
    private ArrayList<Product> products;
    private double totalAmount;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }
    // Adds a product to the order
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }
    // Returns order information
    public String getOrderDetails() {
        String result = "Order ID: " + orderId + " Products ";
        for (Product product : products) {
            result +=  product.getProductDetails() ;
        }
        result += "Total Amount " + totalAmount + ;
        return result;
    }
}

class Customer {
    //Instance variables
    private String name;
    private ArrayList<Order> orders;
    // Initialize ArrayList
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }
    // Adds an order to the customer
    public void placeOrder(Order order) {
        orders.add(order);
    }
    // Returns customer information with orders
    public String getCustomerDetails() {
        String result = "Customer " + name + " Orders";
        for (Order order : orders) {
            result += order.getOrderDetails() ;
        }
        return result;
    }
}


public class E_Commerce {
    public static void main(String[] args) {
        // Create Products object
        Product laptop = new Product("Laptop",100);
        Product smartphone = new Product("Smartphone",100);
        Product headphones = new Product("Headphones",100);

        // Create Orders object
        Order order1 = new Order(101);
        order1.addProduct(laptop);
        order1.addProduct(headphones);

        Order order2 = new Order(102);
        order2.addProduct(smartphone);

        // Create a Customer object
        Customer customer = new Customer("John Doe");
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Print Customer details
        System.out.println(customer.getCustomerDetails());
    }
}

