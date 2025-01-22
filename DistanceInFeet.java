import java.util.Scanner;

public class DistanceInFeet {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int distanceinfeet=sc.nextInt();
        double distanceinyards=distanceinfeet*(1/3.0);
        double distanceinmile=distanceinyards*(1/1760.0);
        System.out.println(distanceinmile+" ,"+distanceinfeet+" ,"+distanceinyards);
    }
}