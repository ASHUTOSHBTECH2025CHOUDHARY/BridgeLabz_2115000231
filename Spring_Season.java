import java.util.Scanner;

public class Spring_Season {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month and day");
        int month=sc.nextInt();
        int day=sc.nextInt();
        find_Spring(month,day);
    }
    public static void find_Spring(int month,int day){
        if(3==month&&day>=20){
            System.out.println("It is a spring season");
        }
        else if(month>=4&&month<=5){
            System.out.println("It is a spring season");
        }
        else if(month==6&&day<=20){
            System.out.println("It is a spring season");
        }
        else{
            System.out.println("It is not a spring season");
        }
    }
}
