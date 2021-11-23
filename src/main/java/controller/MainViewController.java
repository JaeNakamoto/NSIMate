package controller;

import com.nsimate.nsimate.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import util.DBUtil;

import java.io.IOException;
import java.sql.ResultSet;

public class MainViewController {

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1600, 900);
        stage.setTitle("NSI Mate V1.0");
        stage.setScene(scene);
        stage.show();
    }


    //*************************************
    //Menubar
    //*************************************
    public void onClickAbout(ActionEvent actionEvent) {
        Alert alert = new Alert (Alert.AlertType.INFORMATION);
        alert.setTitle("Program Information");
        alert.setHeaderText("NSI Mate is a program to be used in conjunction with NSI 2000 software");
        alert.setContentText("For more information and documentation, please visit the NSI Mate github page: https://github.com/JasonPrikken/NSIMate");
        alert.show();
    }

    public void onClickAccountSettings(ActionEvent actionEvent) {
        try {
            AccountViewController.start(new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}