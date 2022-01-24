package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Antenna {
    //Declare Antenna Table Columns
    private IntegerProperty antenna_id;
    private StringProperty antenna_name;
    private StringProperty antenna_partnr;
    private StringProperty antenna_powersupply;
    private StringProperty antenna_rx_tx_switch;
    private StringProperty antenna_coordinatesystem;
    private IntegerProperty antenna_nr_of_rf_connections;
    private StringProperty vendorspecifications;

    //Constructor
    public Antenna() {
        this.antenna_id = new SimpleIntegerProperty();
        this.antenna_name = new SimpleStringProperty();
        this.antenna_partnr = new SimpleStringProperty();
        this.antenna_powersupply = new SimpleStringProperty();
        this.antenna_rx_tx_switch = new SimpleStringProperty();
        this.antenna_coordinatesystem = new SimpleStringProperty();
        this.antenna_nr_of_rf_connections = new SimpleIntegerProperty();
        this.vendorspecifications = new SimpleStringProperty();
    }

    //antenna_id
    public int getAntenna_id() {
        return antenna_id.get();
    }
    public void setAntenna_id(int antenna_id) {
        this.antenna_id.set(antenna_id);
    }
    public IntegerProperty antenna_idProperty() {
        return antenna_id;
    }

    //antenna_name
    public String getAntenna_name() {
        return antenna_name.get();
    }
    public void setAntenna_name(String antenna_name) {
        this.antenna_name.set(antenna_name);
    }
    public StringProperty antenna_nameProperty() {
        return antenna_name;
    }

    //antenna_partnr
    public String getAntenna_partnr() {
        return antenna_partnr.get();
    }
    public void setAntenna_partnr(String antenna_partnr) {
        this.antenna_partnr.set(antenna_partnr);
    }
    public StringProperty antenna_partnrProperty(){
        return antenna_partnr;
    }

    //antenna_powersupply
    public String getAntenna_powersupply() {
        return antenna_powersupply.get();
    }
    public void setAntenna_powersupply(String antenna_powersupply) {
        this.antenna_powersupply.set(antenna_powersupply);
    }
    public StringProperty antenna_powersupplyProperty(){
        return antenna_powersupply;
    }

    //antenna_rx_tx_switch
    public String getAntenna_rx_tx_switch() {
        return antenna_rx_tx_switch.get();
    }
    public void setAntenna_rx_tx_switch(String antenna_rx_tx_switch) {
        this.antenna_rx_tx_switch.set(antenna_rx_tx_switch);
    }
    public StringProperty antenna_rx_tx_switchProperty(){
        return antenna_rx_tx_switch;
    }

    //antenna_coordinatesystem
    public String getAntenna_coordinatesystem() {
        return antenna_coordinatesystem.get();
    }
    public void setAntenna_coordinatesystem(String antenna_coordinatesystem) {
        this.antenna_coordinatesystem.set(antenna_coordinatesystem);
    }
    public StringProperty antenna_coordinatesystemProperty(){
        return antenna_coordinatesystem;
    }

    //antenna_nr_of_rf_connections
    public int getAntenna_nr_of_rf_connections() {
        return antenna_nr_of_rf_connections.get();
    }
    public void setAntenna_nr_of_rf_connections(int antenna_nr_of_rf_connections) {
        this.antenna_nr_of_rf_connections.set(antenna_nr_of_rf_connections);
    }
    public IntegerProperty antenna_nr_of_rf_connectionsProperty(){
        return antenna_nr_of_rf_connections;
    }

    //vendorspecifications
    public String getVendorspecifications() {
        return vendorspecifications.get();
    }
    public void setVendorspecifications(String vendorspecifications) {
        this.vendorspecifications.set(vendorspecifications);
    }
    public StringProperty vendorspecificationsProperty(){
        return vendorspecifications;
    }

}
