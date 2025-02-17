public class LinearSearchAndBinarySearch {
    //Linear Search Algorithm for searching
    private static void linearSearch(int []arr,int target){
        for(int i:arr){
            if(i==target) return;
        }
        return;
    }
    //Binary Search Algorithm for searching
    private static void binarySearch(int []arr,int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target) return;
            else if(arr[mid]>target) end=mid-1;
            else start=mid+1;
        }
    }
    public static void main(String[] args) {
        //Array with initialized values
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        long start= System.nanoTime();
        linearSearch(arr,4);
        long lineartime=System.nanoTime()-start;
        start=System.nanoTime();
        binarySearch(arr,0,n-1,5);
        long binarytime=System.nanoTime()-start;
        System.out.println("Linear Search time "+ lineartime);
        System.out.println("Binary Search time "+ binarytime);
    }
}

