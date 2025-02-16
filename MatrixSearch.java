import java.util.Scanner;

public class MatrixSearch {
    public static boolean locateElement(int[][] grid, int key) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return false;
        }

        int rowCount = grid.length, colCount = grid[0].length;
        int start = 0, end = rowCount * colCount - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = grid[mid / colCount][mid % colCount]; // Map 1D index to 2D

            if (val == key) {
                return true;
            } else if (val < key) {
                start = mid + 1; // Search right half
            } else {
                end = mid - 1; // Search left half
            }
        }

        return false; // Not present
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] grid = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int key = sc.nextInt();

        boolean found = locateElement(grid, key);
        System.out.println("Is " + key + " in matrix? -> " + (found ? "Yes" : "No"));
    }
}

