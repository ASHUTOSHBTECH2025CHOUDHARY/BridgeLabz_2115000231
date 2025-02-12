class Linkedlist {
    //Instance Variables
    private Node head;
    private Node current;
    private int size;

    class Node {
        private String text;
        Node prev = null;
        Node next = null;

        public Node(String text) {
            this.text = text;
        }
    }

    // Add a new text state at the end
    public void addState(String text) {
        Node newNode = new Node(text);
        if (head == null) {
            head = current = newNode;
            size = 1;
            return;
        }

        if (current.next != null) {
            current.next.prev = null;
        }
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
        size++;

        // Limit history size
        if (size > 10) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo functionality
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("No previous state to undo ");
            return;
        }
        current = current.prev;
    }

    // Redo functionality
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("No state to redo!");
            return;
        }
        current = current.next;
    }

    // Display current text state
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("empty");
        } else {
            System.out.println("Current Text " + current.text);
        }
    }
}

public class TextEditorSystem {
    public static void main(String[] args) {
        Linkedlist editor = new Linkedlist();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrentState();
    }
}

