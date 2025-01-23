import java.util.Scanner;

public class Armstrongnumber {
    public static void  main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int number1=number;
        int sum=0;
        while(number1>0){
            sum+=(number1%10);
            number1/=10;
        }
        if(number==sum) System.out.println("Armstrong number");
        else System.out.println("Not a Armstrong number");
    }
}
