import java.util.Scanner;

public class Reverse_Number {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        int number1= sc.nextInt();
        int temp=number1;
        int count=0;
        //counting number of digits
        while (temp>0){
            temp/=10;
            count++;
        }
        //decalare and intizialize array
        int [] arr=new int[count];

        for(int i=0;i<arr.length;i++){
            arr[i]=number1%10;
            number1/=10;
        }
        //printing array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
