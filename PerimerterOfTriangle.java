import java.util.Scanner;

public class PerimerterOfTriangle {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        System.out.println(" The total number of rounds the athlete will run is "+((side3+side2+side1)/5)+" to complete 5 km");
    }
}