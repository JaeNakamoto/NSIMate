package controller;

import com.nsimate.nsimate.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;
import model.Antenna;

import java.io.IOException;

public class MainViewController {

    @FXML
    private TableColumn<Antenna, Integer> scanIDColumn;
    @FXML
    private TableColumn<Antenna,Integer> batchIDColumn;
    @FXML
    private TableColumn<Antenna, Integer> antennaIDColumn;
    @FXML
    private TableColumn<Antenna, String> antennaSerialnrColumn;
    @FXML
    private TableColumn<Antenna, String> antennaModificationColumn;
    @FXML
    private TableColumn<Antenna, String> feedSerialnrColumn;
    @FXML
    private TableColumn<Antenna, String> scanStartdateColumn;
    @FXML
    private TableColumn<Antenna, String> scanStopdateColumn;
    @FXML
    private TableColumn<Antenna, String> scanStarttimeColumn;
    @FXML
    private TableColumn<Antenna, String> scanStoptimeColumn;
    @FXML
    private TableColumn<Antenna, String> minTempColumn;
    @FXML
    private TableColumn<Antenna, String> maxTempColumn;
    @FXML
    private TableColumn<Antenna, String> operatorIDColumn;
    @FXML
    private TableColumn<Antenna, String> documentPathColumn;

    @FXML
    private void initialize() {

    }

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1600, 900);
        stage.setTitle("NSI Mate V1.0");
        stage.setScene(scene);
        stage.show();
    }

}