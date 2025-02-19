import java.util.*;

public class Duplicatekey {
    // Remove duplicates r
    public static List<Integer> removeDuplicates(List<Integer> list) {
        // Use LinkedHashSet
        Set<Integer> uniqueSet = new LinkedHashSet<>(list);
        // Convert set to list
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        // Initialize list
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);
        // Call function
        List<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println(uniqueNumbers);
    }
}

