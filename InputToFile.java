import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputToFile {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            FileWriter fw = new FileWriter("output.txt");
            String text;

            while (!(text = br.readLine()).equals("exit")) {
                fw.write(text + "\n");
            }

            fw.close();
            br.close();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}

