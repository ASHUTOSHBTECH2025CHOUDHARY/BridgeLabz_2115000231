import java.io.*;

public class TextFileReader {
    public static void main(String[] args) {
        String filePath = "data.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            String initialLine = fileReader.readLine();
            if (initialLine != null) {
                System.out.println(initialLine);
            } else {
                System.out.println("The file is empty.");
            }
        } catch (FileNotFoundException e) {
            System.out.println(filePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
