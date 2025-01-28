import java.util.Scanner;

public class Student_Vote_Checkout {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        // Validate if age is negative
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student_Vote_Checkout voteChecker = new Student_Vote_Checkout();

        // Define an array to store ages of 10 students
        int[] studentAges = new int[10];

        // Loop to take user input for each student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Loop to check and display if each student can vote
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " can vote: " + canVote);
        }

    }
}
