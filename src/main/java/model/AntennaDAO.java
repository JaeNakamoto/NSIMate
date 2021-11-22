package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AntennaDAO {

    //*******************************
    //SELECT an Antenna
    //*******************************
    public static Antenna searchAntenna (int antenna_id) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM antenna WHERE antenna_id=" +antenna_id;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsAntenna = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get antenna object
            Antenna antenna = getAntennaFromResultSet(rsAntenna);

            //Return antenna object
            return antenna;
        } catch (SQLException e) {
            System.out.println("While searching an Antenna with " +antenna_id+ " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set Employee Object's attributes and return employee object.
    private static Antenna getAntennaFromResultSet(ResultSet rs) throws SQLException
    {
        Antenna antenna = null;
        if (rs.next()) {
            antenna = new Antenna();
            antenna.setAntenna_id(rs.getInt("antenna_id"));
            antenna.setVendorspecifications_id(rs.getInt("vendorspecifications_id"));
            antenna.setAntenna_name(rs.getString("antenna_name"));
            antenna.setAntenna_partnumber(rs.getString("antenna_partnumber"));
            antenna.setAntenna_serialnumber(rs.getString("antenna_serialnumber"));
            antenna.setAntenna_modification(rs.getString("antenna_modification"));
            antenna.setAntenna_powersupply(rs.getString("antenna_powersupply"));
            antenna.setAntenna_rx_tx_switch(rs.getString("antenna_rx_tx_switch"));
            antenna.setAntenna_coordinatesystem(rs.getString("antenna_coordinatesystem"));
            antenna.setAntenna_number_of_RFconnections(rs.getString("antenna_number_of_RFconnections"));
        }
        return antenna;
    }

    //*******************************
    //SELECT Antennas
    //*******************************
    public static ObservableList<Antenna> searchAntennas () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM antenna";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsAntennas = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getAntennaList method and get antenna object
            ObservableList<Antenna> antennaList = getAntennaList(rsAntennas);

            //Return antenna object
            return antennaList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has been failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from antenna operation
    private static ObservableList<Antenna> getAntennaList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which consists of Antenna objects
        ObservableList<Antenna> antennaList = FXCollections.observableArrayList();

        while (rs.next()) {
            Antenna antenna = new Antenna();
            antenna.setAntenna_id(rs.getInt("antenna_id"));
            antenna.setVendorspecifications_id(rs.getInt("vendorspecifications_id"));
            antenna.setAntenna_name(rs.getString("antenna_name"));
            antenna.setAntenna_partnumber(rs.getString("antenna_partnumber"));
            antenna.setAntenna_serialnumber(rs.getString("antenna_serialnumber"));
            antenna.setAntenna_modification(rs.getString("antenna_modification"));
            antenna.setAntenna_powersupply(rs.getString("antenna_powersupply"));
            antenna.setAntenna_rx_tx_switch(rs.getString("antenna_rx_tx_switch"));
            antenna.setAntenna_coordinatesystem(rs.getString("antenna_coordinatesystem"));
            antenna.setAntenna_number_of_RFconnections(rs.getString("antenna_number_of_RFconnections"));
            //Add antenna to the ObservableList
            antennaList.add(antenna);
        }
        //return empList (ObservableList of Antennas)
        return antennaList;
    }

    //*************************************
    //DELETE an antenna
    //*************************************
    public static void deleteAntennaWithId (String antenna_id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM employee WHERE (employee_id = '" +antenna_id+ "')";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing DELETE Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT an antenna
    //*************************************
    public static void insertAntenna (

            int antenna_id,
            int vendorspecifications_id,
            String antenna_name,
            String antenna_partnumber,
            String antenna_serialnumber,
            String antenna_modification,
            String antenna_powersupply,
            String antenna_rx_tx_switch,
            String antenna_coordinatesystem,
            String antenna_number_of_RFconnections

            ) throws SQLException, ClassNotFoundException {
        //Declare an INSERT statement
        String updateStmt =
                "INSERT INTO antenna " +
                        "(antenna_id, vendorspecifications_id, antenna_name, antenna_partnumber," +
                        "antenna_modification, antenna_powersupply, antenna_rx_tx_switch," +
                        "antenna_coordinatesystem, antenna_number_of_RFconnections) " +
                        "VALUES " +
                        "('" +antenna_name+ ",'" +antenna_partnumber+ ",'" +antenna_serialnumber+ ",'"
                        +antenna_modification+ ",'" +antenna_powersupply+ ",'" +antenna_rx_tx_switch+ ",'"
                        +antenna_coordinatesystem+ ",'" +antenna_number_of_RFconnections+ "')";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing an INSERT Operation: " + e);
            throw e;
        }
    }
}
