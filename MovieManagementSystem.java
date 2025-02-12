class LinkedList {
    private Node head; // Head of the list

    class Node {
        private String Movie_Title;
        private String Director;
        private int Year;
        private int rating;
        Node prev = null;
        Node next = null;

        public Node(String Movie_Title, String Director, int Year, int rating) {
            this.Movie_Title = Movie_Title;
            this.Director = Director;
            this.Year = Year;
            this.rating = rating;
        }
    }

    // Add movie at end
    public void addLast(String Movie_Title, String Director, int Year, int rating) {
        Node new_Node = new Node(Movie_Title, Director, Year, rating);
        if (head == null) {
            head = new_Node;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new_Node;
        new_Node.prev = node;
    }

    // Add movie at start
    public void addFirst(String Movie_Title, String Director, int Year, int rating) {
        Node new_Node = new Node(Movie_Title, Director, Year, rating);
        if (head == null) {
            head = new_Node;
            return;
        }
        new_Node.next = head;
        head.prev = new_Node;
        head = new_Node;
    }

    // Add movie at position
    public void addPosition(String Movie_Title, String Director, int Year, int rating, int position) {
        Node new_Node = new Node(Movie_Title, Director, Year, rating);
        if (head == null) {
            head = new_Node;
            return;
        }
        if (position == 1) {
            new_Node.next = head;
            head.prev = new_Node;
            head = new_Node;
            return;
        }
        Node node = head;
        int i = 1;
        while (node.next != null && i < position - 1) {
            node = node.next;
            i++;
        }
        if (node.next == null) return;
        new_Node.next = node.next;
        node.next.prev = new_Node;
        node.next = new_Node;
        new_Node.prev = node;
    }

    // Display movies
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.Movie_Title + ", " + temp.Director + ", " + temp.Year + ", " + temp.rating);
            temp = temp.next;
        }
    }

    // Delete movie by title
    public void delete(String s) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.Movie_Title.equals(s)) {
            Node node = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            node.next = null;
            return;
        }
        Node node = head;
        while (node.next != null && !(node.next.Movie_Title.equals(s))) {
            node = node.next;
        }
        if (node.next == null) {
            System.out.println("Movie title " + s + " not found!");
            return;
        }
        Node nodeDelete = node.next;
        if (nodeDelete.next == null) {
            node.next = null;
        } else {
            node.next = nodeDelete.next;
            nodeDelete.next.prev = node;
        }
        nodeDelete.next = null;
        nodeDelete.prev = null;
    }

    // Search movie by director or rating
    public void Search(String director, int rating) {
        if (head == null) return;
        Node node = head;
        while (node != null) {
            if (node.Director.equals(director) || node.rating == rating) {
                System.out.println(node.Movie_Title);
            }
            node = node.next;
        }
    }

    // Display in reverse order
    public void reverseDisplay() {
        if (head == null) return;
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        while (node != null) {
            System.out.println(node.Movie_Title + ", " + node.Director + ", " + node.Year + ", " + node.rating);
            node = node.prev;
        }
    }

    // Update rating of a movie
    public void setRating(int rating, String s) {
        if (head == null) return;
        Node node = head;
        while (node != null && !(node.Movie_Title.equals(s))) {
            node = node.next;
        }
        if (node == null) return;
        node.rating = rating;
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast("hp", "d1", 1212, 3);
        ll.addLast("h1", "d1", 1212, 3);
        ll.addLast("h2", "d1", 1212, 3);
        ll.reverseDisplay();
        ll.setRating(4, "h2");
        ll.display();
    }
}
