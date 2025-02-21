import java.io.*;

public class ImageHandler {
    public static void main(String[] args) {
        String src = "input.jpg";
        String dest = "output.jpg";

        try {
            byte[] imgBytes = toBytes(src);
            toImage(imgBytes, dest);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    private static byte[] toBytes(String path) throws IOException {
        try (FileInputStream reading = new FileInputStream(path);
             ByteArrayOutputStream written = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int read;
            while ((read = reading.read(buffer)) != -1) {
                written.write(buffer, 0, read);
            }
            return written.toByteArray();
        }
    }

    private static void toImage(byte[] data, String path) throws IOException {
        try (ByteArrayInputStream written = new ByteArrayInputStream(data);
             FileOutputStream outputs = new FileOutputStream(path)) {
            byte[] buffer = new byte[4096];
            int read;
            while ((read = written.read(buffer)) != -1) {
                outputs.write(buffer, 0, read);
            }
        }
    }
}
