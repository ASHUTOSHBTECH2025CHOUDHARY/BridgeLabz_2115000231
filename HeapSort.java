public class HeapSort {
    // Method to perform Heap Sort on the salary array
    public static void sortSalaries(int[] salaries) {
        int length = salaries.length;

        // Step 1: Convert the array into a Max Heap
        for (int i = length / 2 - 1; i >= 0; i--) {
            restructureHeap(salaries, length, i);
        }

        // Step 2: Extract elements from heap and sort
        for (int i = length - 1; i > 0; i--) {
            swapValues(salaries, 0, i); // Move highest value to the end
            restructureHeap(salaries, i, 0); // Restore heap property
        }
    }

    // Function to ensure the heap maintains its max-heap property
    private static void restructureHeap(int[] arr, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        // Check if left child is larger than current root
        if (leftChild < heapSize && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // Check if right child is larger than current largest
        if (rightChild < heapSize && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // If largest is not root, swap and reapply heapify
        if (largest != rootIndex) {
            swapValues(arr, rootIndex, largest);
            restructureHeap(arr, heapSize, largest);
        }
    }

    // Helper function to swap two elements in an array
    private static void swapValues(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int[] salaryDemands = {55000, 70000, 50000, 80000, 45000, 60000};
        sortSalaries(salaryDemands);
        for(int i:salaryDemands){
            System.out.print(i+", ");
        }
    }
}
