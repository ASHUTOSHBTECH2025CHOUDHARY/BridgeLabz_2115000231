import java.util.Scanner;

class Product{
    // instance Variable
    private String productName;
    private double price;
    // class Variable
    private static int totalProduct=0;
    // Constructor to initialize Product
    public Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        totalProduct++;
    }
    //Instance method to show product details
    public void displayProductDetails(){
        System.out.println("Product " + this.productName);
        System.out.println("Price " + this.price);
    }
    //Static Method to display total number of product
    public static void displayTotalProducts(){
        System.out.println("Total Products Created: " + totalProduct);
    }

}

public class ProductInventroy {
    public static void main(String[] args) {
        // Initialize object with parameterized constructor
        Product product1=new Product("Laptop",1200.5);
        Product product2=new Product("Smartphone",33330.0);
        //Display details of both products
        product1.displayProductDetails();
        product2.displayProductDetails();
        //display the total number of products
        Product.displayTotalProducts();
    }
}