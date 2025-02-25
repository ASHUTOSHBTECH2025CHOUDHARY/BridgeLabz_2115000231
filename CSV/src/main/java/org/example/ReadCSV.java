    package org.example;
    import com.opencsv.CSVReader;
    import com.opencsv.exceptions.CsvException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.List;

    public class ReadCSV {
        public static void main(String[] args) {
            //Reading Student.csv file
            String filePath = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\students.csv";
            try (CSVReader reading = new CSVReader(new FileReader(filePath))) {
                //Reading all data from file
                List<String[]> records = reading.readAll();
                boolean isHeader = true;
                //Printing csv file
                for (String[] record : records) {
                    if (isHeader) {
                        isHeader = false;
                        continue;
                    }
                    System.out.printf("ID: %s, Name: %s, Age: %s, Marks: %s%n",
                            record[0], record[1], record[2], record[3]);
                }
            } catch (IOException | CsvException e) {
                e.printStackTrace();
            }
        }
    }
