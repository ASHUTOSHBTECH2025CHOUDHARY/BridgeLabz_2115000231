package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class student {
    private String id;
    private String name;
    private int age;
    private double marks;

    public student(String id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "{ ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks + " }";
    }
}

public class ObjectCSV{
    public static void main(String[] args) {
        String file = "C:\\Users\\ashut\\Documents\\CSV\\src\\main\\java\\org\\example\\students.csv";
        List<student> list = new ArrayList<>();
        try (CSVReader read = new CSVReader(new FileReader(file))) {
            List<String[]> rows = read.readAll();
            boolean first = true;
            for (String[] row : rows) {
                if (first) {
                    first = false;
                    continue;
                }
                list.add(new student(row[0], row[1], Integer.parseInt(row[2]), Double.parseDouble(row[3])));
            }
            for (student s : list) {
                System.out.println(s);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}