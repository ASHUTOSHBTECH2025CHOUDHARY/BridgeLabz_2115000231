package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UpdateCSV {
    public static void main(String[] args) {
        String inFile = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees.csv";
        String outFile = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\emp_updated.csv";
        try (CSVReader r = new CSVReader(new FileReader(inFile));
             CSVWriter w = new CSVWriter(new FileWriter(outFile))) {
            List<String[]> data = r.readAll();
            boolean firstRow = true;
            for (String[] row : data) {
                if (firstRow) {
                    w.writeNext(row);
                    firstRow = false;
                    continue;
                }
                if (row[2].equalsIgnoreCase("IT")) {
                    double sal = Double.parseDouble(row[3]);
                    row[3] = String.valueOf(sal * 1.1);
                }
                w.writeNext(row);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
