import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        // Start counting
        String path = "text.txt";
        count(path);
    }

    public static void count(String path) {
        // Word frequencies
        Map<String, Integer> freq = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            // Current line
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split(" ");
                for (String word : words) {
                    // Process words
                    // Skip empty
                    if (!word.isEmpty()) {
                        freq.put(word, freq.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Sort by frequency
        freq.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(5) // Top 5
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
