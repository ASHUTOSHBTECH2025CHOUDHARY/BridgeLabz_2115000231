import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        String filePath = "";

        long start1 = System.nanoTime();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) { }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long timeFileReader = System.nanoTime() - start1;

        long start2 = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1) { }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long timeInputStreamReader = System.nanoTime() - start2;

        System.out.println("FileReader Time: " + (timeFileReader / 1_000_000) + " ms");
        System.out.println("InputStreamReader Time: " + (timeInputStreamReader / 1_000_000) + " ms");
    }
}
