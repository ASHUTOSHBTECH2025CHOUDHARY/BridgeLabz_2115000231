import java.util.Stack;

public class SortStack {

    // Function to recursively sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.empty()) {
            int top = stack.pop();
            sortStack(stack);
            SortStack(stack, top);
        }
    }

    // Helper function to insert an element into the sorted stack
    public static void SortStack(Stack<Integer> stack, int element) {
        if (stack.empty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        SortStack(stack, element);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(54);
        stack.push(43);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
