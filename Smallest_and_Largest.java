import java.util.Scanner;

public class Smallest_and_Largest {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int [] ans=findSmallestAndLargest(num1,num2,num3);
        System.out.println("Smallest number is "+ans[0]);
        System.out.println("Largest number is "+ans[1]);
    }
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int [] temp=new int[2];
        int minimum=Math.min(number1,Math.min(number2,number3));
        int maximum=Math.max(number1,Math.max(number2,number3));
        temp[0]=minimum;
        temp[1]=maximum;
        return temp;
    }
}
