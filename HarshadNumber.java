import java.util.Scanner;

public class HarshadNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int numner= sc.nextInt();
        int num=numner;
        int sum=0;
        while (num>0){
            sum+=(num%10);
            num/=10;
        }
        if(numner%sum%==0) {
            System.out.println("It is a Harshad number");
        }
        else{
            System.out.println("It is not a Harshad number");
        }
    }
}
