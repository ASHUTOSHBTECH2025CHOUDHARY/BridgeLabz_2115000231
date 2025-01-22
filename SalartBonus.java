import java.util.Scanner;

public class SalartBonus {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int salary= sc.nextInt();
        int bonus= sc.nextInt();
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+(salary+bonus));
    }
}