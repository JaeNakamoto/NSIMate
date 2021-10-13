package com.nsimate.nsimate;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginViewController {
    public TextField userNameField;
    public TextField passwordField;
    public Button loginButton;
    public Button cancelButton;
    public Text invalidLoginText;

    String username, password;

    // Handles login action
    public void onLoginButton() {
        username = userNameField.getText();
        password = passwordField.getText();

        if(DatabaseConnector.databaseLogin(username, password) != null) {
            try {
                Stage stage = (Stage) loginButton.getScene().getWindow();
                stage.close();
                MainViewController.start(new Stage());
            } catch(Exception e) {
                e.printStackTrace();
            }
        } else {
            invalidLoginText.setText("Incorrect username or password");
        }
    }

    // Closes login window
    public void onCancelButton() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
