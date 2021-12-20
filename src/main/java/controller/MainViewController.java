package controller;
import model.*;

import com.nsimate.nsimate.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.AntennaDAO;
import util.DBUtil;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.lang.Integer.parseInt;

public class MainViewController {
    //Antenna input
    @FXML
    private TextField antennaIDField;
    @FXML
    private TextField antennaNameField;
    @FXML
    private TextField antennaPartnrField;
    @FXML
    private TextField antennaSerialnrField;
    @FXML
    private TextField antennaModField;
    @FXML
    private TextField antennaPSUField;
    @FXML
    private TextField antennaRXTXSwField;
    @FXML
    private TextField antennaCoordSysField;
    @FXML
    private TextField antennaNrOfRFConn;

    //Batch input
    @FXML
    private TextField batchIDField;
    @FXML
    private TextField batchStarttimeField;
    @FXML
    private TextField batchStartdateField;
    @FXML
    private TextField batchStoptimeField;
    @FXML
    private TextField batchStopdateField;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1600, 900);
        stage.setTitle("NSI Mate V1.0");
        stage.setScene(scene);
        stage.show();
    }

    //*************************************
    //Menubar
    //*************************************
    //Save current Scan to DB
    public void onClickSaveScan(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        insertAntenna(new ActionEvent());
        insertBatch(new ActionEvent());
    }

    //Open information popup
    public void onClickAbout(ActionEvent actionEvent) {
        Alert alert = new Alert (Alert.AlertType.INFORMATION);
        alert.setTitle("Program Information");
        alert.setHeaderText("NSI Mate is a program to be used in conjunction with NSI 2000 software");
        alert.setContentText("For more information and documentation, please visit the NSI Mate github page: https://github.com/JasonPrikken/NSIMate");
        alert.show();
    }

    //Open AccountView
    public void onClickAccountSettings(ActionEvent actionEvent) {
        try {
            AccountViewController.start(new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //*************************************
    //Antenna
    //*************************************
    //Search an antenna
    @FXML
    private void searchAntenna (ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
        try {
            //Get antenna information
            Antenna antenna = AntennaDAO.searchAntenna(Integer.getInteger(antennaIDField.getText()));
            //Populate antenna in ListView
            //
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    //Search all antennas
    @FXML
    private void searchEmployees(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            //Get all antenna information
            ObservableList<Antenna> antennaData = AntennaDAO.searchAntennas();
            //Populate antennas in Fields
            //
        } catch (SQLException e){
            System.out.println("Error occurred while getting antennas information from DB.\n" + e);
            throw e;
        }
    }

    //Insert antenna to the DB
    @FXML
    private void insertAntenna (ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            AntennaDAO.insertAntenna(
                    parseInt(antennaIDField.getText()),
                    1,
                    antennaNameField.getText(),
                    antennaPartnrField.getText(),
                    antennaSerialnrField.getText(),
                    antennaModField.getText(),
                    antennaPSUField.getText(),
                    antennaRXTXSwField.getText(),
                    antennaCoordSysField.getText(),
                    antennaNrOfRFConn.getText()
                    );
        } catch (SQLException e) {
            throw e;
        }
    }

    //*************************************
    //Batch
    //*************************************
    //Search a batch
    @FXML
    private void searchBatch (ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
        try {
            //Get batch information
            Batch batch = BatchDAO.searchBatch(Integer.getInteger(batchIDField.getText()));
            //Populate batch in ListView
            //
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    //Search all batches
    @FXML
    private void searchBatches(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            //Get all batch information
            ObservableList<Batch> batchData = BatchDAO.searchBatches();
            //Populate batches in Fields
            //
        } catch (SQLException e){
            System.out.println("Error occurred while getting batches information from DB.\n" + e);
            throw e;
        }
    }

    //Insert batch to the DB
    @FXML
    private void insertBatch (ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            BatchDAO.insertBatch(
                    parseInt(batchIDField.getText()),
                    batchStarttimeField.getText(),
                    batchStartdateField.getText(),
                    batchStoptimeField.getText(),
                    batchStopdateField.getText()
            );
        } catch (SQLException e) {
            throw e;
        }
    }
}