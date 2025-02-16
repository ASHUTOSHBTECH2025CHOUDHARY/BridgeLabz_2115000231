import java.util.Scanner;

public class ElementPeak {
    public static int locatePeak(int[] data) {
        int start = 0, end = data.length - 1;

        while (start < end) {
            int midPoint = start + (end - start) / 2;
            if ((midPoint == 0 || data[midPoint] > data[midPoint - 1]) &&
                    (midPoint == data.length - 1 || data[midPoint] > data[midPoint + 1])) {
                return midPoint;
            }
            if (midPoint > 0 && data[midPoint] < data[midPoint - 1]) {
                end = midPoint - 1;
            } else {
                start = midPoint + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = input.nextInt();
        }


        int peakIdx = locatePeak(data);
        System.out.println("Peak at position: " + peakIdx);
        System.out.println("Peak element: " + data[peakIdx]);
    }
}

