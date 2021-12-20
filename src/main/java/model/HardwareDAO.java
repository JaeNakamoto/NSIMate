/* package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HardwareDAO {

    //*******************************
    //SELECT Hardware
    //*******************************
    public static Hardware searchHardware(int hardware_id) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM hardware WHERE hardware_id= " +hardware_id;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsHardware = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get antenna object
            Hardware hardware = getHardwareFromResultSet(rsHardware);

            //Return antenna object
            return hardware;
        } catch (SQLException e) {
            System.out.println("While searching Hardware with " +hardware_id+ " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set Antenna Object's attributes and return antenna object.
    private static Hardware getHardwareFromResultSet(ResultSet rs) throws SQLException {
        Hardware hardware = null;
        if (rs.next()) {
            hardware = new Hardware();
            hardware.setHardware_id(rs.getInt("hardware_id"));
            hardware.setHW_coordinatesystem(rs.getString("HW_coordinatesystem"));
            hardware.setHW_groundplane(rs.getString("HW_groundplane"));
            hardware.setHW_absorber(rs.getString("HW_absorber"));
            hardware.setHW_separationrods(rs.getString("HW_separationrods"));
            hardware.setHW_probe(rs.getString("HW_separationrods"));
            hardware.setHW_MRE(rs.getInt("HW_MRE"));
            hardware.setHW_mechanical_adapter(rs.getString("HW_mechanical_adapter"));
            hardware.setHW_grounding_option(rs.getString("HW_grounding_option"));
            hardware.setHW_control_cable(rs.getString("HW_control_cable"));
            hardware.setHW_NF_FF(rs.getString("HW_NF_FF"));
            hardware.setHW_breakoutbox(rs.getString("HW_breakoutbox"));
            hardware.setHW_special1(rs.getString("HW_special1"));
        }
        return hardware;
    }

    //*******************************
    //SELECT Hardware
    //*******************************
    public static ObservableList<Hardware> searchHardware () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM hardware";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsHardware = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getHardwareList method and get antenna object
            ObservableList<Hardware> hardwareList = getHardwareList(rsHardware);

            //Return hardware object
            return hardwareList;
        } catch (SQLException e) {
            System.out.println("SQL SELECT operation has failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from antenna operation
    private static ObservableList<Hardware> getHardwareList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which consists of Hardware objects
        ObservableList<Hardware> hardwareList = FXCollections.observableArrayList();

        while (rs.next()) {
            Hardware hardware = new Hardware();
            hardware.setHardware_id(rs.getInt("hardware_id"));
            hardware.setHW_coordinatesystem(rs.getString("HW_coordinatesystem"));
            hardware.setHW_groundplane(rs.getString("HW_groundplane"));
            hardware.setHW_absorber(rs.getString("HW_absorber"));
            hardware.setHW_separationrods(rs.getString("HW_separationrods"));
            hardware.setHW_probe(rs.getString("HW_separationrods"));
            hardware.setHW_MRE(rs.getInt("HW_MRE"));
            hardware.setHW_mechanical_adapter(rs.getString("HW_mechanical_adapter"));
            hardware.setHW_grounding_option(rs.getString("HW_grounding_option"));
            hardware.setHW_control_cable(rs.getString("HW_control_cable"));
            hardware.setHW_NF_FF(rs.getString("HW_NF_FF"));
            hardware.setHW_breakoutbox(rs.getString("HW_breakoutbox"));
            hardware.setHW_special1(rs.getString("HW_special1"));
            //Add antenna to the ObservableList
            hardwareList.add(hardware);
        }
        //return hardwareList (ObservableList of Hardware)
        return hardwareList;
    }

    //*************************************
    //DELETE an antenna
    //*************************************
    public static void deleteAntennaWithId (String antenna_id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM antenna WHERE (employee_id = '" +antenna_id+ "')";

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
                        "(antenna_name, antenna_partnumber, antenna_serialnumber, " +
                        "antenna_modification, antenna_powersupply, antenna_rx_tx_switch, " +
                        "antenna_coordinatesystem, antenna_number_of_RFconnections) " +
                        "VALUES " +
                        "('" +antenna_name+ "','" +antenna_partnumber+ "','" +antenna_serialnumber+ "','"
                        +antenna_modification+ "','" +antenna_powersupply+ "','" +antenna_rx_tx_switch+ "','"
                        +antenna_coordinatesystem+ "','" +antenna_number_of_RFconnections+ "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing an INSERT Operation: " + e);
            throw e;
        }
    }
}
*/