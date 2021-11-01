module com.nsimate.nsimate {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.prefs;


    opens com.nsimate.nsimate to javafx.fxml;
    exports com.nsimate.nsimate;
}