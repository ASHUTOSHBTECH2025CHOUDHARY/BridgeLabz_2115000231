import java.util.Scanner;

public class InputDiscount {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int discountPercent=sc.nextInt();
        int discount=(fee*discountPercent)/100;
        System.out.println("The discount amount is "+discount+" and final discounted fee is INR "+(fee-discount));
    }
}