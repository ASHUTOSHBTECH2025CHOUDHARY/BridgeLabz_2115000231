import java.util.ArrayList;

abstract class Product{
    //Variable of class
    private int productId;
    private String name;
    private int price;
    //using constructor to initialize object
    public Product(int productId,String name,int price){
        this.name=name;
        this.productId=productId;
        this.price=price;
    }
    //getter and setter methods for Product class
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
            this.price = price;
    }
    public abstract int calculateDiscount();

}
interface Taxable{
    int calculateTax();
    void getTaxDetails();
}
class Electronics extends Product implements Taxable{
    //Instance variable of Electronics
    private final int tax=10;
    //using constructor to initialize object and calling parent constructor
    public Electronics(int productId,String name,int price){
        super(productId,name,price);
    }
    //implementing abstract methods

    @Override
    public int calculateDiscount() {
        return (int)(getPrice()*.10);
    }

    @Override
    public int calculateTax() {
        return (int)(getPrice()*(.10));
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Electronics Products has %tax= "+this.tax);
    }
}
class Clothing extends Product implements Taxable{
    //Instance variable of Clothing
    private final int tax=10;
    //using constructor to initialize object and calling parent constructor
    public Clothing(int productId,String name,int price){
        super(productId,name,price);
    }
    //implementing abstract methods

    @Override
    public int calculateDiscount() {
        return (int)(getPrice()*.10);
    }

    @Override
    public int calculateTax() {
        return (int)(getPrice()*(.10));
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Clothing Products has %tax= "+this.tax);
    }
}
class Groceries extends Product implements Taxable{
    //Instance variable of Groceries
    private final int tax=10;
    //using constructor to initialize object and calling parent constructor
    public Groceries(int productId,String name,int price){
        super(productId,name,price);
    }
    //implementing abstract methods

    @Override
    public int calculateDiscount() {
        return (int)(getPrice()*.10);
    }

    @Override
    public int calculateTax() {
        return (int)(getPrice()*(.10));
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Clothing Products has %tax= "+this.tax);
    }
}
public class ECommerce_Platform {
    public static void main(String[] args) {

        //Creating object of the subclasses of Products
        Electronics moblie=new Electronics(43434,"MI",20000);
        Clothing    sweater=new Clothing(3434,"Nike",2323);
        Groceries   Sugar=new Groceries(3344,"Sugar",60);
        //Creating arrayList of Products
        ArrayList<Product> products=new ArrayList<Product>();
        products.add(moblie);
        products.add(sweater);
        products.add(Sugar);

        //Now showing the totalprice and discount on the each category of product
        for (Product product:products){
            double discount = product.calculateDiscount();
            double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Product "+product.getName()+"has discount,tax and finalPrice are "+
               discount+", "+tax+" and "+finalPrice     );
            ((Taxable)product).getTaxDetails();
        }
    }
}
