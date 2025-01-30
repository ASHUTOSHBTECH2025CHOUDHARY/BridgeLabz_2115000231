import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private int    price;
    Book(String title,String author,int price){
        this.author=author;
        this.title=title;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println(title+" written by "+author+" has a price of"+price);
    }
}
public class HandleBook {
    public static void main(String[] args) {
        System.out.println("Enter the details of Books ");
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book first=new Book(title,author,price);
        first.displayDetails();
    }
}
