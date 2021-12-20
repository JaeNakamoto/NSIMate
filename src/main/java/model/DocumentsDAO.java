package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DocumentsDAO {
    //*******************************
    //Search a Document
    //*******************************
    public static Documents searchDocument(String keyword) throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM documents WHERE " +
                "documents_id LIKE %" +keyword+ "% " +
                "OR document_url LIKE %" +keyword+ "%;";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsDocuments = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getEmployeeFromResultSet method and get documents object
            Documents documents = getDocumentsFromResultSet(rsDocuments);

            //Return documents object
            return documents;
        } catch (SQLException e) {
            System.out.println("While searching Documents with " +keyword+ ", an error occurred: " + e);
            //Return exception
            throw e;
        }
    }

    //Use ResultSet from DB as parameter and set Documents Object's attributes and return documents object.
    private static Documents getDocumentsFromResultSet(ResultSet rs) throws SQLException {
        Documents documents = null;
        if (rs.next()) {
            documents = new Documents();

        }
        return documents;
    }

    //*******************************
    //SELECT Documents
    //*******************************
    public static ObservableList<Documents> searchDocuments () throws SQLException, ClassNotFoundException {
        //Declare a SELECT statement
        String selectStmt = "SELECT * FROM documents";

        //Execute SELECT statement
        try {
            //Get ResultSet from dbExecuteQuery method
            ResultSet rsDocuments = DBUtil.dbExecuteQuery(selectStmt);

            //Send ResultSet to the getDocumentsList method and get documents object
            ObservableList<Documents> documentsList = getDocumentsList(rsDocuments);

            //Return documents object
            return documentsList;
        } catch (SQLException e) {
            System.out.println("SQL SELECT operation has failed: " + e);
            //Return exception
            throw e;
        }
    }

    //Select * from documents operation
    private static ObservableList<Documents> getDocumentsList(ResultSet rs) throws SQLException, ClassNotFoundException {
        //Declare a observable List which consists of Documents objects
        ObservableList<Documents> documentsList = FXCollections.observableArrayList();

        while (rs.next()) {
            Documents documents = new Documents();
            documents.setDocuments_id(rs.getInt("documents_id"));
            documents.setDocument_url(rs.getString("document_url"));

            //Add documents to the ObservableList
            documentsList.add(documents);
        }
        //return empList (ObservableList of Documents)
        return documentsList;
    }

    //*************************************
    //DELETE a Document
    //*************************************
    public static void deleteDocumentWithId (String documents_id) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement
        String updateStmt = "DELETE FROM documents WHERE (documents_id = '" +documents_id+ "')";

        //Execute UPDATE operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing DELETE Operation: " + e);
            throw e;
        }
    }

    //*************************************
    //INSERT a Document
    //*************************************
    public static void insertDocument (

            int documents_id,
            String document_url

    ) throws SQLException, ClassNotFoundException {
        //Declare an INSERT statement
        String updateStmt =
                "INSERT INTO documents " +
                        "(document_url) " +
                        "VALUES " +
                        "('" +document_url+ "');";

        //Execute INSERT operation
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while performing an INSERT Operation: " + e);
            throw e;
        }
    }
}
