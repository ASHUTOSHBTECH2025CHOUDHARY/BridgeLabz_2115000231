import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderConsole {
    public static void main(String[] args) {
        // Reading input from console
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter details below");
            String name=br.readLine();
            String age=br.readLine();
            String language=br.readLine();
            String data=name+" "+age+" "+language;
            try(FileWriter witter=new FileWriter("Destination.txt")) {
                    witter.write(data);
                System.out.println("Thank you");
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
