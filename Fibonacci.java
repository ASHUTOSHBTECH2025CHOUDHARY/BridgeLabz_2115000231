
public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;

        long start1 = System.nanoTime();
        int recursiveResult = fibonacciRecursive(n);
        long timeRecursive = System.nanoTime() - start1;

        long start2 = System.nanoTime();
        int iterativeResult = fibonacciIterative(n);
        long timeIterative = System.nanoTime() - start2;

        System.out.println("Recursive Fibonacci (" + n + "): " + recursiveResult);
        System.out.println("Iterative Fibonacci (" + n + "): " + iterativeResult);
        System.out.println("Recursive Time: " + (timeRecursive / 1_000_000) + " ms");
        System.out.println("Iterative Time: " + (timeIterative / 1_000_000) + " ms");
    }

    public static int Fibonacci(int n) {
        if (n <= 1) return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
