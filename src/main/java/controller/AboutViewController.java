package controller;

import com.nsimate.nsimate.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AboutViewController {
    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AboutView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 700);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("NSI Mate V1.0");
        stage.setScene(scene);
        stage.show();
    }
}
