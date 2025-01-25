import java.util.Scanner;

public class Voting_Age_of_Students {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of students");
        int [] ages=new int[10];
        //taking input ages from user
        for(int i=0;i<ages.length;i++){
            System.out.println("Enter the age of student ="+(i+1));
            ages[i]=sc.nextInt();
        }
        //Printing the status of students
        for(int i=0;i<ages.length;i++){
            if(ages[i]>=18){
                System.out.println("The student with the age "+ages[i]+" can vote");
            }
            else{
                System.out.println("The student with the age "+ages[i]+" cannot vote");
            }
        }
    }
}
