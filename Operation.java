    import java.util.*;

    public class Operation {
        public static void main(String[] args) {
            // Initialize the first set
            Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));

            // Initialize the second set
            Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

            Set<Integer> unionSet = new HashSet<>(set1);
            unionSet.addAll(set2);
            System.out.println( unionSet);

            // Compute the intersection of the two sets
            Set<Integer> intersectionSet = new HashSet<>(set1);
            intersectionSet.retainAll(set2);
            System.out.println(intersectionSet);
        }
    }
