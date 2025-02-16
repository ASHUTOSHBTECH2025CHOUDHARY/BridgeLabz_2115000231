import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("example.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String content;

            while ((content = buffer.readLine()) != null) {
                System.out.println(content);
            }

            buffer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

