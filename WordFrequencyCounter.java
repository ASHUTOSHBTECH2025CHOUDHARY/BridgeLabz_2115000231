import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String filePath = "input.txt"; // File path
        Map<String, Integer> wordCount = calculateWordFrequency(filePath);

        // Print frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static Map<String, Integer> calculateWordFrequency(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Clean and lowercase
                String cleanedLine = line.replaceAll("[^a-zA-Z\s]", "").toLowerCase();

                // Split words
                String[] words = cleanedLine.split("\\s+");

                // Count words
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("File read error: " + e.getMessage());
        }

        return wordCount;
    }
}
