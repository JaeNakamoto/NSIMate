package controller;

import com.nsimate.nsimate.Main;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Batch;
import model.BatchDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BatchViewController {
    @FXML
    private TextField searchBatchField;

    @FXML
    private TableView batchTable;
    @FXML
    private TableColumn<Batch, Integer> batchIDColumn;
    @FXML
    private TableColumn<Batch, Integer> scanSetupIDColumn;
    @FXML
    private TableColumn<Batch, Integer> probeIDColumn;
    @FXML
    private TableColumn<Batch, String> batchStartdateColumn;
    @FXML
    private TableColumn<Batch, String> batchStopdateColumn;
    @FXML
    private TableColumn<Batch, String> batchStarttimeColumn;
    @FXML
    private TableColumn<Batch, String> batchStoptimeColumn;
    @FXML
    private TableColumn<Batch, Float> referenceOriginThetaColumn;
    @FXML
    private TableColumn<Batch, Float> referenceOriginPhiColumn;
    @FXML
    private TableColumn<Batch, String> referenceLocationColumn;
    @FXML
    private TableColumn<Batch, Float> autLocationXColumn;
    @FXML
    private TableColumn<Batch, Float> autLocationYColumn;
    @FXML
    private TableColumn<Batch, Float> autLocationZColumn;
    @FXML
    private TableColumn<Batch, String> coordinateSystemColumn;
    @FXML
    private TableColumn<Batch, String> groundplateColumn;
    @FXML
    private TableColumn<Batch, String> absorberColumn;
    @FXML
    private TableColumn<Batch, String> separationRodsColumn;
    @FXML
    private TableColumn<Batch, Float> mreColumn;
    @FXML
    private TableColumn<Batch, String> mechanicalAdapterColumn;
    @FXML
    private TableColumn<Batch, String> groundingOptionColumn;
    @FXML
    private TableColumn<Batch, String> controlCableColumn;
    @FXML
    private TableColumn<Batch, String> nfffColumn;
    @FXML
    private TableColumn<Batch, String> breakoutboxColumn;
    @FXML
    private TableColumn<Batch, String> specialColumn;

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
        batchIDColumn.setCellValueFactory(cellData -> cellData.getValue().batch_idProperty().asObject());
        scanSetupIDColumn.setCellValueFactory(cellData -> cellData.getValue().scan_setup_idProperty().asObject());
        probeIDColumn.setCellValueFactory(cellData -> cellData.getValue().probe_idProperty().asObject());
        batchStartdateColumn.setCellValueFactory(cellData -> cellData.getValue().batch_stardateProperty());
        batchStopdateColumn.setCellValueFactory(cellData -> cellData.getValue().batch_stopdateProperty());
        batchStarttimeColumn.setCellValueFactory(cellData -> cellData.getValue().batch_starttimeProperty());
        batchStoptimeColumn.setCellValueFactory(cellData -> cellData.getValue().batch_stoptimeProperty());
        referenceOriginThetaColumn.setCellValueFactory(cellData -> cellData.getValue().reference_origin_thetaProperty().asObject());
        referenceOriginPhiColumn.setCellValueFactory(cellData -> cellData.getValue().reference_origin_phiProperty().asObject());
        referenceLocationColumn.setCellValueFactory(cellData -> cellData.getValue().reference_locationProperty());
        autLocationXColumn.setCellValueFactory(cellData -> cellData.getValue().aut_location_xProperty().asObject());
        autLocationYColumn.setCellValueFactory(cellData -> cellData.getValue().aut_location_yProperty().asObject());
        autLocationZColumn.setCellValueFactory(cellData -> cellData.getValue().aut_location_zProperty().asObject());
        coordinateSystemColumn.setCellValueFactory(cellData -> cellData.getValue().coordinate_systemProperty());
        groundplateColumn.setCellValueFactory(cellData -> cellData.getValue().groundplateProperty());
        absorberColumn.setCellValueFactory(cellData -> cellData.getValue().absorberProperty());
        separationRodsColumn.setCellValueFactory(cellData -> cellData.getValue().separation_rodsProperty());
        mreColumn.setCellValueFactory(cellData -> cellData.getValue().mreProperty().asObject());
        mechanicalAdapterColumn.setCellValueFactory(cellData -> cellData.getValue().mechanical_adapterProperty());
        groundingOptionColumn.setCellValueFactory(cellData -> cellData.getValue().grounding_optionProperty());
        controlCableColumn.setCellValueFactory(cellData -> cellData.getValue().control_cableProperty());
        nfffColumn.setCellValueFactory(cellData -> cellData.getValue().nf_ffProperty());
        breakoutboxColumn.setCellValueFactory(cellData -> cellData.getValue().breakoutboxProperty());
        specialColumn.setCellValueFactory(cellData -> cellData.getValue().specialProperty());

        try {
            onRefreshBatchTable(new ActionEvent());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

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

    @FXML
    private void onSelectBatch(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {

    }

    //Refresh Batch TableView
    @FXML
    private void onRefreshBatchTable(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
            //Get all Batch information
            ObservableList<Batch> batchData = BatchDAO.searchBatches();
            //Populate Batch on TableView
            populateBatch(batchData);
        } catch (SQLException | ClassNotFoundException e){
            System.out.println("Error occurred while getting batches information from DB.\n" + e);
            throw e;
        }
    }

    //Populate Variable Table
    @FXML
    private void populateBatch (ObservableList<Batch> batch) throws ClassNotFoundException {
        batchTable.setItems(batch);
    }

}
