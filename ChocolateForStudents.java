import java.util.Scanner;

public class ChocolateForStudents {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int numberOfchocolates= sc.nextInt();
        int  numberOfChildren= sc.nextInt();
        System.out.println("The number of chocolates each child gets is "+(numberOfchocolates/numberOfChildren)+" and the number of remaining chocolates are "+(numberOfchocolates%numberOfChildren));
    }
}