import java.util.Scanner;

public class Factorial {
    public static int fact(int number){
        if(number==1) return 1;
        return number*fact(number-1);
    }
    public static void solve(){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("Factorial is "+fact(number));
    }

    public static void main(String[] args) {
        solve();
    }
}
