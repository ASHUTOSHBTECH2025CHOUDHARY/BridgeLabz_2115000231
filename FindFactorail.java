import java.util.Scanner;

public class FindFactorail {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number=1;
        long num=1;
        while(number>0){
            num*=number;
            number--;
        }
        System.out.println(num);
    }
}