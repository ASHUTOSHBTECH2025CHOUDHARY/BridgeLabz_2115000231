import java.util.Scanner;

public class DoubleOpearator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        System.out.println(a+b*c);
        System.out.println(a*b+c);
        System.out.println(a/b+c);
        System.out.println(a%b+c);
    }
}
