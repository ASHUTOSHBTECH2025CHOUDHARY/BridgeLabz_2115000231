public class QuickSort {
    public static void quickSort(int arr[],int low,int high){
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        // If current element is smaller than pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        // Place pivot in correct position
        swap(arr, i + 1, high);
        return i + 1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int []arr={32,5,2,5,6,4};
        int size=arr.length;
        quickSort(arr,0,size-1);
        for(auto i:arr){
            System.out.println(i+", ");
        }
    }
}
