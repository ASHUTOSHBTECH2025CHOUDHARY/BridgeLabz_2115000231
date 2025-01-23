import java.util.Scanner;

public class AbundantNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int sum=0;
        for(int i=0;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum>number){
            System.out.println("It is a Abundant number");
        }
        else{
            System.out.println("It is not a Abundant number");
        }
    }
}
