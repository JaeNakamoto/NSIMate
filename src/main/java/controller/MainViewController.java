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
    //Import interfaces
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
    //Save current Scan
    public void onClickSaveScan(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        insertAntenna(new ActionEvent());
    }

    public void onClickAbout(ActionEvent actionEvent) {
        Alert alert = new Alert (Alert.AlertType.INFORMATION);
        alert.setTitle("Program Information");
        alert.setHeaderText("NSI Mate is a program to be used in conjunction with NSI 2000 software");
        alert.setContentText("For more information and documentation, please visit the NSI Mate github page: https://github.com/JasonPrikken/NSIMate");
        alert.show();
    }

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
            //Get Antenna information
            Antenna antenna = AntennaDAO.searchAntenna(Integer.getInteger(antennaIDField.getText()));
            //Populate Antenna in ListView
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
            //Get all Antenna information
            ObservableList<Antenna> antennaData = AntennaDAO.searchAntennas();
            //Populate Antennas in Fields
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
}