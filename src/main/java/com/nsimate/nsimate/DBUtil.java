package com.nsimate.nsimate;

import java.sql.*;

public class DBUtil {
    // Declare JDBC Driver
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    // Connection
    public static Connection databaseLink = null;

    // Processes database connection
    public static Connection dbConnect(String username, String password) {
        String url = "jdbc:mysql://localhost/";

        try {
            Class.forName(JDBC_DRIVER);
            databaseLink = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Couldn't connect to database");
        }

        System.out.println(databaseLink);
        return databaseLink;
    }

    // Processes database disconnection
    public static void dbDisconnect () {
        try {
            databaseLink.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.err.println("Couldn't close connection");
        }
    }

    // Processes queries to the database
    public static Connection dbExecuteQuery(String username, String password, String schema, String query) {
        String url = "jdbc:mysql://localhost/" + schema;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, username, password);
            try(PreparedStatement preparedStatement = databaseLink.prepareStatement(query)) {
                try(ResultSet resultSet = preparedStatement.executeQuery()){
                    System.out.println("Query Executed: " + resultSet);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Query not executed");
        }

        System.out.println(databaseLink);
        return databaseLink;
    }
}
