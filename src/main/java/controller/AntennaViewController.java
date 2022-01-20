package controller;

import com.nsimate.nsimate.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Antenna;

import java.io.IOException;

import static java.lang.Integer.parseInt;

public class AntennaViewController {
    public TextField addNameField;
    public TextField addPartnrField;
    public TextField addSerialnrField;
    public TextField addModificationField;
    public TextField addPowersupplyField;
    public ComboBox addRXTX;
    public TextField addCoordinatesystemField;
    public TextField addNrOfRFField;

    public static TableColumn<Antenna, Integer> antennaIDColumn;
    public static TableColumn<Antenna, String> nameColumn;
    public static TableColumn<Antenna, String> partnrColumn;
    public static TableColumn<Antenna, String> serialnrColumn;
    public static TableColumn<Antenna, String> modificationColumn;
    public static TableColumn<Antenna, String> powersupplyColumn;
    public static TableColumn<Antenna, String> RXTXColumn;
    public static TableColumn<Antenna, String> coordinatesystemColumn;
    public static TableColumn<Antenna, String> nrOfRFColumn;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AntennaView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Antennas");
        stage.setScene(scene);
        stage.show();
    }

}
