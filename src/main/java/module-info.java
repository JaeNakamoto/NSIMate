module com.nsimate.nsimate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nsimate.nsimate to javafx.fxml;
    exports com.nsimate.nsimate;
}