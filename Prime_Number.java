import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(isprime(number)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
    public static boolean isprime(int number){
        for(int i=0;i*i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
