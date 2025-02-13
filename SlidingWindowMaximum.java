import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        // Process first k elements
        for (int i = 0; i < k; i++) {
            // Remove smaller elements
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.removeLast();
            }
            deque.addLast(i); // Add index
        }

        // Process remaining elements
        for (int i = k; i < arr.length; i++) {
            // Remove out-of-window elements
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            // Remove smaller elements
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.removeLast();
            }
            deque.addLast(i); // Add index
            ans.add(arr[deque.peekFirst()]); // Store max
        }

        // Print result
        for (Integer i : ans) {
            System.out.println(i + ", ");
        }
    }
}
