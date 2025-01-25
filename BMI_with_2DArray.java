import java.util.Scanner;

public class BMI_with_2DArray {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of persons");
        int person= sc.nextInt();
        // Declaration of 2D array
        double [][] details=new double[person][3];
        String bmistatus =new String[person];
        //taking height values and calculating bmiValues
        for(int i=0;i<details.length;i++){
            System.out.println("Enter height and weight of a person = "+(i+1));
            details[i][0]=sc.nextInt();
            details[i][1]=sc.nextInt();
            details[i][2]=(details[i][0]/(details[i][1]*details[i][1]));
            if (details[i][2] <= 18.4) {
                bmistatus[i] = "Underweight";
            } else if (details[i][2] >= 18.5 && details[i][2] <= 24.9) {
                bmistatus[i] = "Normal";
            } else if (details[i][2]>= 25.0 && details[i][2] <= 39.9) {
                bmistatus[i] = "Overweight";
            } else {
                bmistatus[i] = "Obese";
            }
        }
        for(int i=0;i<person;i++){
            for (int j = 0; j < 3; j++) {
                System.out.println(" Detailes of person" + (i + 1) + ", " + details[i][0] + ", " +details[i][1] + ", " + details[i][2] + ", " + bmistatus[i]);
            }
        }
    }
}