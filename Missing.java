import java.util.Arrays;
import java.util.Scanner;

public class Missing{
    // Find first missing number
    public static int findFirstMissing(int[] IX) {
        int I = IX.length;
        for (int II = 0; II < I; II++) {
            // Swap until correct position
            while (IX[II] > 0 && IX[II] <= I && IX[IX[II] - 1] != IX[II]) {
                int III = IX[II] - 1;
                int IV = IX[III];
                IX[III] = IX[II];
                IX[II] = IV;
            }
        }
        // Identify missing number
        for (int V = 0; V < I; V++) {
            if (IX[V] != V + 1) {
                return V + 1;
            }
        }
        return I + 1;
    }

    // Binary search method
    public static int binaryLocate(int[] VI, int VII) {
        // Search bounds
        int VIII = 0, IX = VI.length - 1;
        while (VIII <= IX) {
            // Midpoint
            int X = VIII + (IX - VIII) / 2;
            // Target found
            if (VI[X] == VII) {
                return X;
            } else if (VI[X] < VII) {
                VIII = X + 1;
            } else {
                IX = X - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array size
        int XI = scanner.nextInt();
        // Number list
        int[] XII = new int[XI];

        // Read input values
        for (int XIII = 0; XIII < XI; XIII++) {
            XII[XIII] = scanner.nextInt();
        }

        int missing = findFirstMissing(Arrays.copyOf(XII, XII.length));
        System.out.println(missing);
        // Sort array
        Arrays.sort(XII);
        // Target number
        int XIV = scanner.nextInt();
        int index = binaryLocate(XII, XIV);

        System.out.println(index);
    }
}

