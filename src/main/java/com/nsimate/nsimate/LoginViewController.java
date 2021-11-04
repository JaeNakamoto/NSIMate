package com.nsimate.nsimate;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController {
    public TextField userNameField;
    public TextField passwordField;
    public Button loginButton;
    public Button cancelButton;
    public Text invalidLoginText;

    String username, password;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 200);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Account");
        stage.setScene(scene);
        stage.show();
    }

    // Handles login action
    public void onLoginButton() {
        username = userNameField.getText();
        password = passwordField.getText();

        if(DBUtil.dbConnect(username, password) != null) {
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
