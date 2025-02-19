import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {

    // Rotate list by k positions
    public static List<Integer> rotateList(List<Integer> list, int k) {
        if (list == null || list.isEmpty()) {
            return list;
        }

        int n = list.size();
        k = k % n;

        // Reverse the entire list
        reverseList(list, 0, n - 1);

        // Reverse the first part up to k
        reverseList(list, 0, k - 1);

        // Reverse the remaining part after k
        reverseList(list, k, n - 1);

        return list;
    }

    // Reverse list section
    private static void reverseList(List<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Initialize list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;
        List<Integer> rotated = rotateList(numbers, k);
        System.out.println(rotated);
    }
}
