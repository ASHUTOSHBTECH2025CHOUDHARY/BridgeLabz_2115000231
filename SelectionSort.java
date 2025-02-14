
public class SelectionSort {
    // Function to perform Selection Sort on the given array
    public static void sortExamScores(int[] scores) {
        int length = scores.length;

        for (int i = 0; i < length - 1; i++) {
            int smallestIndex = i; // Assume current index holds the smallest value

            // Search for the smallest element in the remaining array
            for (int j = i + 1; j < length; j++) {
                if (scores[j] < scores[smallestIndex]) {
                    smallestIndex = j; // Update index of the new smallest element
                }
            }

            // Swap the smallest found element with the element at the current index
            swapElements(scores, i, smallestIndex);
        }
    }

    // Helper method to swap two elements in the array
    private static void swapElements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int []arr={32,5,2,5,6,4};
        SelectionSort(arr);
        for(auto i:arr){
            System.out.println(i+", ");
        }
    }
    }
}
