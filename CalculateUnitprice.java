import java.util.Scanner;

public class CalculateUnitprice {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int unitprice=sc.nextInt();
        int quantity=sc.nextInt();
        System.out.println("The total purchase price is INR "+(unitprice*quantity) + " if the quantity" + quantity+" and unit price is INR "+unitprice);
    }
}