import java.util.*;

public class Twosum {
    public static int[] getPairIndices(int[] arr, int targetSum) {
        // Store values
        Map<Integer, Integer> numIndices = new HashMap<>();

        // Fill map
        for (int i = 0; i < arr.length; i++) {
            numIndices.put(arr[i], i);
        }

        // Find pair
        for (int i = 0; i < arr.length; i++) {
            // Compute difference
            int difference = targetSum - arr[i];

            // Check in map
            if (numIndices.containsKey(difference) && numIndices.get(difference) != i) {
                // Return indices
                return new int[]{i, numIndices.get(difference)};
            }
        }

        // No pair found
        return new int[]{};
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {5, 10, 2, 9, 3};

        // Target sum
        int targetSum = 12;

        // Get indices
        int[] result = getPairIndices(arr, targetSum);

        // Print result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        }
    }
}

