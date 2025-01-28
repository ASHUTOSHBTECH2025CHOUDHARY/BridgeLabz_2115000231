import java.util.Scanner;

public class Quotient_and_Remainder {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers here");
        int divisor= sc.nextInt();
        int dividend= sc.nextInt();
        int [] ans=findRemainderAndQuotient(dividend,divisor);
        System.out.println("Quotient is "+ans[1]);
        System.out.println("Remainder is "+ans[0]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int [] temp=new int[2];
        temp[0]=number%divisor;
        temp[1]=number/divisor;
        return temp;
    }

}
