public class BubbleSort {
    //bubble sort the array
    public static void bubbleSort(int arr[],int n){
        int i,j,temp;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                // swapping the elements
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Declaration and initialization of array
        int []arr={3,2,4,52,4,23,43};
        // size of the array
        int size=7;
        //bubble sort
        bubbleSort(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
    }
}
