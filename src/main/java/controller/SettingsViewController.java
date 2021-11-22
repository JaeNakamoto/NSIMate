package controller;

import com.nsimate.nsimate.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.prefs.*;

import java.io.IOException;

public class SettingsViewController {

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SettingsView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 700);
        stage.setTitle("Settings");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.show();
    }


}
