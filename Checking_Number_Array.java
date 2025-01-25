import java.util.Scanner;

public class Checking_Number_Array {
    public static void main(String[] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        int [] number=new int[5];
        System.out.println("Enter the numbers");
        //Taking input from user
        for(int i=0;i<number.length;i++){
            number[i]= sc.nextInt();;
        }
        // print status of number
        for(int i=0;i<number.length;i++){
            if(number[i]>0){
                if(number[i]%2==0){
                    System.out.println("Number "+number[i]+"is positive and even");
                }
                else{
                    System.out.println("Number "+number[i]+"is negative and even");
                }
            }
            else if(number[i]==0){
                System.out.println("Number "+number[i]+"is Zero");
            }
            else{
                System.out.println("Number "+number[i]+"is negative");
            }
        }
        if(number[0]==number[4]){
            System.out.println("equal");
        }
        else if(number[i]>number[4]){
            System.out.println("Greater");
        }
        else{
            System.out.println("Lesser");
        }
    }
}