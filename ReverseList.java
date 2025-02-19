import java.util.ArrayList;
import java.util.List;

class LinkedList {
    int data;
    LinkedList next;

    LinkedList(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseList {
    // Reverse linked list recursively
    private static LinkedList reverseLinked(LinkedList head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedList temp = reverseLinked(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    // Display linked list
    private static void display(LinkedList head) {
        LinkedList node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        // Adding elements
        l1.add(1);
        l1.add(2);
        l1.add(3);

        // Reverse list using another list
        for (int i = 0; i < 3; i++) {
            Integer Last = l1.remove(l1.size() - 1);
            l2.add(Last);
        }
        l1 = l2; // Assign reversed list

        // Print reversed list
        for (Integer i : l1) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Create linked list
        LinkedList node = new LinkedList(1);
        node.next = new LinkedList(2);
        node.next.next = new LinkedList(3);

        // Reverse and display
        node = reverseLinked(node);
        display(node);
    }
}
