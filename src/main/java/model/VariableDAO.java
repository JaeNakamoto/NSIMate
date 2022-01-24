package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VariableDAO {

    //*******************************
    //SELECT Variable
    //*******************************
    public static Variable searchVariable(int variable_id) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM variable WHERE variable_id= " + variable_id;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsVariable = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getVariableFromResultSet method and get variable object
            Variable variable = getVariableFromResultSet(rsVariable);

            //Return antenna object
            return variable;
        } catch (SQLException e) {
            System.out.println("While searching Variable with " +variable_id+ " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set variable Object's attributes and return variable object.
    private static Variable getVariableFromResultSet(ResultSet rs) throws SQLException {
        Variable variable = null;
        if (rs.next()) {
            variable = new Variable();
            variable.setVariable_id(rs.getInt("variable_id"));
            variable.setBatch_id(rs.getInt("batch_id"));
            variable.setAntenna_id(rs.getInt("antenna_id"));
            variable.setAntenna_serialnr(rs.getString("antenna_serialnr"));
            variable.setAntenna_modification(rs.getString("antenna_modification"));
            variable.setFeed_serialnr(rs.getString("feed_serialnr"));
            variable.setScan_startdate(rs.getString("scan_startdate"));
            variable.setScan_stopdate(rs.getString("scan_stopdate"));
            variable.setScan_starttime(rs.getString("scan_starttime"));
            variable.setScan_stoptime(rs.getString("scan_stoptime"));
            variable.setTemperature_min(rs.getFloat("temperature_min"));
            variable.setTemperature_max(rs.getFloat("temperature_max"));
            variable.setExcel_document_path(rs.getString("excel_document_path"));
        }
        return variable;
    }

    //*******************************
    //SELECT Variables
    //*******************************
    public static ObservableList<Variable> searchVariables() throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM variable";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsVariables = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getVariableList method and get variable object
            ObservableList<Variable> variablesList = getVariableList(rsVariables);

            //Return variable object
            return variablesList;
        } catch (SQLException e) {
            System.out.println("SQL SELECT Variables operation has failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from variable operation
    private static ObservableList<Variable> getVariableList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare an observable List which consists of Variable objects
        ObservableList<Variable> variableList = FXCollections.observableArrayList();

        while (rs.next()) {
            Variable variable = new Variable();
            variable.setVariable_id(rs.getInt("variable_id"));
            variable.setBatch_id(rs.getInt("batch_id"));
            variable.setAntenna_id(rs.getInt("antenna_id"));
            variable.setAntenna_serialnr(rs.getString("antenna_serialnr"));
            variable.setAntenna_modification(rs.getString("antenna_modification"));
            variable.setFeed_serialnr(rs.getString("feed_serialnr"));
            variable.setScan_startdate(rs.getString("scan_startdate"));
            variable.setScan_stopdate(rs.getString("scan_stopdate"));
            variable.setScan_starttime(rs.getString("scan_starttime"));
            variable.setScan_stoptime(rs.getString("scan_stoptime"));
            variable.setTemperature_min(rs.getFloat("temperature_min"));
            variable.setTemperature_max(rs.getFloat("temperature_max"));
            variable.setExcel_document_path(rs.getString("excel_document_path"));
            //Add variable to the ObservableList
            variableList.add(variable);
        }
        //return antennaList (ObservableList of Variables)
        return variableList;
    }

    //*************************************
    //DELETE variable
    //*************************************
    public static void deleteVariableWithId (String variable_id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM variable WHERE (variable_id = '" +variable_id+ "')";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing DELETE Variable Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT Variable
    //*************************************
    public static void insertAntenna (

            int batch_id,
            int antenna_id,
            String antenna_serialnr,
            String antenna_modification,
            String feed_serialnr,
            String scan_startdate,
            String scan_stopdate,
            String scan_starttime,
            String scan_stoptime,
            Float temperature_min,
            Float temperature_max,
            String excel_document_path

    ) throws SQLException, ClassNotFoundException {
        //Declare an INSERT statement
        String updateStmt =
                "INSERT INTO antenna " +
                        "(antenna_id, antenna_serialnr, antenna_modification, feed_serialnr, " +
                        "scan_startdate, scan_stopdate, scan_starttime, scan_stoptime, " +
                        "temperature_min, temperature_max, operator_id, excel_document_path) " +
                        "VALUES " +
                        "('" +antenna_id+ "','" +antenna_serialnr+ "','" +antenna_modification+ "','"
                        +feed_serialnr+ "','" +scan_startdate+ "','" +scan_stopdate+ "','" +scan_starttime+ "','"
                        +scan_stoptime+ "','" +temperature_min+ "','" +temperature_max+ "','" +excel_document_path+ "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing an INSERT Variable Operation: " + e);
            throw e;
        }
    }
}
