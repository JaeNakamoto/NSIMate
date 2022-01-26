package controller;

import com.nsimate.nsimate.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Variable;
import model.VariableDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BatchViewController {
    @FXML
    private TableView batchTable;
    @FXML
    private TableColumn batchIDColumn;
    @FXML
    private TableColumn probeIDColumn;
    @FXML
    private TableColumn batchStartdateColumn;
    @FXML
    private TableColumn batchStopdateColumn;
    @FXML
    private TableColumn batchStoptimeColumn;
    @FXML
    private TableColumn referenceOriginThetaColumn;
    @FXML
    private TableColumn referenceOriginPhiColumn;
    @FXML
    private TableColumn referenceLocationColumn;
    @FXML
    private TableColumn autLocationXColumn;
    @FXML
    private TableColumn autLocationYColumn;
    @FXML
    private TableColumn autLocationZColumn;
    @FXML
    private TableColumn coordinateSystemColumn;
    @FXML
    private TableColumn groundplateColumn;
    @FXML
    private TableColumn absorberColumn;
    @FXML
    private TableColumn separationRodsColumn;
    @FXML
    private TableColumn mreColumn;
    @FXML
    private TableColumn mechanicalAdapterColumn;
    @FXML
    private TableColumn groundingOptionColumn;
    @FXML
    private TableColumn controlCableColumn;
    @FXML
    private TableColumn nfffColumn;
    @FXML
    private TableColumn breakoutboxColumn;
    @FXML
    private TableColumn specialColumn;

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

        //batchIDColumn.setCellValueFactory(cellData -> cellData.batch_idProperty.variable_idProperty().asObject());

    }

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("BatchView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Batches");
        stage.setScene(scene);
        stage.show();
    }


    //*******************************
    //Overview Tab
    //*******************************
    @FXML private void onSelectBatch(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
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
            System.out.println("Error occurred while getting employees information from DB.\n" + e);
            throw e;
        }
    }

    //Populate Variable Table
    @FXML
    private void populateVariable (ObservableList<Variable> variable) throws ClassNotFoundException {
        //variableTable.setItems(variable);
    }

}
