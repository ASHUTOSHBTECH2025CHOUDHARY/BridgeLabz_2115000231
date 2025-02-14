
public class InsertionSort {
    public static void insertionSort(int arr[],int n){
        for (int i = 1; i < n; i++) {
            // Pick the element to be inserted
            int key = arr[i];
            int j = i - 1;

            // Shift elements to the right to create space for insertion
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert the key in the correct position
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int []arr={32,32,3,1,3,44,2,44};
        int size=arr.length;
        insertionSort(arr,size);
        for(int a:arr){
            System.out.print(a+", ");
        }
    }
}
