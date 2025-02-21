import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptions {
    public static void main(String[] args) {
        //File path
        String input="Example.txt";
        //try catch
        try(BufferedReader br=new BufferedReader(new FileReader(input))){
            System.out.println("File found");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
