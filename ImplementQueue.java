import java.util.Stack;

class Queue {

    private Stack<Integer> stackNumber1;
    private Stack<Integer> stackNumber2;

    // Constructor to initialize stacks
    Queue() {
        stackNumber1 = new Stack<>();
        stackNumber2 = new Stack<>();
    }

    // Checks if the queue is empty
    public boolean isempty() {
        return stackNumber1.size() == 0;
    }

    // Returns the number of elements in the queue
    public int size() {
        return stackNumber1.size();
    }

    // Inserts an element into the queue
    public void enqueue(int x) {
        // Move all elements from stackNumber1 to stackNumber2
        while (!stackNumber1.empty()) {
            stackNumber2.push(stackNumber1.pop());
        }
        // Add the new element to stackNumber1
        stackNumber1.push(x);
        // Move all elements back to stackNumber1
        while (!stackNumber2.empty()) {
            stackNumber1.push(stackNumber2.pop());
        }
    }

    // Returns the front element of the queue
    public int front() {
        if (stackNumber1.empty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackNumber1.peek();
    }

    // Removes and returns the front element of the queue
    public int dequeue() {
        if (stackNumber1.empty()) {
            System.out.println("Cannot pop");
            return -1;
        }
        return stackNumber1.pop();
    }
}

public class ImplementQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(3);
        System.out.println(queue.front());
        System.out.println(queue.dequeue());
    }
}
