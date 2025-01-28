import java.util.Random;

public class Matrix {
    public static int[][] createmat(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static int[][] addmat(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtractmat(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiplymat(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static int[][] transposemat(int[][] mat) {
        int[][] res = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                res[j][i] = mat[i][j];
        return res;
    }

    public static int det2x2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static int det3x3(int[][] mat) {
        return mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1])
                - mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0])
                + mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);
    }

    public static double[][] inverse2x2(int[][] mat) {
        double det = det2x2(mat);
        double[][] res = new double[2][2];
        res[0][0] = mat[1][1] / det;
        res[0][1] = -mat[0][1] / det;
        res[1][0] = -mat[1][0] / det;
        res[1][1] = mat[0][0] / det;
        return res;
    }

    public static double[][] inverse3x3(int[][] mat) {
        double det = det3x3(mat);
        double[][] res = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                for (int x = 0, m = 0; x < 3; x++) {
                    if (x == i) continue;
                    for (int y = 0, n = 0; y < 3; y++) {
                        if (y == j) continue;
                        minor[m][n++] = mat[x][y];
                    }
                    m++;
                }
                res[j][i] = ((i + j) % 2 == 0 ? 1 : -1) * det2x2(minor) / det;
            }
        return res;
    }

    public static void displaymat(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void displaymat(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = createmat(3, 3);
        int[][] mat2 = createmat(3, 3);
        displaymat(mat1);
        displaymat(mat2);
        displaymat(addmat(mat1, mat2));
        displaymat(subtractmat(mat1, mat2));
        displaymat(multiplymat(mat1, mat2));
        displaymat(transposemat(mat1));
        System.out.println(det3x3(mat1));
        displaymat(inverse3x3(mat1));
    }
}
