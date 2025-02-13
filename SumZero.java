import java.util.*;

public class SumZero {
    public static void sumZero(int[] arr) {
        Map<Integer, List<Integer>> prefixSumMap = new HashMap<>();
        int cumulativeSum = 0;

        // Initialize map with sum 0 at index -1 to handle subarrays starting from index 0
        prefixSumMap.put(0, new ArrayList<>());
        prefixSumMap.get(0).add(-1);

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i]; // Compute cumulative sum

            // If sum has been encountered before, it indicates zero-sum subarrays
            if (prefixSumMap.containsKey(cumulativeSum)) {
                for (int startIdx : prefixSumMap.get(cumulativeSum)) {
                    System.out.println((startIdx + 1) + " to " + i);
                }
            }

            // Store current index in map to track cumulative sum occurrences
            prefixSumMap.putIfAbsent(cumulativeSum, new ArrayList<>());
            prefixSumMap.get(cumulativeSum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, -3, -2, 6, -1, 2, -4, 3, 1, -3};
        sumZero(arr);
    }
}
