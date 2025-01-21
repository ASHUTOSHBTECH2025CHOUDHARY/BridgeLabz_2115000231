import java.util.Scanner;

public class InputDiscount {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int dicountPercent=sc.nextInt();
        int dicount=(fee*dicountPercent)/100;
        System.out.println("The discount amount is "+dicount+" and final discounted fee is INR "+(fee-dicount));
    }
}