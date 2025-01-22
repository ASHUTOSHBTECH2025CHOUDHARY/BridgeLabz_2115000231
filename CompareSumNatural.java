import java.util.Scanner;

public class CompareSumNatural {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=(n*(n+1))/2;
        int sum1=0;
        for(int i=n;i>0;i--){
            sum1+=i;
        }
        if(sum1==sum){
            System.out.println("Natural Number");
        }
        else{
            System.out.println("Not a Natural Number");
        }
    }
}