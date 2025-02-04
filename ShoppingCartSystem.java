import java.util.Scanner;

class Product{
    // Class members and methods
    private static int discount=10;
    public static void  updateDiscount(int newdiscout){
        discount=newdiscout;
        System.out.println("Now products has updated discount of "+discount);
    }
    //Instance members and methods
    private String productName;
    private int price;
    private int quantity;
    private final String productId;
    //constructor to initialize Product details
    Product(String productName,String productId,int price,int quantity){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productId=productId;
    }
    //Method to display product details
    public void displayProduct(){
        System.out.println(this.productName+" has price and quantity "+this.price+" "+this.quantity);
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of the discount");
        Scanner sc=new Scanner(System.in);
        int discount=sc.nextInt();
        //Updating discount using static function
        Product.updateDiscount(discount);
        // Creating object and initialize using constructor
        Product shampoo=new Product("Shampoo","34349",5,250);
        if(shampoo instanceof  Product){
            shampoo.displayProduct();
        }
        else{
            System.out.println(" Invalid! Instance of given Product class");
        }
    }
}
