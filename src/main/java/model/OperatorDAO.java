package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OperatorDAO {
    //*******************************
    //SELECT an Operator
    //*******************************
    public static Antenna searchOperator(int operator_id) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM operator WHERE operator_id= " + operator_id;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsOperator = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getOperatorFromResultSet method and get operator object
            Operator operator = getOperatorFromResultSet(rsOperator);

            //Return operator object
            return operator;
        } catch (SQLException e) {
            System.out.println("While searching an Operator with " +operator_id+ " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set Operator Object's attributes and return operator object.
    private static Operator getOperatorFromResultSet(ResultSet rs) throws SQLException {
        Operator operator = null;
        if (rs.next()) {
            operator = new Operator();
            operator.setOperator_id(rs.getInt("operator_id"));
            operator.setFirst_name(rs.getString("first_name"));
            operator.setLast_name(rs.getString("last_name"));
            operator.setUsername(rs.getString("username"));
            operator.setPassword(rs.getString("password"));
            operator.setUser_privilege(rs.getString("user_privilege"));
        }
        return operator;
    }

    //*******************************
    //SELECT Operators
    //*******************************
    public static ObservableList<Operator> searchOperators () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM operator";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsOperators = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getOperatorList method and get operator object
            ObservableList<Operator> operatorsList = getOperatorList(rsOperators);

            //Return operator object
            return operatorsList;
        } catch (SQLException e) {
            System.out.println("SQL SELECT Operators operation has failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from operator operation
    private static ObservableList<Operator getOperatorList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare an observable List which consists of Operator objects
        ObservableList<Operator> operatorList = FXCollections.observableArrayList();

        while (rs.next()) {
            Operator operator = new Operator();
            operator.setOperator_id(rs.getInt("operator_id"));
            operator.setFirst_name(rs.getString("first_name"));
            operator.setLast_name(rs.getString("last_name"));
            operator.setUsername(rs.getString("username"));
            operator.setPassword(rs.getString("password"));
            operator.setUser_privilege(rs.getString("user_privilege"));
            //Add operator to the ObservableList
            operatorList.add(operator);
        }
        //Return operatorList (ObservableList of Operators)
        return operatorList;
    }

    //*************************************
    //DELETE an operator
    //*************************************
    public static void deleteOperatorWithId (String operator_id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM operator WHERE (operator_id = '" +operator_id+ "')";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing DELETE Operator Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT an operator
    //*************************************
    public static void insertOperator (

            String first_name,
            String last_name,
            String username,
            String password,
            String user_privilege

    ) throws SQLException, ClassNotFoundException {
        //Declare an INSERT statement
        String updateStmt =
                "INSERT INTO operator " +
                        "(first_name, last_name, username, password, user_privilege) " +
                        "VALUES " +
                        "('" +first_name+ "','" +last_name+ "','" +username+ "','"
                        +password+ "','" +user_privilege+ "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing an INSERT Operator Operation: " + e);
            throw e;
        }
    }

}
