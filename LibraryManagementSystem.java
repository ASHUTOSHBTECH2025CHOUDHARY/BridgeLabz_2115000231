    class Library {
        private Book head;

        class Book {
            private String title;
            private String author;
            private String genre;
            private int bookID;
            private boolean isAvailable;
            Book prev, next;

            public Book(String title, String author, String genre, int bookID, boolean isAvailable) {
                this.title = title;
                this.author = author;
                this.genre = genre;
                this.bookID = bookID;
                this.isAvailable = isAvailable;
            }
        }

        // Add book at the end
        public void addBookEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
            Book newBook = new Book(title, author, genre, bookID, isAvailable);
            if (head == null) {
                head = newBook;
                return;
            }
            Book temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newBook;
            newBook.prev = temp;
        }

        // Add book at the beginning
        public void addBookStart(String title, String author, String genre, int bookID, boolean isAvailable) {
            Book newBook = new Book(title, author, genre, bookID, isAvailable);
            if (head == null) {
                head = newBook;
                return;
            }
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }

        // Add book at a specific position
        public void addBookAtPosition(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
            Book newBook = new Book(title, author, genre, bookID, isAvailable);
            if (head == null || position == 1) {
                addBookStart(title, author, genre, bookID, isAvailable);
                return;
            }
            Book temp = head;
            for (int i = 1; temp.next != null && i < position - 1; i++) {
                temp = temp.next;
            }
            newBook.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            newBook.prev = temp;
        }

        // Remove a book by Book ID
        public void removeBook(int bookID) {
            if (head == null) {
                System.out.println("Library is empty!");
                return;
            }
            if (head.bookID == bookID) {
                head = head.next;
                if (head != null) head.prev = null;
                return;
            }
            Book temp = head;
            while (temp.next != null && temp.next.bookID != bookID) {
                temp = temp.next;
            }
            if (temp.next == null) {
                System.out.println("Book ID " + bookID + " not found!");
                return;
            }
            temp.next = temp.next.next;
            if (temp.next != null) temp.next.prev = temp;
        }

        // Search for a book by title or author
        public void searchBook(String title, String author) {
            Book temp = head;
            while (temp != null) {
                if (temp.title.equalsIgnoreCase(title) || temp.author.equalsIgnoreCase(author)) {
                    System.out.println("Found: " + temp.title + " by " + temp.author);
                }
                temp = temp.next;
            }
        }

        // Update book availability status
        public void updateAvailability(int bookID, boolean status) {
            Book temp = head;
            while (temp != null) {
                if (temp.bookID == bookID) {
                    temp.isAvailable = status;
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Book ID not found!");
        }

        // Display books in forward order
        public void displayBooks() {
            Book temp = head;
            while (temp != null) {
                System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.bookID + " | Available: " + temp.isAvailable);
                temp = temp.next;
            }
        }

        // Display books in reverse order
        public void displayReverse() {
            if (head == null) return;
            Book temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            while (temp != null) {
                System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.bookID + " | Available: " + temp.isAvailable);
                temp = temp.prev;
            }
        }

        // Count total books
        public int countBooks() {
            int count = 0;
            Book temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public class LibraryManagementSystem {
        public static void main(String[] args) {
            Library lib = new Library();
            lib.addBookEnd("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1001, true);
            lib.addBookStart("1984", "George Orwell", "Dystopian", 1002, false);
            lib.addBookAtPosition("To Kill a Mockingbird", "Harper Lee", "Fiction", 1003, true, 2);

            System.out.println("Books in Library:");
            lib.displayBooks();

            System.out.println("\nReversed Order:");
            lib.displayReverse();

            System.out.println("\nTotal Books: " + lib.countBooks());

            lib.removeBook(1002);
            System.out.println("\nAfter Removing Book ID 1002:");
            lib.displayBooks();

            lib.updateAvailability(1003, false);
            System.out.println("\nAfter Updating Availability:");
            lib.displayBooks();
        }
    }