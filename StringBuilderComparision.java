public class StringBuilderComparision {
    public static void main(String[] args) {
        int iterations = 1_000_000; // Number of strings to concatenate
        String text = "hello";

        // Measuring time for StringBuffer
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTime = System.nanoTime();
        long bufferTime = endTime - startTime;

        // Measuring time for StringBuilder
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;

        // Display results
        System.out.println(bufferTime / 1_000_000 + " ms");
        System.out.println(builderTime / 1_000_000 + " ms");
    }
}
