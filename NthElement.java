import java.util.*;

public class NthElement {

    public static String findNthFromEnd(LinkedList<String> list, int n) {
        // Handle invalid cases
        if (n <= 0 || list.isEmpty()) {
            return "Invalid input";
        }
        // Calculate index
        int index = list.size() - n;
        if (index < 0 || index >= list.size()) {
            return "N is greater than list size";
        }
        ListIterator<String> iterator = list.listIterator();
        for (int i = 0; i <= index; i++) {
            // Handle unexpected cases
            if (!iterator.hasNext()) {
                return "N is greater than list size";
            }
            // Return Nth element
            if (i == index) {
                return iterator.next();
            }
            iterator.next();
        }
        return "Element not found";
    }

    public static void main(String[] args) {
        // Create list
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println(findNthFromEnd(list, n));
    }
}

