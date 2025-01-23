import java.util.Scanner;

public class Power {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int n= sc.nextInt();
        int pow=1;
        for(int i=1;i<=n;i++){
            pow*=number;
        }
        System.out.println(pow);
    }
}
