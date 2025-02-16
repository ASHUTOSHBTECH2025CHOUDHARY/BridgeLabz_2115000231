
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StrConcatWords {
    public static void main(String[] args) {
        String path = "largefile.txt";

        // Counting words using FileReader
        long t1 = System.currentTimeMillis();
        int count1 = 0;
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count1 += words.length;
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Word count (FileReader): " + count1);
        System.out.println("Time taken (FileReader): " + (t2 - t1) + " ms");

        // Counting words using InputStreamReader
        t1 = System.currentTimeMillis();
        int count2 = 0;
        try (FileReader fr = new FileReader(path);
             InputStreamReader isr = new InputStreamReader(fr);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count2 += words.length;
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
        t2 = System.currentTimeMillis();
        System.out.println("\nWord count (InputStreamReader): " + count2);
        System.out.println("Time taken (InputStreamReader): " + (t2 - t1) + " ms");
    }
}
