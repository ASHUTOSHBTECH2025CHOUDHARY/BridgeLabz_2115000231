class Book{
    //Variables
    public String ISBN;
    protected String title;
    private String author;
    // Constructor to initialize the Book object
    Book(String ISBN,String title,String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    // getter method for author attribute
    public String getAuthor(){
        return author;
    }
    //setter method for author attribute
    public void setAuthor(String author){
        this.author=author;
    }
    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

//sub class called Ebook
class EBook extends Book{
    // using constructor to call parent constructor
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author); // Call parent class constructor
    }
    // Method to display EBook details (Inherits attributes from Book)
    public void displayEBook() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN " + ISBN);
        System.out.println("Title " + title);
        System.out.println("Author " + getAuthor());
    }
}
public class BookLibrarySystem {
    public static void main(String[] args) {
        //Creating a book object using constructor
        Book book1 = new Book("978", "Java ", "John ");
        book1.displayBookDetails();
        // Creating an EBook object using constructor
        EBook ebook1 = new EBook("978-", "Java", "Joshua Bloch");
        // Modifying the author name using setter
        book1.setAuthor("jhon");
        System.out.println("Author for Book 1 after modification " + book1.getAuthor());
    }
}
