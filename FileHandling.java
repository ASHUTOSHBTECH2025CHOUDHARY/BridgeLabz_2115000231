import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        //Path of files
        String sourse="Hello.txt";
        String destination="Destination.txt";
        try(FileInputStream fis=new FileInputStream(sourse);
            FileOutputStream fos=new FileOutputStream(destination)) {
            int data;
            while((data= fis.read())!=-1){
                fos.write(data);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File does not exist!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
