import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        System.out.println("Maximum number is"+maximum(number,number2,number3));
    }
    public static int maximum(int number1,int number2,int number3){
        return Math.max(number1,Math.max(number2,number3));
    }
}
