package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Batch {
    //Declare Batch Table Columns
    private IntegerProperty batch_id;
    private StringProperty batch_startdate;
    private StringProperty batch_starttime;
    private StringProperty batch_stopdate;
    private StringProperty batch_stoptime;

    //Constructor
    public Batch() {
        this.batch_id = new SimpleIntegerProperty();
        this.batch_startdate = new SimpleStringProperty();
        this.batch_starttime = new SimpleStringProperty();
        this.batch_stopdate = new SimpleStringProperty();
        this.batch_stoptime = new SimpleStringProperty();
    }

    //batch_id
    public int getBatch_id() {
        return batch_id.get();
    }

    public void setBatch_id(int batch_id) {
        this.batch_id.set(batch_id);
    }

    public IntegerProperty batchIDProperty() {
        return batch_id;
    }

    //batch_startdate
    public String getBatch_startdate() {
        return batch_startdate.get();
    }

    public void setBatch_startdate(String batch_startdate) {
        this.batch_startdate.set(batch_startdate);
    }

    public StringProperty batch_startdateProperty() {
        return batch_startdate;
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

}
