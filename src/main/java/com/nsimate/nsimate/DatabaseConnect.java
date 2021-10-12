package com.nsimate.nsimate;

import java.sql.*;

public class DatabaseConnect {
    public static Connection databaseLink;

    public static Connection databaseLogin(String username, String password) {
        String schema = "users";
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
