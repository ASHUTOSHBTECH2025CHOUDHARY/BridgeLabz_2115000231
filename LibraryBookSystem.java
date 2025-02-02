import java.util.Scanner;
class Book{
    //declaration of private attributes
    private String title;
    private String author;
    private Boolean available;
    private int price;
    //parameterized constructor to initialize object;
    Book(String title,String author,Boolean available,int price){
        this.title=title;
        this.author=author;
        this.available=available;
        this.price=price;
    }
    //method for borrowing book
    public void Borrow(){
        if(available==true){
            System.out.println("You have successfully borrowed: " + title);
            available = false;
        }
        else{
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }
    //Method to display details
    public void bookDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (available? "Available" : "Not Available"));
    }
}
public class LibraryBookSystem {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title of book");
        String title=sc.nextLine();
        System.out.println("Enter the author of book");
        String author= sc.nextLine();
        System.out.println("Enter the availability of book(true or false)");
        Boolean available=sc.nextBoolean();
        System.out.println("Enter the price of book");
        int price=sc.nextInt();
        //using parameterized constructor to initialize value of object
        Book book=new Book(title,author,available,price);
        //getting details of book using getter
        book.bookDetails();;
        //Borrowing the book if it is available
        book.Borrow();
    }
}
