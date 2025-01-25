import java.util.Scanner;

public class Frequency_of_digits {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number= sc.nextInt();
        int []  frequency = new int[10];
        // find  frequency of digits
        while(number>0){
            frequency[number%10]++;
            number/=10;
        }
        // Printing  frequency of digits
        for(int i=0;i<frequency.length;i++){
            System.out.println("Digit  "+i+" has a  frequency of "+frequency[i]);
        }
    }
}
