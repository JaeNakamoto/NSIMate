package com.nsimate.nsimate;

import java.sql.*;

public class DatabaseConnector {
    public static Connection databaseLink;

    // Processes login requests
    public static Connection databaseLogin(String username, String password) {
        String url = "jdbc:mysql://localhost/";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(databaseLink);
        return databaseLink;
    }

    // Processes queries to the database
    public static Connection databaseQuery(String username, String password, String schema, String query) {
        String url = "jdbc:mysql://localhost/" + schema;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(databaseLink);
        return databaseLink;
    }
}
