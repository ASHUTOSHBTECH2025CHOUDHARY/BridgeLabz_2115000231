import java.util.Scanner;

public class BackwardPerfectly {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        for(int i=100;i>0;i++){
            if(number%1==0){
                System.out.println(i);
            }
        }
    }
}
