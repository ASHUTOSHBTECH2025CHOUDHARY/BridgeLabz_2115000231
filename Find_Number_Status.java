import java.util.Scanner;

public class Find_Number_Status {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number= sc.nextInt();
        find_Status(number);
    }
    public static void find_Status(int number){
        if(number>0){
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
