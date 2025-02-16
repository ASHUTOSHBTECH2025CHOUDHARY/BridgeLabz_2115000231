import java.util.Scanner;

public class FirstLastIndex {
    public static int findFirst(int[] nums, int key) {
        int I = 0, II = nums.length - 1, III = -1;

        while (I <= II) {
            int IV = I + (II - I) / 2;

            if (nums[IV] == key) {
                III = IV;
                II = IV - 1;
            } else if (nums[IV] < key) {
                I = IV + 1;
            } else {
                II = IV - 1;
            }
        }
        return III;
    }

    public static int findLast(int[] nums, int key) {
        int V = 0, VI = nums.length - 1, VII = -1;

        while (V <= VI) {
            int VIII = V + (VI - V) / 2;

            if (nums[VIII] == key) {
                VII = VIII;
                V = VIII + 1;
            } else if (nums[VIII] < key) {
                V = VIII + 1;
            } else {
                VI = VIII - 1;
            }
        }
        return VII;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for (int X = 0; X < N; X++) {
            nums[X] = sc.nextInt();
        }

        int key = sc.nextInt();


        int first = findFirst(nums, key);
        int last = findLast(nums, key);
    }
}

