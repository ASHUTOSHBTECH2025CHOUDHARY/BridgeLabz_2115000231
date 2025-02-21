import java.io.*;

// Writer thread class
class WriterTh extends Thread {
    private PipedOutputStream out;

    public WriterTh(PipedOutputStream out) {
        this.out = out;
    }

    public void run() {
        try {
            String msg = "Hello";
            out.write(msg.getBytes()); // Write message
            out.close(); // Close stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Reader thread class
class ReaderTh extends Thread {
    private PipedInputStream in;

    public ReaderTh(PipedInputStream in) {
        this.in = in;
    }

    public void run() {
        try {
            int data;
            while ((data = in.read()) != -1) { // Read data
                System.out.print((char) data);
            }
            in.close(); // Close stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Main class
public class Twothreads {
    public static void main(String[] args) {
        try {
            PipedOutputStream out = new PipedOutputStream(); // Output stream
            PipedInputStream in = new PipedInputStream(out); // Input stream

            WriterTh writer = new WriterTh(out); // Writer thread
            ReaderTh reader = new ReaderTh(in); // Reader thread

            writer.start(); // Start writer
            reader.start(); // Start reader
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

