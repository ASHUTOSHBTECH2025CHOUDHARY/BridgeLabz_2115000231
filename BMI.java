import java.util.Scanner;

public class BMI {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double height= sc.nextInt();
        height=height/100;
        double wright= sc.nextInt();
        doubel bmi=wright/(height*height);
        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if(bmi>=18.5&&bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi>=25.0&&bmi<=39.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
