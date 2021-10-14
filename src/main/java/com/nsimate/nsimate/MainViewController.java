package com.nsimate.nsimate;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    public MenuBar mainMenuBar;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1600, 900);
        stage.setTitle("NSI Mate V1.0");
        stage.setScene(scene);
        stage.show();
    }


    //// Menu Bar ////
    public void onSelectSettings() {

    }

    public void onSelectDelete() {

    }

    public void onSelectManageAccount() {
        try {
            AccountViewController.start(new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onSelectLogout() {
        try {
            Stage stage = (Stage) mainMenuBar.getScene().getWindow();
            stage.close();
            LoginViewController.start(new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onSelectAbout() {

    }

}