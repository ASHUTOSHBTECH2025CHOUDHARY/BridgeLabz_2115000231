import java.io.*;

public class EfficientCopy {
    public static void main(String[] args) {
        //Path of files
        String sourse="Hello.txt";
        String destination="Destination.txt";
        long start=System.nanoTime();
        //With file input stream and FileOutputStream
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
        long end=System.nanoTime();
        System.out.println("Without buffer "+(end-start)/1000000.0+"ms");
        start=System.nanoTime();
        //FileInputStream and FileOutputStream
        try(BufferedInputStream bis=new BufferedInputStream (new FileInputStream(sourse));
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destination))) {
            byte []data=new byte[4096];
            int byteRead;
            while((byteRead= bis.read(data))!=-1){
                bos.write(data,0,byteRead);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File does not exist!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        end=System.nanoTime();
        System.out.println("With buffer "+(end-start)/1000000.0+"ms");
    }
}
