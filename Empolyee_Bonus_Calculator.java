import java.util.Scanner;

public class Empolyee_Bonus_Calculator {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        int totalEmployees=sc.nextInt();
        double [] employeeSalaries = new double[totalEmployees];
        double [] employeeYearsOfService = new double[totalEmployees];
        double [] employeeBonuses = new double[totalEmployees];
        double [] updatedSalaries = new double[totalEmployees];
        // Constants for bonus percentages
        double BONUS_PERCENTAGE_ABOVE_5_YEARS = 0.05; // 5% bonus
        double BONUS_PERCENTAGE_5_YEARS_OR_LESS = 0.02; // 2% bonus
        double totalBonusPayout = 0;
        double totalOriginalSalaries = 0;
        double totalUpdatedSalaries = 0;
        // Input of employeeSalaries data
        for(int i=0;i<employeeSalaries.length;i++){
            employeeSalaries[i]=sc.nextDouble();
        }
        // Input of employeeYearsOfService data
        for(int i=0;i<employeeYearsOfService.length;i++){
            employeeYearsOfService[i]=sc.nextDouble();
        }
        // calculating bonus and salaries
        for(int i=0;i<employeeBonuses.length;i++){
            //Adding bonus acc to years of experience
            if(employeeYearsOfService[i]>5){
                employeeBonuses[i]=employeeSalaries[i]*BONUS_PERCENTAGE_ABOVE_5_YEARS;
            }
            else{
                employeeBonuses[i]=employeeSalaries[i]*BONUS_PERCENTAGE_5_YEARS_OR_LESS;
            }
            updatedSalaries[i]=employeeSalaries[i]+employeeBonuses[i];
            totalBonusPayout+=employeeBonuses[i];
            totalOriginalSalaries+=employeeSalaries[i];
            totalUpdatedSalaries+=updatedSalaries[i];
        }
        System.out.println(totalBonusPayout+" "+totalOriginalSalaries+" "+totalUpdatedSalaries);
    }
}
