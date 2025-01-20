import java.util.Scanner;

public class PowerExponential {
    public  static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double number=sc.nextDouble();
        double exponential= sc.nextDouble();
        double powercalculated=Math.pow(number,exponential);
        System.out.println(powercalculated);
    }
}