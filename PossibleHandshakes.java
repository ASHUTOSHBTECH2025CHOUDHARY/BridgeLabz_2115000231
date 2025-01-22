import java.util.Scanner;

public class PossibleHandshakes {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int person=sc.nextInt();
        System.out.println((person*(person-1))/2);
    }
}