package com.nsimate.nsimate;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AccountViewController {

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 200);
        stage.setResizable(false);
        stage.setTitle("Account");
        stage.setScene(scene);
        stage.show();
    }
}
