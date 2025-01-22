import java.util.Scanner;

public  class FindFactorailforloop {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number=1;
        long num=1;
        for(;number>0;number--){
            num*=number;
        }
        System.out.println(num);
    }
}