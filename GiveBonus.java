import java.util.Scanner;

public class GiveBonus {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int salary= sc.nextInt();
        int years= sc.nextInt();
        if(years>=5){
            System.out.println(((salary*5)/100));
        }
        else{
            System.out.println(0);
        }
    }
}