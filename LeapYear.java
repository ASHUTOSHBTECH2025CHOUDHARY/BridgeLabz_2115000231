import java.util.Scanner;

public class LeapYear {
    public  static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        if(year>=1582){
            if(year%4==0){
                if(year%100==0&&year%400!=0){
                    System.out.println("Not a leap year");
                }
                else if(year%400==0){
                    System.out.println("Its a Leap year");
                }
            }
        }
    }
}