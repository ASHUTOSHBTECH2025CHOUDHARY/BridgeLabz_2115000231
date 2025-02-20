import java.util.*;

public class Setcheck {
    public static void main(String[] args) {
        // Initialize the first set
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));

        // Initialize the second set
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean isSubset = set2.containsAll(set1);
        System.out.println("Is set1 a subset of set2? " + isSubset);
    }
}
