package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Antenna {
    //Declare Antenna Table Columns
    private IntegerProperty antenna_id;
    private IntegerProperty vendorspecifications_id;
    private StringProperty antenna_name;
    private StringProperty antenna_partnumber;
    private StringProperty antenna_serialnumber;
    private StringProperty antenna_modification;
    private StringProperty antenna_powersupply;
    private StringProperty antenna_rx_tx_switch;
    private StringProperty antenna_coordinatesystem;
    private StringProperty antenna_number_of_RFconnections;

    //Constructor
    public Antenna() {
        this.antenna_id = new SimpleIntegerProperty();
        this.vendorspecifications_id = new SimpleIntegerProperty();
        this.antenna_name = new SimpleStringProperty();
        this.antenna_partnumber = new SimpleStringProperty();
        this.antenna_serialnumber = new SimpleStringProperty();
        this.antenna_modification = new SimpleStringProperty();
        this.antenna_powersupply = new SimpleStringProperty();
        this.antenna_rx_tx_switch = new SimpleStringProperty();
        this.antenna_coordinatesystem = new SimpleStringProperty();
        this.antenna_number_of_RFconnections = new SimpleStringProperty();
    }

    //antenna_id
    public IntegerProperty getAntenna_id() {
        return antenna_id;
    }

    public void setAntenna_id(int antenna_id) {
        this.antenna_id.set(antenna_id);
    }

    public IntegerProperty antenna_idProperty() {
        return antenna_id;
    }

    //vendorspecifications_id
    public IntegerProperty getvendorspecifications_id() {
        return vendorspecifications_id;
    }

    public void setVendorspecifications_id(int vendorspecifications_id) {
        this.vendorspecifications_id.set(vendorspecifications_id);
    }

    public IntegerProperty vendorspecifications_idProperty() {
        return vendorspecifications_id;
    }

    //antenna_name
    public StringProperty getAntenna_name() {
        return antenna_name;
    }

    public void setAntenna_name(String antenna_name) {
        this.antenna_name.set(antenna_name);
    }

    public StringProperty antenna_nameProperty() {
        return antenna_name;
    }

    //antenna_partnumber
    public StringProperty getAntenna_partnumber() {
        return antenna_partnumber;
    }

    public void setAntenna_partnumber(String antenna_partnumber) {
        this.antenna_partnumber.set(antenna_partnumber);
    }

    public StringProperty antenna_partnumberProperty() {
        return antenna_partnumber;
    }

    //antenna_serialnumber
    public StringProperty getAntenna_serialnumber() {
        return antenna_serialnumber;
    }

    public void setAntenna_serialnumber(String antenna_serialnumber) {
        this.antenna_serialnumber.set(antenna_serialnumber);
    }

    public StringProperty antenna_serialnumberProperty() {
        return antenna_serialnumber;
    }

    //antenna_modification
    public StringProperty getAntenna_modification() {
        return antenna_modification;
    }

    public void setAntenna_modification(String antenna_modification) {
        this.antenna_modification.set(antenna_modification);
    }

    public StringProperty antenna_modificationProperty() {
        return antenna_modification;
    }

    //antenna_powersupply
    public StringProperty getAntenna_powersupply() {
        return antenna_powersupply;
    }

    public void setAntenna_powersupply(String antenna_powersupply) {
        this.antenna_powersupply.set(antenna_powersupply);
    }

    public StringProperty antenna_powersupplyProperty() {
        return antenna_powersupply;
    }

    //antenna_rx_tx_switch
    public StringProperty getAntenna_rx_tx_switch() {
        return antenna_rx_tx_switch;
    }

    public void setAntenna_rx_tx_switch(String antenna_rx_tx_switch) {
        this.antenna_rx_tx_switch.set(antenna_rx_tx_switch);
    }

    public StringProperty antenna_rx_tx_switchProperty() {
        return antenna_rx_tx_switch;
    }

    //antenna_coordinatesystem
    public StringProperty getAntenna_coordinatesystem() {
        return antenna_coordinatesystem;
    }

    public void setAntenna_coordinatesystem(String antenna_coordinatesystem) {
        this.antenna_coordinatesystem.set(antenna_coordinatesystem);
    }

    public StringProperty antenna_coordinatesystemProperty() {
        return antenna_coordinatesystem;
    }

    //antenna_number_of_RFconnections
    public StringProperty getAntenna_number_of_RFconnections() {
        return antenna_number_of_RFconnections;
    }

    public void setAntenna_number_of_RFconnections(String antenna_number_of_RFconnections) {
        this.antenna_number_of_RFconnections.set(antenna_number_of_RFconnections);
    }

    public StringProperty antenna_number_of_RFconnectionsProperty() {
        return antenna_number_of_RFconnections;
    }
}
