import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%5==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
