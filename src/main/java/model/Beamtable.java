package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Beamtable {
    //Declare Beamtable Columns
    private IntegerProperty beamtable_id;
    private IntegerProperty beam_number;
    private IntegerProperty beam_dwell;
    private IntegerProperty beam_frequency;
    private StringProperty beam_phi_axis;
    private StringProperty beam_az_axis;
    private StringProperty beam_pol_axis;
    private StringProperty beam_x_axis;
    private StringProperty beam_y_axis;
    private StringProperty beam_aut_z;
    private StringProperty beam_aut_switch;
    private StringProperty beam_RF_switch_driver;

    //Constructor
    public Beamtable() {
        this.beamtable_id = new SimpleIntegerProperty();
        this.beam_number = new SimpleIntegerProperty();
        this.beam_dwell = new SimpleIntegerProperty();
        this.beam_frequency = new SimpleIntegerProperty();
        this.beam_phi_axis = new SimpleStringProperty();
        this.beam_az_axis = new SimpleStringProperty();
        this.beam_pol_axis = new SimpleStringProperty();
        this.beam_x_axis = new SimpleStringProperty();
        this.beam_y_axis = new SimpleStringProperty();
        this.beam_aut_z = new SimpleStringProperty();
        this.beam_aut_switch = new SimpleStringProperty();
        this.beam_RF_switch_driver = new SimpleStringProperty();
    }

    //beamtable_id
    public int getBeamtable_id() {
        return beamtable_id.get();
    }

    public void setBeamtable_id(int beamtable_id) {
        this.beamtable_id.set(beamtable_id);
    }

    public IntegerProperty beamtable_idProperty() {
        return beamtable_id;
    }

    //beam_number
    public int getBeam_number() {
        return beam_number.get();
    }

    public void setBeam_number(int beam_number) {
        this.beam_number.set(beam_number);
    }

    public IntegerProperty beam_numberProperty() {
        return beam_number;
    }

    //beam_dwell
    public int getBeam_dwell() {
        return beam_dwell.get();
    }

    public void setBeam_dwell(int beam_dwell) {
        this.beam_dwell.set(beam_dwell);
    }

    public IntegerProperty beam_dwellProperty() {
        return beam_dwell;
    }

    //beam_frequency
    public int getBeam_frequency() {
        return beam_frequency.get();
    }

    public void setBeam_frequency(int beam_frequency) {
        this.beam_frequency.set(beam_frequency);
    }

    public IntegerProperty beam_frequencyProperty() {
        return beam_frequency;
    }

    //beam_phi_axis
    public String getBeam_phi_axis() {
        return beam_phi_axis.get();
    }

    public void setBeam_phi_axis(String beam_phi_axis) {
        this.beam_phi_axis.set(beam_phi_axis);
    }

    public StringProperty beam_phi_axisProperty() {
        return beam_phi_axis;
    }

    //beam_az_axis
    public String getBeam_az_axis() {
        return  beam_az_axis.get();
    }

    public void setBeam_az_axis(String beam_az_axis) {
        this.beam_az_axis.set(beam_az_axis);
    }

    public StringProperty beam_az_axisProperty() {
        return beam_az_axis;
    }

    //beam_pol_axis
    public String getBeam_pol_axis() {
        return  beam_pol_axis.get();
    }

    public void setBeam_pol_axis(String beam_pol_axis) {
        this.beam_pol_axis.set(beam_pol_axis);
    }

    public StringProperty beam_pol_axisProperty() {
        return beam_pol_axis;
    }

    //beam_x_axis
    public String getBeam_x_axis() {
        return  beam_x_axis.get();
    }

    public void setBeam_x_axis(String beam_x_axis) {
        this.beam_x_axis.set(beam_x_axis);
    }

    public StringProperty beam_x_axisProperty() {
        return beam_x_axis;
    }

    //beam_y_axis
    public String getBeam_y_axis() {
        return  beam_y_axis.get();
    }

    public void setBeam_y_axis(String beam_y_axis) {
        this.beam_y_axis.set(beam_y_axis);
    }

    public StringProperty beam_y_axisProperty() {
        return beam_y_axis;
    }

    //beam_aut_z
    public String getBeam_aut_z() {
        return  beam_aut_z.get();
    }

    public void setBeam_aut_z(String beam_aut_z) {
        this.beam_aut_z.set(beam_aut_z);
    }

    public StringProperty beam_aut_zProperty() {
        return beam_aut_z;
    }

    //beam_aut_switch
    public String getBeam_aut_switch() {
        return  beam_aut_switch.get();
    }

    public void setBeam_aut_switch(String beam_aut_switch) {
        this.beam_aut_switch.set(beam_aut_switch);
    }

    public StringProperty beam_aut_switchProperty() {
        return beam_aut_switch;
    }

    //beam_RF_switch_driver
    public String getBeam_RF_Switch_Driver() {
        return  beam_RF_switch_driver.get();
    }

    public void setBeam_RF_switch_driver(String beam_rf_switch_driver) {
        this.beam_RF_switch_driver.set(beam_rf_switch_driver);
    }

    public StringProperty beam_RF_switch_driverProperty() {
        return beam_RF_switch_driver;
    }
}
