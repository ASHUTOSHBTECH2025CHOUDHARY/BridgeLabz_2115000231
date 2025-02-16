import java.util.Scanner;

public class FirstNegNum {
    public static int findNeg(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read array size
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt(); // Read array elements
        }
        sc.close();

        int idx = findNeg(nums);
        if (idx != -1) {
            System.out.println("Index of first negative: " + idx);
        } else {
            System.out.println("No negative number found");
        }
    }
}

