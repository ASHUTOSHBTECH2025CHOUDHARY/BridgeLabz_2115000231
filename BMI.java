import java.util.Scanner;

public class BMI{

    // Method to calculate BMI and populate the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double heightInMeters = height / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;
        }
    }
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][3];
        String[] bmiStatus = new String[10];

        // Take user input for weight and height of 10 persons
        System.out.println("Enter weight (in kg) and height (in cm) for 10 persons:");
        for (int i = 0; i < personData.length; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(personData);

        // Determine BMI status for each person
        bmiStatus = determineBMIStatus(personData);

        // Display the results
        System.out.println("\nBMI Results:");
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < personData.length; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }
    }
}
