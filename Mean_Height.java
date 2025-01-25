import java.util.Scanner;

public class Mean_Height {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        double [] height=new double[11];
        double sum=0;
        // taking height input
        System.out.println("Enter height of the players");
        for(int i=0;i<height.length;i++){
            height[i]= sc.nextDouble();
        // Adding to find the sum of height array
            sum+=height[i];
        }
        //Find mean of the height array
        double mean= sum/11;
        System.out.println("the mean height of the football team "+mean+".");
    }
}