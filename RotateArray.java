import java.util.Scanner;

public class RotateArray {
    public static int findShiftIndex(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If middle element is greater than the rightmost, shift search right
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, search in the left half
                right = mid;
            }
        }

        return left; // Index of the smallest value
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); // Read array size
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt(); // Read array elements
        }

        scan.close();

        int idx = findShiftIndex(nums);

        System.out.println("Rotation index: " + idx);
        System.out.println("Smallest value: " + nums[idx]);
    }
}

