import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        boolean found=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                found=false;
            }
        }
        if(found==true){
            System.out.println("Its a prime number");
        }
        else{
            System.out.println("Its not a prime number");
        }
    }
}
