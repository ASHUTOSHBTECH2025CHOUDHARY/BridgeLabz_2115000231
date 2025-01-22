import java.util.Scanner;

public class ZeroCounter {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int temp = -1;
        while (temp != 0) {
            temp = sc.nextInt();
            sum += temp;
        }
        System.out.println(sum);
    }
}