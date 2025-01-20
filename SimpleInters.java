import java.util.Scanner;

public class SimpleInters {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int principal=sc.nextInt();
        int time=sc.nextInt();
        int rate= sc.nextInt();
        System.out.println((principal*time*rate)/100);
    }
}