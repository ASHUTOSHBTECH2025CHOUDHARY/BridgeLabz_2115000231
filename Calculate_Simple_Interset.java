import java.util.Scanner;

public class Calculate_Simple_Interset {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle rate and time ");
        int principle= sc.nextInt();
        int time= sc.nextInt();
        int rate= sc.nextInt();
        int Simple_Interst=findsimpleinterest(principle,time,rate);
        System.out.println("The Simple Interest is " + Simple_Interst + " for Principal "
                + principle + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
    }
    public static int findsimpleinterest(int principle,int time,int rate){
        int SI=0;
        SI=(principle*rate*time)/100;
        return SI;
    }
}
