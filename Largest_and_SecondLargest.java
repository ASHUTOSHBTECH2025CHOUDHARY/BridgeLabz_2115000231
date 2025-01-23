import java.util.Scanner;

public class Largest_and_SecondLargest {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int [] arr=new int[10];
        int largest=0;
        int secondLargest=0;
        //intallizing array
        for(int i=0;(number!=0)&&i<arr.length;i++){
            arr[i]=number%10;
            number/=10;
        }
        //Finding Largest and second largest
        for (int i=0;i<arr.length;i++){
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }
        System.out.println("Largest and Second Largest numbers are "+largest+", "+secondLargest);
    }
}
