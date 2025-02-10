import java.util.ArrayList;
import java.util.List;

// Abstract class representing a library item
abstract class LibraryItem {
    // Private fields for encapsulation
    private int itemId;
    private String title;
    private String author;

    // Constructor to initialize library item
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method to be implemented by subclasses
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

// Interface defining reservable items
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}


class Book extends LibraryItem implements Reservable {
    //Instance Variable
    private boolean isAvailable = true;
    //using constructor to initialize object and calling parent constructor
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    //implementing abstract methods
    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        isAvailable = false;
        System.out.println("Book reserved " + getItemDetails());
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class Magazine extends LibraryItem {
    //using constructor to initialize object and calling parent constructor
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    //implementing abstract methods
    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    //Instance Variables of class DVD
    private boolean isAvailable = true;
    //using constructor to initialize object and calling parent constructor
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    //implementing abstract methods
    @Override
    public int getLoanDuration() {
        return 5; // DVDs can be borrowed for 5 days
    }

    @Override
    public void reserveItem() {
        isAvailable = false;
        System.out.println("DVD reserved: " + getItemDetails());
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Library Management System Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating a list to store library items
        List<LibraryItem> libraryItems = new ArrayList<>();

        // Creating objects of different library items
        libraryItems.add(new Book(101, "The Alchemist", "Paulo Coelho"));
        libraryItems.add(new Magazine(202, "National Geographic", "Various Authors"));
        libraryItems.add(new DVD(303, "Inception", "Christopher Nolan"));

        // Displaying details of all library items
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Checking if the item is reservable and performing reservation
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                if (reservableItem.checkAvailability()) {
                    reservableItem.reserveItem();
                } else {
                    System.out.println("Item already reserved.");
                }
            }
            System.out.println();
        }
    }
}
