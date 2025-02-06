import java.util.ArrayList;

class Book{
    //Instance variable
    private String title;
    private String author;
    //Initializing variables using parameterized constructor
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    // method to display details of books
    public void displayBookDisplay(){
        System.out.println("title and author of the book is "+this.title+" and "+this.author);
    }
}
class Library{
    //Instance Variable
    private final String LibraryName;
    private ArrayList<Book> books=new ArrayList<Book>();
    // initializing LibraryName using constructor
    Library(String LibraryName){
        this.LibraryName=LibraryName;
    }
    // method to add book into library
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to "+LibraryName+" successfully");
    }
    //method to display the books int the library
    public void displayBooks(){
        System.out.println(LibraryName+ " Library has these books");
        for(Book i:books){
            i.displayBookDisplay();
        }
    }
}
public class LibraryandBooks_Aggregattion {
    public static void main(String[] args) {
        // Creating objects for Library
        Library library1=new Library("GLA University");
        Library library2=new Library("Alwar Library");
        //Creating objects for Book
        Book book1=new Book("Fault in our star","Hoga koi");
        Book book2=new Book("Power of money","Rich people");
        Book book3=new Book("Ms dhoni","MAHI");
        // adding books into library
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book1);
        //displaying the book present in the library
        library1.displayBooks();
        library2.displayBooks();
    }
}