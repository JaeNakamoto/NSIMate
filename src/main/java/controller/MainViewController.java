package controller;

import com.nsimate.nsimate.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import model.Variable;
import model.VariableDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainViewController {

    @FXML
    private TableView variableTable;
    @FXML
    private TableColumn<Variable, Integer> scanIDColumn;
    @FXML
    private TableColumn<Variable, Integer> batchIDColumn;
    @FXML
    private TableColumn<Variable, Integer> antennaIDColumn;
    @FXML
    private TableColumn<Variable, String> antennaSerialnrColumn;
    @FXML
    private TableColumn<Variable, String> antennaModificationColumn;
    @FXML
    private TableColumn<Variable, String> feedSerialnrColumn;
    @FXML
    private TableColumn<Variable, String> scanStartdateColumn;
    @FXML
    private TableColumn<Variable, String> scanStopdateColumn;
    @FXML
    private TableColumn<Variable, String> scanStarttimeColumn;
    @FXML
    private TableColumn<Variable, String> scanStoptimeColumn;
    @FXML
    private TableColumn<Variable, Float> minTempColumn;
    @FXML
    private TableColumn<Variable, Float> maxTempColumn;
    @FXML
    private TableColumn<Variable, Integer> operatorIDColumn;
    @FXML
    private TableColumn<Variable, String> documentPathColumn;

    //For MultiThreading
    private Executor exec;

    //Initializing the controller class.
    //This method is automatically called after the fxml file has been loaded.
    @FXML
    private void initialize() {
        //For multithreading: Create executor that uses daemon threads:
        exec = Executors.newCachedThreadPool((runnable) -> {
            Thread t = new Thread (runnable);
            t.setDaemon(true);
            return t;
        });

        scanIDColumn.setCellValueFactory(cellData -> cellData.getValue().variable_idProperty().asObject());
        batchIDColumn.setCellValueFactory(cellData -> cellData.getValue().batch_idProperty().asObject());
        antennaIDColumn.setCellValueFactory(cellData -> cellData.getValue().antenna_idProperty().asObject());
        antennaSerialnrColumn.setCellValueFactory(cellData -> cellData.getValue().antenna_serialnrProperty());
        antennaModificationColumn.setCellValueFactory(cellData -> cellData.getValue().antenna_modificationProperty());
        feedSerialnrColumn.setCellValueFactory(cellData -> cellData.getValue().feed_serialnrProperty());
        scanStartdateColumn.setCellValueFactory(cellData -> cellData.getValue().scan_startdateProperty());
        scanStopdateColumn.setCellValueFactory(cellData -> cellData.getValue().scan_stopdateProperty());
        scanStarttimeColumn.setCellValueFactory(cellData -> cellData.getValue().scan_starttimeProperty());
        scanStoptimeColumn.setCellValueFactory(cellData -> cellData.getValue().scan_stoptimeProperty());
        minTempColumn.setCellValueFactory(cellData -> cellData.getValue().temperature_minProperty().asObject());
        maxTempColumn.setCellValueFactory(cellData -> cellData.getValue().temperature_maxProperty().asObject());
        operatorIDColumn.setCellValueFactory(cellData -> cellData.getValue().operator_idProperty().asObject());
        documentPathColumn.setCellValueFactory(cellData -> cellData.getValue().excel_document_pathProperty());
    }

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1600, 900);
        stage.setTitle("NSI Mate V1.0");
        stage.setScene(scene);
        stage.show();
    }


    //*******************************
    //Overview Tab
    //*******************************
    @FXML
    private void onSelectBatch(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            BatchViewController.start(new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Refresh Scan TableView
    @FXML
    private void onRefreshVariableTable(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            //Get all Variable information
            ObservableList<Variable> variableData = VariableDAO.searchVariables();
            //Populate Variable on TableView
            populateVariable(variableData);
        } catch (SQLException | ClassNotFoundException e){
            System.out.println("Error occurred while getting variables information from DB.\n" + e);
            throw e;
        }
    }

    //Populate Variable Table
    @FXML
    private void populateVariable (ObservableList<Variable> variable) throws ClassNotFoundException {
        variableTable.setItems(variable);
    }
}