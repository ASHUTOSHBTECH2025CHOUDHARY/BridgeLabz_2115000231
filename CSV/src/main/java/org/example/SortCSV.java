package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SortCSV {
    public static void main(String[] args) {
        String path = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees.csv";
        try (CSVReader read = new CSVReader(new FileReader(path))) {
            List<String[]> rows = read.readAll();
            boolean head = true;
            String[] top = rows.get(0);
            List<String[]> list = new ArrayList<>();
            for (String[] row : rows) {
                if (head) {
                    head = false;
                    continue;
                }
                list.add(row);
            }
            list.sort((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));
            System.out.println(Arrays.toString(top));
            for (int i = 0; i < Math.min(5, list.size()); i++) {
                System.out.println(Arrays.toString(list.get(i)));
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}