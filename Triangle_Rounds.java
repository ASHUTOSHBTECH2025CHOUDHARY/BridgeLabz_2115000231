import java.util.Scanner;

public class Triangle_Rounds {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of triangle side1 side2 and side 3");
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3= sc.nextInt();
        int rounds=find_Rounds(side1,side2,side3);
        System.out.println("Total no of rounds to complete 5 km run "+rounds);
    }
    public static int find_Rounds(int side1,int side2,int side3){
        int totalDistance=side1+side2+side3;
        int rounds=totalDistance/5;
        return rounds;
    }
}
