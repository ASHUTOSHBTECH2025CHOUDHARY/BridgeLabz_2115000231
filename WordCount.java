import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String key = "example";
        int count = 0;

        try {
            FileReader fr = new FileReader("example.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String w : words) {
                    if (w.equals(key)) {
                        count++;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The word '" + key + "' appears " + count + " times.");
    }
}

