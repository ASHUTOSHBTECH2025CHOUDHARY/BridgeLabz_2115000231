public class four{

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum value of an array
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        RandomNumberAnalyzer analyzer = new RandomNumberAnalyzer();

        // Generate an array of 5 four-digit random numbers
        int[] randomNumbers = analyzer.generate4DigitRandomArray(5);

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Find the average, minimum, and maximum values
        double[] results = analyzer.findAverageMinMax(randomNumbers);
        double average = results[0];
        int min = (int) results[1];
        int max = (int) results[2];

        // Display the results
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
