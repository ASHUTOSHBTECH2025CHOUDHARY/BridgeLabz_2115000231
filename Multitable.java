import java.util.Scanner;

public class Multitable {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>=6&&number<=9){
            for(int i=0;i<=10;i++){
                System.out.println(number+" * "+i+" = "+(number*i));
            }
        }
    }
}