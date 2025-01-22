import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int temp=number2;
        number2=number1;
        number1=temp;
        System.out.println("The swapped numbers are "+number1+" and "+number2);
    }
}
