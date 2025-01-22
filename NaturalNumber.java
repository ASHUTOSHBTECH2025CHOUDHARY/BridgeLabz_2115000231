import java.util.Scanner;

public class NaturalNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=(number*(number+1))/2;
        if(sum>0){
            System.out.println("The sum of "+number+" natural number is"+sum);
        }
        else{
            System.out.println("The number "+number+" is not a natural number");
        }
    }
}