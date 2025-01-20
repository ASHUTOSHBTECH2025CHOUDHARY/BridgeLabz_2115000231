import java.util.Scanner;

public class VolumeofCylinder {
    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        double height=sc.nextDouble();
        double vol=Math.PI * Math.pow(radius,2) * height;
        System.out.println(vol);
    }
}