import java.util.Scanner;

public class BMI_with_Array {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of person");
        int people= sc.nextInt();
        double [] height=new double[people];
        double [] weights=new double[people];
        double [] bmivalues=new double[people];
        String [] bmistatus=new String[people];
        //Enter deatails of people
        for(int i=0;i<height.length;i++){
            System.out.println("Enter height and weight of a person");
            height[i]= sc.nextDouble();
            weights[i]= sc.nextDouble();
        }
        //calucating bmivalues of person
        for(int i=0;i<bmivalues.length;i++){
            bmivalues[i]=(height[i]/(weights[i]*weights[i]));
            if (bmivalues[i] <= 18.4) {
                bmistatus[i] = "Underweight";
            } else if (bmivalues[i] >= 18.5 && bmivalues[i] <= 24.9) {
                bmistatus[i] = "Normal";
            } else if (bmivalues[i] >= 25.0 && bmivalues[i] <= 39.9) {
                bmistatus[i] = "Overweight";
            } else {
                bmistatus[i] = "Obese";
            }
        }
        //printing height weight bmivalues and status of a person
        for(int i=0;i<people;i++){
            System.out.println("Detailes of person"+(i+1)+", "+height[i]+", "+weights[i]+", "+bmivalues[i]+", "+bmistatus[i]);
        }
        sc.close();
    }
}
