import java.util.Scanner;

public class Amar {

    // Method to determine the youngest friend
    public String getYoungestFriend(int[] ageData, String[] friendNames) {
        int minAge = ageData[0];
        String youngest = friendNames[0];

        for (int i = 1; i < ageData.length; i++) {
            if (ageData[i] < minAge) {
                minAge = ageData[i];
                youngest = friendNames[i];
            }
        }
        return youngest;
    }

    // Method to determine the tallest friend
    public String getTallestFriend(double[] heightData, String[] friendNames) {
        double maxHeight = heightData[0];
        String tallest = friendNames[0];

        for (int i = 1; i < heightData.length; i++) {
            if (heightData[i] > maxHeight) {
                maxHeight = heightData[i];
                tallest = friendNames[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FriendsComparison comparator = new FriendsComparison();

        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input for ages
        System.out.println("Please enter the ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = input.nextInt();
        }

        // Input for heights
        System.out.println("Please enter the heights of Amar, Akbar, and Anthony (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Find and display the youngest friend
        String youngestFriend = comparator.getYoungestFriend(ages, names);
        System.out.println("The youngest friend is: " + youngestFriend);

        // Find and display the tallest friend
        String tallestFriend = comparator.getTallestFriend(heights, names);
        System.out.println("The tallest friend is: " + tallestFriend);

    }
}