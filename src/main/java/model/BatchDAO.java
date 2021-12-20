package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BatchDAO {

    //*******************************
    //Search a Batch
    //*******************************
    public static Batch searchBatch(int keyword) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM batch WHERE" +
                "batch_id LIKE %" +keyword+ "% " +
                "OR batch_startdate LIKE %" +keyword+ "% " +
                "OR batch_starttime LIKE %" +keyword+ "% " +
                "OR batch_stopdate LIKE %" +keyword+ "% " +
                "OR batch_stoptime LIKE %" +keyword+ "%;";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsBatch = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get batch object
            Batch batch = getBatchFromResultSet(rsBatch);

            //Return batch object
            return batch;

        } catch (SQLException e) {
            System.out.println("While searching an Batch with " +keyword+ ", an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    private static Batch getBatchFromResultSet(ResultSet rs) throws SQLException {
        Batch batch = null;
        if (rs.next()) {
            batch = new Batch();
            batch.setBatch_id(rs.getInt("batch_id"));
            batch.setBatch_startdate(rs.getString("batch_startdate"));
            batch.setBatch_starttime(rs.getString("batch_starttime"));
            batch.setBatch_stopdate(rs.getString("batch_stopdate"));
            batch.setBatch_stoptime(rs.getString("batch_stoptime"));
        }
        return batch;
    }

    //*******************************
    //SELECT Batches
    //*******************************
    public static ObservableList<Batch> searchBatches () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM batch";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsBatches = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getBatchList method and get batch object
            ObservableList<Batch> batchList = getBatchList(rsBatches);

            //Return batch object
            return batchList;
        } catch (SQLException e) {
            System.out.println("SQL SELECT operation has failed: " + e);
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
            batch.setBatch_startdate(rs.getString("batch_startdate"));
            batch.setBatch_starttime(rs.getString("batch_starttime"));
            batch.setBatch_stopdate(rs.getString("batch_stopdate"));
            batch.setBatch_stoptime(rs.getString("batch_stoptime"));
            //Add batch to the ObservableList
            batchList.add(batch);
        }
        //return batchList (ObservableList of Batches)
        return batchList;
    }

    //*************************************
    //DELETE a Batch
    //*************************************
    public static void deleteBatchWithId (String batch_id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM batch WHERE (batch_id = '" +batch_id+ "')";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing DELETE Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT a batch
    //*************************************
    public static void insertBatch (
            int batch_id,
            String batch_startdate,
            String batch_starttime,
            String batch_stopdate,
            String batch_stoptime
    ) throws SQLException, ClassNotFoundException {
        //Declare an INSERT statement
        String updateStmt =
                "INSERT INTO batch " +
                        "(batch_startdate, batch_starttime," +
                        "batch_stopdate, batch_stoptime) " +
                        "VALUES " +
                        "('" +batch_startdate+ "','" +batch_starttime+ "','"
                        +batch_stopdate+ "','" +batch_stoptime+ "')";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing an INSERT Operation: " + e);
            throw e;
        }
    }
}
