package model;

import javafx.beans.property.*;

public class Variable {
    //Declare Variable Table Columns
    private IntegerProperty variable_id;
    private IntegerProperty batch_id;
    private StringProperty antenna_serialnr;
    private StringProperty antenna_modification;
    private StringProperty feed_serialnr;
    private StringProperty scan_startdate;
    private StringProperty scan_stopdate;
    private StringProperty scan_starttime;
    private StringProperty scan_stoptime;
    private FloatProperty temperature_min;
    private FloatProperty temperature_max;
    private IntegerProperty operator_id;
    private StringProperty excel_document_path;

    //Constructor
    public Variable() {
        this.variable_id = new SimpleIntegerProperty();
        this.batch_id = new SimpleIntegerProperty();
        this.antenna_serialnr = new SimpleStringProperty();
        this.antenna_modification = new SimpleStringProperty();
        this.feed_serialnr = new SimpleStringProperty();
        this.scan_startdate = new SimpleStringProperty();
        this.scan_stopdate = new SimpleStringProperty();
        this.scan_starttime = new SimpleStringProperty();
        this.scan_stoptime = new SimpleStringProperty();
        this.temperature_min = new SimpleFloatProperty();
        this.temperature_max = new SimpleFloatProperty();
        this.operator_id = new SimpleIntegerProperty();
        this.excel_document_path = new SimpleStringProperty();
    }

    //variable_id
    public int getVariable_id() {
        return variable_id.get();
    }
    public void setvariable_id(int variable_id) {
        this.variable_id.set(variable_id);
    }
    public IntegerProperty variable_idProperty() {
        return variable_id;
    }

    //batch_id
    public int getBatch_id() {
        return batch_id.get();
    }
    public void setBatch_id(int batch_id) {
        this.batch_id.set(batch_id);
    }
    public IntegerProperty batch_idProperty() {
        return batch_id;
    }

    //antenna_serialnr
    public String getAntenna_serialnr() {
        return antenna_serialnr.get();
    }
    public void setAntenna_serialnr(String antenna_serialnr) {
        this.antenna_serialnr.set(antenna_serialnr);
    }
    public StringProperty antenna_serialnrProperty() {
        return antenna_serialnr;
    }

    //antenna_modification
    public String getAntenna_modification() {
        return antenna_modification.get();
    }
    public void setAntenna_modification(String antenna_modification) {
        this.antenna_modification.set(antenna_modification);
    }
    public StringProperty antenna_modificationProperty() {
        return antenna_modification;
    }

    //feed_serialnr
    public String getFeed_serialnr() {
        return feed_serialnr.get();
    }
    public void setFeed_serialnr(String feed_serialnr) {
        this.feed_serialnr.set(feed_serialnr);
    }
    public StringProperty feed_serialnrProperty() {
        return feed_serialnr;
    }

    //scan_startdate
    public String getScan_startdate() {
        return scan_startdate.get();
    }
    public void setScan_startdate(String scan_startdate) {
        this.scan_startdate.set(scan_startdate);
    }
    public StringProperty scan_startdateProperty() {
        return scan_startdate;
    }

    //scan_stopdate
    public String getScan_stopdate() {
        return scan_stopdate.get();
    }
    public void setScan_stopdate(String scan_stopdate) {
        this.scan_stopdate.set(scan_stopdate);
    }
    public StringProperty scan_stopdateProperty() {
        return scan_stopdate;
    }

    //scan_starttime
    public String getScan_starttime() {
        return scan_starttime.get();
    }
    public void setScan_starttime(String scan_starttime) {
        this.scan_starttime.set(scan_starttime);
    }
    public StringProperty scan_starttimeProperty() {
        return scan_starttime;
    }

    //scan_stoptime
    public String getScan_stoptime() {
        return scan_stoptime.get();
    }
    public void setScan_stoptime(String scan_stoptime) {
        this.scan_stoptime.set(scan_stoptime);
    }
    public StringProperty scan_stoptimeProperty() {
        return scan_stoptime;
    }

    //temperature_min
    public Float getTemperature_min() {
        return temperature_min.get();
    }
    public void setTemperature_min(Float temperature_min) {
        this.temperature_min.set(temperature_min);
    }
    public FloatProperty temperature_minProperty() {
        return temperature_min;
    }

    //temperature_max
    public Float getTemperature_max() {
        return temperature_max.get();
    }
    public void setTemperature_max(Float temperature_max) {
        this.temperature_max.set(temperature_max);
    }
    public FloatProperty temperature_maxProperty() {
        return temperature_max;
    }

    //operator_id
    public int getOperator_id() {
        return operator_id.get();
    }
    public void setOperator_id(int operator_id) {
        this.operator_id.set(operator_id);
    }
    public IntegerProperty operator_idProperty() {
        return operator_id;
    }

    //excel_document_path
    public String getExcel_document_path() {
        return excel_document_path.get();
    }
    public void setExcel_document_path(String excel_document_path) {
        this.excel_document_path.set(excel_document_path);
    }
    public StringProperty excel_document_pathProperty() {
        return excel_document_path;
    }

}
