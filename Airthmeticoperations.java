import java.util.Scanner;

public class Airthmeticoperations {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2= sc.nextInt();
        System.out.println("Addition, Subtraction,Multiplication and Division"+(number1+number2)+","+(number1-number2)+","+(number1*number2)+","+(number1/number2));
    }
}