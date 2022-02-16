package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BatchDAO {

    //*******************************
    //SELECT a Batch
    //*******************************
    public static Batch searchBatch(int batch_id) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM batch WHERE batch_id= " + batch_id;

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsBatch = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getAntennaFromResultSet method and get batch object
            Batch batch = getBatchFromResultSet(rsBatch);

            //Return antenna object
            return batch;
        } catch (SQLException e) {
            System.out.println("While searching an Batch with " +batch_id+ " id, an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set Batch Object's attributes and return batch object.
    private static Batch getBatchFromResultSet(ResultSet rs) throws SQLException {
        Batch batch = null;
        if (rs.next()) {
            batch = new Batch();
            batch.setBatch_id(rs.getInt("batch_id"));
            batch.setScan_setup_id(rs.getInt("scan_setup_id"));
            batch.setProbe_id(rs.getInt("probe_id"));
            batch.setBatch_startdate(rs.getString("batch_startdate"));
            batch.setBatch_stopdate(rs.getString("batch_stopdate"));
            batch.setBatch_starttime(rs.getString("batch_starttime"));
            batch.setBatch_stoptime(rs.getString("batch_stoptime"));
            batch.setReference_origin_theta(rs.getFloat("reference_origin_theta"));
            batch.setReference_origin_phi(rs.getFloat("reference_origin_phi"));
            batch.setReference_location(rs.getString("reference_location"));
            batch.setAut_location_x(rs.getFloat("aut_location_x"));
            batch.setAut_location_y(rs.getFloat("aut_location_y"));
            batch.setAut_location_z(rs.getFloat("aut_location_z"));
            batch.setCoordinate_system(rs.getString("coordinate_system"));
            batch.setGroundplate(rs.getString("groundplate"));
            batch.setAbsorber(rs.getString("absorber"));
            batch.setSeparation_rods(rs.getString("separation_rods"));
            batch.setMre(rs.getFloat("mre"));
            batch.setMechanical_adapter(rs.getString("mechanical_adapter"));
            batch.setGrounding_option(rs.getString("grounding_option"));
            batch.setControl_cable(rs.getString("control_cable"));
            batch.setNf_ff(rs.getString("nf_ff"));
            batch.setBreakoutbox(rs.getString("breakoutbox"));
            batch.setSpecial(rs.getString("special"));
        }
        return batch;
    }

    //*******************************
    //SELECT Batches
    //*******************************
    public static ObservableList<Batch> searchBatches() throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM batch";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsBatches = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getBatchList method and get batch object
            ObservableList<Batch> batchesList = getBatchList(rsBatches);

            //Return batch object
            return batchesList;
        } catch (SQLException e) {
            System.out.println("SQL SELECT Batches operation has failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from batch operation
    private static ObservableList<Batch> getBatchList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare an observable List which consists of Batch objects
        ObservableList<Batch> batchList = FXCollections.observableArrayList();

        while (rs.next()) {
            Batch batch = new Batch();
            batch.setBatch_id(rs.getInt("batch_id"));
            batch.setScan_setup_id(rs.getInt("scan_setup_id"));
            batch.setProbe_id(rs.getInt("probe_id"));
            batch.setBatch_startdate(rs.getString("batch_startdate"));
            batch.setBatch_stopdate(rs.getString("batch_stopdate"));
            batch.setBatch_starttime(rs.getString("batch_starttime"));
            batch.setBatch_stoptime(rs.getString("batch_stoptime"));
            batch.setReference_origin_theta(rs.getFloat("reference_origin_theta"));
            batch.setReference_origin_phi(rs.getFloat("reference_origin_phi"));
            batch.setReference_location(rs.getString("reference_location"));
            batch.setAut_location_x(rs.getFloat("aut_location_x"));
            batch.setAut_location_y(rs.getFloat("aut_location_y"));
            batch.setAut_location_z(rs.getFloat("aut_location_z"));
            batch.setCoordinate_system(rs.getString("coordinate_system"));
            batch.setGroundplate(rs.getString("groundplate"));
            batch.setAbsorber(rs.getString("absorber"));
            batch.setSeparation_rods(rs.getString("separation_rods"));
            batch.setMre(rs.getFloat("mre"));
            batch.setMechanical_adapter(rs.getString("mechanical_adapter"));
            batch.setGrounding_option(rs.getString("grounding_option"));
            batch.setControl_cable(rs.getString("control_cable"));
            batch.setNf_ff(rs.getString("nf_ff"));
            batch.setBreakoutbox(rs.getString("breakoutbox"));
            batch.setSpecial(rs.getString("special"));
            //Add antenna to the ObservableList
            batchList.add(batch);
        }
        //return batchList (ObservableList of Batches)
        return batchList;
    }

    //*************************************
    //DELETE a batch
    //*************************************
    public static void deleteBatchWithId(String batch_id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM batch WHERE (batch_id = '" +batch_id+ "')";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing DELETE Batch Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT a batch
    //*************************************
    public static void insertBatch(

            int scan_setup_id,
            int probe_id,
            String batch_startdate,
            String batch_stopdate,
            String batch_starttime,
            String batch_stoptime,
            Float reference_origin_theta,
            Float reference_origin_phi,
            String reference_location,
            Float aut_location_x,
            Float aut_location_y,
            Float aut_location_z,
            String coordinate_system,
            String groundplate,
            String absorber,
            String separation_rods,
            Float mre,
            String mechanical_adapter,
            String grounding_option,
            String control_cable,
            String nf_ff,
            String breakoutbox,
            String special

    ) throws SQLException, ClassNotFoundException {
        //Declare an INSERT statement
        String updateStmt =
                "INSERT INTO batch " +
                        "(scan_setup_id, probe_id, batch_startdate, batch_stopdate " +
                        "batch_starttime, batch_stoptime, reference_origin_theta, " +
                        "reference_origin_phi, reference_location, aut_location_x, " +
                        "aut_location_y, aut_location_z, coordinate_system, groundplate, " +
                        "absorber, separation_rods, mre, mechanical_adapter, grounding_option, " +
                        "control_cable, nf_ff, breakoutbox, special) " +
                        "VALUES " +
                        "('" +scan_setup_id+ "','" +probe_id+ "','" +batch_startdate+ "','" +batch_stopdate+ "','"
                        +batch_starttime+ "','" +batch_stoptime+ "','" +reference_origin_theta+ "','"
                        +reference_origin_phi+ "','" +reference_location+ "','" +aut_location_x+ "','"
                        +aut_location_y+ "','" +aut_location_z+ "','" +coordinate_system+ "','" +groundplate+ "','"
                        +absorber+ "','" +separation_rods+ "','" +mre+ "','" +mechanical_adapter+ "','" +grounding_option+ "','"
                        +control_cable+ "','" +nf_ff+ "','" +breakoutbox+ "','" +special+ "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing an INSERT Batch Operation: " + e);
            throw e;
        }
    }

}