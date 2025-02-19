import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1)); // Initialize set

        List<Integer> sortedList = new ArrayList<>(set); // Convert to list
        Collections.sort(sortedList); // Sort list

        System.out.println("Sorted List: " + sortedList); // Print result
    }
}

