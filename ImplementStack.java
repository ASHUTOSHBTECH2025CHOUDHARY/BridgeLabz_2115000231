import java.util.LinkedList;
import java.util.Queue;

class Stack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Q1 is underflow");
        }
        // Move all elements except the last one to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        // Get the last element (the one to pop)
        int res = q1.poll();
        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return res;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class ImplementStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Popped: " + st.pop());
        System.out.println("Is Empty: " + st.isEmpty());
    }
}