module com.nsimate.nsimate {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.prefs;
    requires java.sql.rowset;


    opens com.nsimate.nsimate to javafx.fxml;
    exports com.nsimate.nsimate;
    exports controller;
    opens controller to javafx.fxml;
    exports util;
    opens util to javafx.fxml;
}