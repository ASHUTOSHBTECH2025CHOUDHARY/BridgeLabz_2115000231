class LinkedList {
    private Node head; // Head of the linked list

    class Node {
        private int Quantity;
        private String Item_Name;
        private int price;
        private String Item_id;
        Node next;

        // Constructor to initialize node
        public Node(int Quantity, String Item_Name, int price, String Item_id) {
            this.Quantity = Quantity;
            this.Item_Name = Item_Name;
            this.Item_id = Item_id;
            this.price = price;
            this.next = null;
        }
    }

    // Add node at the end
    public void addLast(int Quantity, String Item_Name, int price, String Item_id) {
        Node new_Node = new Node(Quantity, Item_Name, price, Item_id);
        if (head == null) {
            head = new_Node;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new_Node;
    }

    // Add node at the beginning
    public void addFirst(int Quantity, String Item_Name, int price, String Item_id) {
        Node new_Node = new Node(Quantity, Item_Name, price, Item_id);
        new_Node.next = head;
        head = new_Node;
    }

    // Insert at a given position
    public void addIndex(int Quantity, String Item_Name, int price, String Item_id, int position) {
        Node new_Node = new Node(Quantity, Item_Name, price, Item_id);
        if (head == null) {
            head = new_Node;
            return;
        }
        if (position == 1) {
            new_Node.next = head;
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
        node.next = new_Node;
    }

    // Delete a node by Item ID
    public void delete(String Item_id) {
        if (head == null) return;
        if (head.Item_id.equals(Item_id)) {
            head = head.next;
            return;
        }
        Node node = head;
        while (node.next != null && !node.next.Item_id.equals(Item_id)) {
            node = node.next;
        }
        if (node.next == null) return;
        node.next = node.next.next;
    }

    // Update quantity of an item
    public void update(int quantity, String Item_id) {
        Node node = head;
        while (node != null && !node.Item_id.equals(Item_id)) {
            node = node.next;
        }
        if (node != null) node.Quantity = quantity;
    }

    // Search by name or ID
    public void search(String Name, String Item_id) {
        Node node = head;
        while (node != null && !node.Item_id.equals(Item_id) && !node.Item_Name.equals(Name)) {
            node = node.next;
        }
        if (node != null) System.out.println(node.Item_id + ", " + node.Item_Name + ", " + node.Quantity + ", " + node.price);
    }

    // Display all items
    public void display() {
        Node node = head;
        while (node != null) {
            System.out.println(node.Item_id + ", " + node.Item_Name + ", " + node.Quantity + ", " + node.price);
            node = node.next;
        }
    }

    // Find middle of the list
    public Node findmiddle(Node head) {
        if (head == null || head.next == null) return head;
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge sort ascending order
    public Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;
        Node result;
        if (left.Item_Name.compareTo(right.Item_Name) <= 0) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    // Merge sort descending order
    public Node reverseMerge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;
        Node result;
        if (left.Item_Name.compareTo(right.Item_Name) >= 0) {
            result = left;
            result.next = reverseMerge(left.next, right);
        } else {
            result = right;
            result.next = reverseMerge(left, right.next);
        }
        return result;
    }

    // Sort ascending order
    private Node sortAscending(Node head) {
        if (head == null || head.next == null) return head;
        Node middle = findmiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = sortAscending(head);
        right = sortAscending(right);
        return merge(left, right);
    }

    // Sort descending order
    private Node sortDescending(Node head) {
        if (head == null || head.next == null) return head;
        Node middle = findmiddle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = sortDescending(head);
        right = sortDescending(right);
        return reverseMerge(left, right);
    }

    // Public method to sort in ascending order
    public void sort() {
        head = sortAscending(head);
    }

    // Public method to sort in descending order
    public void reversesort() {
        head = sortDescending(head);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        LinkedList inventory = new LinkedList();
        inventory.addLast(10, "Laptop", 50000, "ITM1001");
        inventory.addLast(5, "Phone", 30000, "ITM1002");
        inventory.addLast(15, "Tablet", 25000, "ITM1003");
        inventory.addLast(8, "Smartwatch", 10000, "ITM1004");
        inventory.display();
        inventory.sort();
        inventory.display();
        inventory.reversesort();
        inventory.display();
    }
}