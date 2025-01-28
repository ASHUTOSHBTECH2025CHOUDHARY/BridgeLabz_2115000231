import java.util.*;

public class EmployeeBonous {

    public static double[][] generateSalaryAndService(int numEmployees) {
        Random rand = new Random();
        double[][] data = new double[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = rand.nextInt(90000) + 10000;
            data[i][1] = rand.nextInt(10) + 1;
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary;
            result[i][1] = salary + bonus;
            result[i][2] = bonus;
        }
        return result;
    }

    public static void displayTable(double[][] data) {
        double oldSalarySum = 0, newSalarySum = 0, totalBonus = 0;
        System.out.println("\nEmployee Bonus Table:");
        System.out.println("Employee\tOld Salary\tNew Salary\tBonus");
        for (int i = 0; i < data.length; i++) {
            oldSalarySum += data[i][0];
            newSalarySum += data[i][1];
            totalBonus += data[i][2];
            System.out.printf("%d\t\t%.2f\t%.2f\t%.2f\n", i + 1, data[i][0], data[i][1], data[i][2]);
        }
        System.out.println("\nTotal Old Salary: " + oldSalarySum);
        System.out.println("Total New Salary: " + newSalarySum);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        double[][] data = generateSalaryAndService(numEmployees);
        double[][] bonusData = calculateBonus(data);

        displayTable(bonusData);
    }
}

