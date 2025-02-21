import java.util.Scanner;

// Custom exception for invalid age
class AgeBelow extends Exception {
    public AgeBelow(String errorMessage) {
        super(errorMessage);
    }
}

public class AgeException {
    // Method to check if age meets the minimum requirement
    public static void checkAgeRequirement(int userAge) throws AgeBelow {
        if (userAge < 18) {
            throw new AgeBelow("Age must be 18 or above.");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int userAge = input.nextInt();
            // Verify the age
            checkAgeRequirement(userAge);
        } catch (AgeBelow e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number for age.");
        }
    }
}
