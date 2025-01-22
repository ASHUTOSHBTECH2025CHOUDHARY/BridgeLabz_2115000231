import java.util.Scanner;

public class Kgtopounds {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int kg=sc.nextInt();
        System.out.println("The weight of the person in pound is "+((1/2.2)*kg)+" and in kg is "+kg);
    }
}
