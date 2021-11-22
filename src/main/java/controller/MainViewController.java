package controller;

import com.nsimate.nsimate.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import util.DBUtil;

import java.io.IOException;
import java.sql.ResultSet;

public class MainViewController {
    public MenuBar mainMenuBar;
    public TextField searchField;
    public ListView searchListView;

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1600, 900);
        stage.setTitle("NSI Mate V1.0");
        stage.setScene(scene);
        stage.show();
    }

}