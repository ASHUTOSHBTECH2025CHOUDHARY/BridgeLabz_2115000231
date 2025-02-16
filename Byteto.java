import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Byteto {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("data.bin");
            InputStreamReader reader = new InputStreamReader(in, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String text;

            while ((text = br.readLine()) != null) {
                System.out.println(text);
            }

            br.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}

