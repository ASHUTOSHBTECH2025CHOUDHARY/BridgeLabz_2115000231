public class CircularBuffer {
    private int[] buffer; // Circular array
    private int head; // Oldest element index
    private int tail; // Newest element index
    private int size;
    private int capacity;

    // Initialize buffer
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Insert element
    public void insert(int value) {
        if (size == capacity) {
            head = (head + 1) % capacity; // Overwrite oldest
        } else {
            size++;
        }
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
    }

    // Display buffer
    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(head + i) % capacity]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Main method
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);
        cb.display();
    }
}


