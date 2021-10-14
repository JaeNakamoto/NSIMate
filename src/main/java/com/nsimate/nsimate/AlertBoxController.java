package com.nsimate.nsimate;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AlertBoxController {
    public Button okButton;
    public Button cancelButton;

    public void start(Stage stage, String title, String message) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AlertBox.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 200);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();

        if(okButton.isPressed()) {
            Stage box = (Stage) okButton.getScene().getWindow();
            box.close();
        }

        if(cancelButton.isPressed()) {
            Stage box = (Stage) cancelButton.getScene().getWindow();
            box.close();
        }
    }

}
