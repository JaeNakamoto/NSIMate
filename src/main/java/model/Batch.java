package model;

import javafx.beans.property.*;

public class Batch {
    //Declare Batch Table Columns
    private IntegerProperty batch_id;
    private IntegerProperty scan_setup_id;
    private IntegerProperty probe_id;
    private StringProperty batch_startdate;
    private StringProperty batch_stopdate;
    private StringProperty batch_starttime;
    private StringProperty batch_stoptime;
    private FloatProperty reference_origin_theta;
    private FloatProperty reference_origin_phi;
    private StringProperty reference_location;
    private FloatProperty aut_location_x;
    private FloatProperty aut_location_y;
    private FloatProperty aut_location_z;
    private StringProperty coordinate_system;
    private StringProperty groundplate;
    private StringProperty absorber;
    private StringProperty separation_rods;
    private FloatProperty mre;
    private StringProperty mechanical_adapter;
    private StringProperty grounding_option;
    private StringProperty control_cable;
    private StringProperty nf_ff;
    private StringProperty breakoutbox;
    private StringProperty special;

    //Constructor
    public Batch() {
        this.batch_id = new SimpleIntegerProperty();
        this.scan_setup_id = new SimpleIntegerProperty();
        this.probe_id = new SimpleIntegerProperty();
        this.batch_startdate = new SimpleStringProperty();
        this.batch_stopdate = new SimpleStringProperty();
        this.batch_starttime = new SimpleStringProperty();
        this.batch_stoptime = new SimpleStringProperty();
        this.reference_origin_theta = new SimpleFloatProperty();
        this.reference_origin_phi = new SimpleFloatProperty();
        this.reference_location = new SimpleStringProperty();
        this.aut_location_x = new SimpleFloatProperty();
        this.aut_location_y = new SimpleFloatProperty();
        this.aut_location_z = new SimpleFloatProperty();
        this.coordinate_system = new SimpleStringProperty();
        this.groundplate = new SimpleStringProperty();
        this.absorber = new SimpleStringProperty();
        this.separation_rods = new SimpleStringProperty();
        this.mre = new SimpleFloatProperty();
        this.mechanical_adapter = new SimpleStringProperty();
        this.grounding_option = new SimpleStringProperty();
        this.control_cable = new SimpleStringProperty();
        this.nf_ff = new SimpleStringProperty();
        this.breakoutbox = new SimpleStringProperty();
        this.special = new SimpleStringProperty();
    }

    //antenna_id
    public int getBatch_id() {
        return batch_id.get();
    }
    public void setBatch_id(int batch_id) {
        this.batch_id.set(batch_id);
    }
    public IntegerProperty batch_idProperty() {
        return batch_id;
    }

    //scan_setup_id
    public int getScan_setup_id() {
        return scan_setup_id.get();
    }
    public void setScan_setup_id(int scan_setup_id) {
        this.scan_setup_id.set(scan_setup_id);
    }
    public IntegerProperty scan_setup_idProperty() {
        return scan_setup_id;
    }

    //probe_id
    public int getProbe_id() {
        return probe_id.get();
    }
    public void setProbe_id(int probe_id) {
        this.probe_id.set(probe_id);
    }
    public IntegerProperty probe_idProperty() {
        return probe_id;
    }

    //batch_startdate
    public String getBatch_startdate() {
        return batch_startdate.get();
    }
    public void setBatch_startdate(String batch_startdate) {
        this.batch_startdate.set(batch_startdate);
    }
    public StringProperty batch_stardateProperty() {
        return batch_startdate;
    }

    //batch_stopdate
    public String getBatch_stopdate() {
        return batch_stopdate.get();
    }
    public void setBatch_stopdate(String batch_stopdate) {
        this.batch_stopdate.set(batch_stopdate);
    }
    public StringProperty batch_stopdateProperty() {
        return batch_stopdate;
    }

    //batch_starttime
    public String getBatch_starttime() {
        return batch_starttime.get();
    }
    public void setBatch_starttime(String batch_starttime) {
        this.batch_starttime.set(batch_starttime);
    }
    public StringProperty batch_starttimeProperty() {
        return batch_starttime;
    }

    //batch_stoptime
    public String getBatch_stoptime() {
        return batch_stoptime.get();
    }
    public void setBatch_stoptime(String batch_stoptime) {
        this.batch_stoptime.set(batch_stoptime);
    }
    public StringProperty batch_stoptimeProperty() {
        return batch_stoptime;
    }

    //reference_origin_theta
    public Float getReference_origin_theta() {
        return reference_origin_theta.get();
    }
    public void setReference_origin_theta(Float reference_origin_theta) {
        this.reference_origin_theta.set(reference_origin_theta);
    }
    public FloatProperty reference_origin_thetaProperty() {
        return reference_origin_theta;
    }

    //reference_origin_phi
    public Float getReference_origin_phi() {
        return reference_origin_phi.get();
    }
    public void setReference_origin_phi(Float reference_origin_phi) {
        this.reference_origin_phi.set(reference_origin_phi);
    }
    public FloatProperty reference_origin_phiProperty() {
        return reference_origin_phi;
    }

    //reference_location
    public String getReference_location() {
        return reference_location.get();
    }
    public void setReference_location(String reference_location) {
        this.reference_location.set(reference_location);
    }
    public StringProperty reference_locationProperty() {
        return reference_location;
    }

    //aut_location_x
    public Float getAut_location_x() {
        return aut_location_x.get();
    }
    public void setAut_location_x(Float aut_location_x) {
        this.aut_location_x.set(aut_location_x);
    }
    public FloatProperty aut_location_xProperty() {
        return aut_location_x;
    }

    //aut_location_y
    public Float getAut_location_y() {
        return aut_location_y.get();
    }
    public void setAut_location_y(Float aut_location_y) {
        this.aut_location_y.set(aut_location_y);
    }
    public FloatProperty aut_location_yProperty() {
        return aut_location_y;
    }

    //aut_location_z
    public Float getAut_location_z() {
        return aut_location_z.get();
    }
    public void setAut_location_z(Float aut_location_z) {
        this.aut_location_z.set(aut_location_z);
    }
    public FloatProperty aut_location_zProperty() {
        return aut_location_z;
    }

    //coordinate_system
    public String getCoordinate_systtem() {
        return coordinate_system.get();
    }
    public void setCoordinate_system(String coordinate_system) {
        this.coordinate_system.set(coordinate_system);
    }
    public StringProperty coordinate_systemProperty() {
        return coordinate_system;
    }

    //groundplate
    public String getGroundplate() {
        return groundplate.get();
    }
    public void setGroundplate(String groundplate) {
        this.groundplate.set(groundplate);
    }
    public StringProperty groundplateProperty() {
        return groundplate;
    }

    //absorber
    public String getAbsorber() {
        return absorber.get();
    }
    public void setAbsorber(String absorber) {
        this.absorber.set(absorber);
    }
    public StringProperty absorberProperty() {
        return absorber;
    }

    //separation_rods
    public String getSeparation_rods() {
        return separation_rods.get();
    }
    public void setSeparation_rods(String separation_rods) {
        this.separation_rods.set(separation_rods);
    }
    public StringProperty separation_rodsProperty() {
        return separation_rods;
    }

    //mre
    public Float getMre() {
        return mre.get();
    }
    public void setMre(Float mre) {
        this.mre.set(mre);
    }
    public FloatProperty mreProperty() {
        return mre;
    }
}
