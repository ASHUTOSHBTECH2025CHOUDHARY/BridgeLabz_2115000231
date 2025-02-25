package org.example;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\employees.csv";
        // Employee data with names
        String[][] employee = {
                {"ID", "Name", "Department", "Salary"}, // Header row
                {"101", "Honey Badsha", "Engineering", "75000"},
                {"102", "Honey Badsha", "Marketing", "68000"},
                {"103", "Honey Badsha", "Finance", "72000"},
                {"104", "Honey Badsha", "HR", "65000"},
                {"105", "Honey Badsha", "IT", "78000"}
        };
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            // Write each employee record to the CSV file
            for (String[] i : employee) {
                writer.writeNext(i);
            }
            System.out.println("CSV file created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
