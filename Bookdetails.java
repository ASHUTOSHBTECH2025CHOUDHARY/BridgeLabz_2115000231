import java.util.Scanner;

class Book {
    // private attributes of the Book
    private String name;
    private String author;
    private int price;

    // default constructor initializing with unknown values
    Book() {
        this.name = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    // parameterized constructor to initialize book details
    Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // method to display book details
    public void getDetails() {
        System.out.println("Title, author and price of book " + this.name + ", " + this.author + ", " + this.price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        // scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // asking for book details
        System.out.println("Enter details of the book:");
        String name = sc.nextLine();
        String author = sc.next();
        int price = sc.nextInt();

        // creating book objects using both constructors
        Book book1 = new Book();
        Book book2 = new Book(name, author, price);

        // displaying details of both books
        book1.getDetails();
        book2.getDetails();
    }
}