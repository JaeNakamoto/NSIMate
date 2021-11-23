package controller;

import com.nsimate.nsimate.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.prefs.Preferences;

import com.nsimate.nsimate.LoginSession;

import static com.nsimate.nsimate.LoginSession.getUsername;

public class AccountViewController {
    public Button okButton;
    public Button applyButton;
    public Button cancelButton;
    public static TextField usernameField;
    String username = getUsername();

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AccountView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 700);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Account");
        stage.setScene(scene);
        stage.show();
    }

    public void onOkButtonClick() {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }

    public void onApplyButtonClick() {
        Stage stage = (Stage) applyButton.getScene().getWindow();
        stage.close();
    }

    public void onCancelButtonClick() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
