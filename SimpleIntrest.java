import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int principal= sc.nextInt();
        int time= sc.nextInt();
        int rate= sc.nextInt();
        System.out.println("The Simple Interest is "+((principal*time*rate)/100)+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
    }
}