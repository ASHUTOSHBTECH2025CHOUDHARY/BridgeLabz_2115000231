import java.io.*;

public class LargeFile {
    public static void main(String[] args) {
        // Define file path
        String filePath = "input.txt";
        // Process file
        readLargeFile(filePath);
    }

    // Read and filter lines
    public static void readLargeFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            // Handle exception
            e.printStackTrace();
        }
    }
}
