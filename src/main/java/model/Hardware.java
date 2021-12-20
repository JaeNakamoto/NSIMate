package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Hardware {
    //Declare Hardware Table Columns
    private IntegerProperty hardware_id;
    private StringProperty HW_coordinatesystem;
    private StringProperty HW_groundplane;
    private StringProperty HW_absorber;
    private StringProperty HW_separationrods;
    private StringProperty HW_probe;
    private IntegerProperty HW_MRE;
    private StringProperty HW_mechanical_adapter;
    private StringProperty HW_grounding_option;
    private StringProperty HW_control_cable;
    private StringProperty HW_NF_FF;
    private StringProperty HW_breakoutbox;
    private StringProperty HW_special1;

    //Constructor
    public Hardware() {
        this.hardware_id = new SimpleIntegerProperty();
        this.HW_coordinatesystem = new SimpleStringProperty();
        this.HW_groundplane = new SimpleStringProperty();
        this.HW_absorber = new SimpleStringProperty();
        this.HW_separationrods = new SimpleStringProperty();
        this.HW_probe = new SimpleStringProperty();
        this.HW_MRE = new SimpleIntegerProperty();
        this.HW_mechanical_adapter = new SimpleStringProperty();
        this.HW_grounding_option = new SimpleStringProperty();
        this.HW_control_cable = new SimpleStringProperty();
        this.HW_NF_FF = new SimpleStringProperty();
        this.HW_breakoutbox = new SimpleStringProperty();
        this.HW_special1 = new SimpleStringProperty();
    }

    //hardware_id
    public int getHardware_id() {
        return hardware_id.get();
    }

    public void setHardware_id(int hardware_id) {
        this.hardware_id.set(hardware_id);
    }

    public IntegerProperty hardware_idProperty() {
        return hardware_id;
    }

    //HW_coordinatesystem
    public String getHW_coordinatesystem() {
        return HW_coordinatesystem.get();
    }

    public void setHW_coordinatesystem(String HW_coordinatesystem) {
        this.HW_coordinatesystem.set(HW_coordinatesystem);
    }

    public StringProperty HW_coordinatesystemProperty() {
        return HW_coordinatesystem;
    }

    //HW_groundplane
    public String getHW_groundplane() {
        return HW_groundplane.get();
    }

    public void setHW_groundplane(String HW_groundplane) {
        this.HW_groundplane.set(HW_groundplane);
    }

    public StringProperty HW_groundplaneProperty() {
        return HW_groundplane;
    }

    //HW_absorber
    public String getHW_absorber() {
        return HW_absorber.get();
    }

    public void setHW_absorber(String HW_absorber) {
        this.HW_absorber.set(HW_absorber);
    }

    public StringProperty HW_absorberProperty() {
        return HW_absorber;
    }

    //HW_separationrods
    public String getHW_separationrods() {
        return HW_separationrods.get();
    }

    public void setHW_separationrods(String HW_separationrods) {
        this.HW_separationrods.set(HW_separationrods);
    }

    public StringProperty HW_separationrodsProperty() {
        return HW_separationrods;
    }

    //HW_probe
    public String getHW_probe() {
        return HW_probe.get();
    }

    public void setHW_probe(String HW_probe) {
        this.HW_probe.set(HW_probe);
    }

    public StringProperty HW_probeProperty() {
        return HW_probe;
    }

    //HW_MRE
    public int getHW_MRE() {
        return HW_MRE.get();
    }

    public void setHW_MRE(int HW_MRE) {
        this.HW_MRE.set(HW_MRE);
    }

    public IntegerProperty HW_MREProperty() {
        return HW_MRE;
    }

    //HW_mechanical_adapter
    public String getHW_mechanical_adapter() {
        return HW_mechanical_adapter.get();
    }

    public void setHW_mechanical_adapter(String HW_mechanical_adapter) {
        this.HW_mechanical_adapter.set(HW_mechanical_adapter);
    }

    public StringProperty HW_mechanical_adapterProperty() {
        return HW_mechanical_adapter;
    }

    //HW_grounding_option
    public String getHW_grounding_option() {
        return HW_grounding_option.get();
    }

    public void setHW_grounding_option(String HW_grounding_option) {
        this.HW_grounding_option.set(HW_grounding_option);
    }

    public StringProperty HW_grounding_optionProperty() {
        return HW_grounding_option;
    }

    //HW_control_cable
    public String getHW_control_cable() {
        return HW_control_cable.get();
    }

    public void setHW_control_cable(String HW_control_cable) {
        this.HW_control_cable.set(HW_control_cable);
    }

    public StringProperty HW_control_cableProperty() {
        return HW_control_cable;
    }

    //HW_NF_FF
    public String getHW_NF_FF() {
        return HW_NF_FF.get();
    }

    public void setHW_NF_FF(String HW_NF_FF) {
        this.HW_NF_FF.set(HW_NF_FF);
    }

    public StringProperty HW_NF_FFProperty() {
        return HW_NF_FF;
    }

    //HW_breakoutbox
    public String getHW_breakoutbox() {
        return HW_breakoutbox.get();
    }

    public void setHW_breakoutbox(String HW_breakoutbox) {
        this.HW_breakoutbox.set(HW_breakoutbox);
    }

    public StringProperty HW_breakoutboxProperty() {
        return HW_breakoutbox;
    }

    //HW_special1
    public String getHW_special1() {
        return HW_special1.get();
    }

    public void setHW_special1(String HW_special1) {
        this.HW_special1.set(HW_special1);
    }

    public StringProperty HW_special1Property() {
        return HW_absorber;
    }
}
