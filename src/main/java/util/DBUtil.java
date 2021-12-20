package util;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.*;

public class DBUtil {

    //Declare JDBC Driver
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //Connection
    public static Connection conn = null;
    //Connection url
    private static String url = "jdbc:mysql://localhost/nsi";

    //*************************************
    //Connect to DB
    //*************************************
    public static Connection dbConnect() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(url, "root", "antennemeetruimte");
            System.out.println("Connected to database");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Unable to connect to database");
        }

        System.out.println(conn);
        return conn;
    }

    //*************************************
    //Disconnect from DB
    //*************************************
    public static void dbDisconnect() throws SQLException {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    //*************************************
    //Execute Query operation
    //*************************************
    public static ResultSet dbExecuteQuery(String queryStmt) throws SQLException, ClassNotFoundException {
        //Declare statement, resultSet and CachedResultSet as null
        Statement stmt = null;
        ResultSet resultSet = null;
        CachedRowSetImpl crs = null;

        try {
            //Connect to DB (Establish MySQL Connection)
            dbConnect();
            System.out.println("Select statement: " + queryStmt + "\n");

            //Create statement
            stmt = conn.createStatement();

            //Execute select (query) operation
            resultSet = stmt.executeQuery(queryStmt);

            //CachedRowSet Implementation
            //In order to prevent "java.sql.SQLRecoverableException: Closed Connection: next" error
            //We are using CachedRowSet
            crs = new CachedRowSetImpl();
            crs.populate(resultSet);
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeQuery operation : " + e);
            throw e;
        } finally {
            if (resultSet != null) {
                //Close resultSet
                resultSet.close();
            }
            if (stmt != null) {
                //Close Statement
                stmt.close();
            }
            //Close connection
            dbDisconnect();
        }

        //Return CachedRowSet
        return crs;
    }

    //*************************************
    //DB Execute Update Operation
    //*************************************
    public static void dbExecuteUpdate(String sqlStmt) throws SQLException, ClassNotFoundException {
        //Declare statement as null
        Statement stmt = null;

        try {
            //Connect to DB (Establish MySQL Connection)
            dbConnect();
            //Create Statement
            stmt = conn.createStatement();
            //Run executeUpdate operation with given sql statement
            stmt.executeUpdate(sqlStmt);
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeUpdate operation : " + e);
            throw e;
        } finally {
            if (stmt != null) {
                //Close statement
                stmt.close();
            }

            //Close connection
            dbDisconnect();
        }
    }

}