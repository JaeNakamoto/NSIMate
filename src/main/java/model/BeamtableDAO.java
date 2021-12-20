package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BeamtableDAO {
    //*******************************
    //SELECT a Beamtable
    //*******************************
    public static Beamtable searchBeamtable(int beamtable_id) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM beamtable WHERE beamtable_id= " +beamtable_id;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsBeamtable = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get beamtable object
            Beamtable beamtable = getBeamtableFromResultset(rsBeamtable);

            //Return beamtable object
            return beamtable;
        } catch (SQLException e) {
            System.out.println("While searching a Beamtable with " +beamtable_id+ " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set Beamtable Object's attributes and return beamtable object.
    private static Beamtable getBeamtableFromResultset(ResultSet rs) throws SQLException {
        Beamtable beamtable = null;
        if (rs.next()) {
            beamtable = new Beamtable();
            beamtable.setBeamtable_id(rs.getInt("beamtable_id"));
            beamtable.setBeam_number(rs.getInt("beam_number"));
            beamtable.setBeam_dwell(rs.getInt("beam_dwell"));
            beamtable.setBeam_frequency(rs.getInt("beam_frequency"));
            beamtable.setBeam_phi_axis(rs.getString("beam_phi_axis"));
            beamtable.setBeam_az_axis(rs.getString("beam_az_axis"));
            beamtable.setBeam_pol_axis(rs.getString("beam_pol_axis"));
            beamtable.setBeam_x_axis(rs.getString("beam_x_axis"));
            beamtable.setBeam_y_axis(rs.getString("beam_y_axis"));
            beamtable.setBeam_aut_z(rs.getString("beam_aut_z"));
            beamtable.setBeam_aut_switch(rs.getString("beam_aut_switch"));
            beamtable.setBeam_RF_switch_driver(rs.getString("beam_RF_switch_driver"));
        }
        return beamtable;
    }

    //*******************************
    //SELECT Beamtables
    //*******************************
    public static ObservableList<Beamtable> searchBeamtables () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM beamtable";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsBeamtables = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getBeamtableList method and get beamtable object
            ObservableList<Beamtable> beamtableList = getBeamtableList(rsBeamtables);

            //Return beamtable object
            return beamtableList;
        } catch (SQLException e) {
            System.out.println("SQL SELECT operation has failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from beamtable operation
    private static ObservableList<Beamtable> getBeamtableList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare an observable List which consists of Beamtable objects
        ObservableList<Beamtable> beamtableList = FXCollections.observableArrayList();

        while (rs.next()) {
            Beamtable beamtable = new Beamtable();
            beamtable.setBeamtable_id(rs.getInt("beamtable_id"));
            beamtable.setBeam_number(rs.getInt("beam_number"));
            beamtable.setBeam_dwell(rs.getInt("beam_dwell"));
            beamtable.setBeam_frequency(rs.getInt("beam_frequency"));
            beamtable.setBeam_phi_axis(rs.getString("beam_phi_axis"));
            beamtable.setBeam_az_axis(rs.getString("beam_az_axis"));
            beamtable.setBeam_pol_axis(rs.getString("beam_pol_axis"));
            beamtable.setBeam_x_axis(rs.getString("beam_x_axis"));
            beamtable.setBeam_y_axis(rs.getString("beam_y_axis"));
            beamtable.setBeam_aut_z(rs.getString("beam_aut_z"));
            beamtable.setBeam_aut_switch(rs.getString("beam_aut_switch"));
            beamtable.setBeam_RF_switch_driver(rs.getString("beam_RF_switch_driver"));
            //Add beamtable to the ObservableList
            beamtableList.add(beamtable);
        }
        //return empList (ObservableList of Beamtables)
        return beamtableList;
    }

    //*************************************
    //DELETE a Beamtable
    //*************************************
    public static void deleteBeamtableWithId (String beamtable_id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM beamtable WHERE (beamtable_id = '" +beamtable_id+ "')";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing DELETE Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT a Beamtable
    //*************************************
    public static void insertBeamtable (

            int beamtable_id,
            int beam_number,
            int beam_dwell,
            int beam_frequency,
            String beam_phi_axis,
            String beam_az_axis,
            String beam_pol_axis,
            String beam_x_axis,
            String beam_y_axis,
            String beam_aut_z,
            String beam_aut_switch,
            String beam_RF_switch_driver

    ) throws SQLException, ClassNotFoundException {
        //Declare an INSERT statement
        String updateStmt =
                "INSERT INTO beamtable " +
                        "(beam_number, beam_dwell, beam_frequency, " +
                        "beam_beam_phi_axis, beam_az_axis, beam_pol_axis, " +
                        "beam_x_axis, beam_y_axis, beam_aut_z, beam_aut_switch, " +
                        "beam_RF_switch_driver) " +
                        "VALUES " +
                        "('" +beam_number+ "','" +beam_dwell+ "','" +beam_frequency+
                        "','" +beam_phi_axis+ "','" +beam_az_axis+ "','" +beam_pol_axis+
                        "','" +beam_x_axis+ "','" +beam_y_axis+ "','" +beam_aut_z+ "','" +beam_aut_switch+
                        "','" +beam_RF_switch_driver+ "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing an INSERT Operation: " + e);
            throw e;
        }
    }
}
