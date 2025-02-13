import java.util.*;

public class LongestStreak {
    public static int findseq(int[] nums) {
        Set<Integer> sqe = new HashSet<>();
        int longestStreak = 0;

        // Store all elements in a HashSet
        for (int num : nums) {
            sqe.add(num);
        }

        // Iterate through the array
        for (int num : sqe) {
            if (!sqe.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (sqe.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update longest sequence length
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2, 5, 6, 7, 8};
        System.out.println(findseq(nums));
    }
}

