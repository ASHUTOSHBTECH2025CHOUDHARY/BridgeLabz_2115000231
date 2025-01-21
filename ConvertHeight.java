import java.util.Scanner;

public class ConvertHeight {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double height=sc.nextDouble();
        double hegihtinches=height/2.54;
        double heightFeet=hegihtinches/12;
        System.out.println("Your Height in cm is "+height+" while in feet is "+heightFeet+" and inches is "+hegihtinches);
    }
}