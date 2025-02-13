import java.util.*;

public class PairSum {
    public static boolean pair(int[] nums, int target) {
        Map<Integer, Boolean> seenNumbers = new HashMap<>();

        // Iterate through array
        for (int number : nums) {
            int required = target - number; // Needed complement

            // Check if complement exists
            if (seenNumbers.containsKey(required)) {
                System.out.println("Pair found: (" + number + ", " + required + ")");
                return true; // Pair found
            }
            seenNumbers.put(number, true);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {6, 2, 8, 4, 1, 7, 5}; //  values
        int targetValue = 11; //   sum
        pair(nums, targetValue);
    }
}

