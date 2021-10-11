package com.nsimate.nsimate;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class LoginViewController {
    public TextField userNameField;
    public TextField passwordField;
    String username, password;

    @FXML
    public void onLoginButton() {
        username = userNameField.getText();
        password = passwordField.getText();

        if(DatabaseConnect.databaseConnect(username, password)) {

            try {
                MainViewController.start(new Stage());
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onCancelButton() {

    }
}
