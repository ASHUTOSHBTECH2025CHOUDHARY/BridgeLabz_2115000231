import java.util.Scanner;

public class NumberOfChocolate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of chocolate and students");
        int chocolate= sc.nextInt();
        int students= sc.nextInt();
        int [] ans=findRemainderAndQuotient(chocolate,students);
        System.out.println("Chocolate per student is "+ans[1]);
        System.out.println("Remaining Chocolate are"+ ans[0]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int [] temp=new int[2];
        temp[0]=number%divisor;
        temp[1]=number/divisor;
        return temp;
    }

}
