import java.util.*;

public class EqualSet {
    public static void main(String[] args) {
        // Create the first set
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));

        // Create the second set
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        // Check if the two sets are equal
        boolean areEqual = set1.equals(set2);
        System.out.println("Are the sets equal? " + areEqual);
    }
}
