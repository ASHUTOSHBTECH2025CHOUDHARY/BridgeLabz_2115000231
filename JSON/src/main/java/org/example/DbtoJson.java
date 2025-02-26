package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.*;

public class DbtoJson {
    public static void main(String[] args) throws SQLException {
        String dbUrl = "jdbc:mysql://localhost/bridgelabz";
        String dbUser = "root";
        String dbPass = "AshutoshChoudhary@1234";
        try (Connection connect = DriverManager.getConnection(dbUrl, dbUser, dbPass);
             Statement query = connect.createStatement();
             ResultSet ashutosh = query.executeQuery("SELECT * FROM employees")) {
            JSONArray jsonOutput = new JSONArray();
            while (ashutosh.next()) {
                JSONObject record = new JSONObject();
                record.put("id", ashutosh.getInt("id"));
                record.put("name", ashutosh.getString("name"));
                record.put("department", ashutosh.getString("department"));
                record.put("salary", ashutosh.getInt("salary"));
                jsonOutput.put(record);
            }
            System.out.println(jsonOutput);
        }
    }
}