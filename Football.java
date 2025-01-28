import java.util.Random;

public class Football {

    public static int[] generateheights(int size, int min, int max) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }

    public static int calculatesum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculatemean(int[] heights) {
        int sum = calculatesum(heights);
        return (double) sum / heights.length;
    }

    public static int findshortestheight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findtallestheight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void displayheights(int[] heights) {
        System.out.print("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " cm ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] heights = generateheights(11, 150, 250);
        displayheights(heights);
        System.out.println("Shortest Height: " + findshortestheight(heights) + " cm");
        System.out.println("Tallest Height: " + findtallestheight(heights) + " cm");
        System.out.println("Mean Height: " + calculatemean(heights) + " cm");
    }
}
