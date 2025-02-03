class Book{
    // class member and method
    public static String libraryName="Apni library";
    public static void displayLibraryName(){
        System.out.println("Library name is "+libraryName);
    }
    // instance variable and method
    private String title;
    private String author;
    private final String isbn;
    //initializing object with constructor
    Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    // getter method for Book details
    public void getBookDetails(){
        System.out.println(this.title+" is written by "+this.author+" and its isbn is "+this.isbn+".");
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book=new Book("Fault in our stars","Unknown","asdlf3434");
        if(book instanceof  Book){
            book.getBookDetails();
        }
    }
}
