import java.util.Scanner;

public class Criclearea {
    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextInt();
        double area=Math.PI * Math.pow(radius,2);
        System.out.println(area);
    }
}