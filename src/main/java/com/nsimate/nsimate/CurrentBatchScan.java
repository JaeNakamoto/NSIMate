package com.nsimate.nsimate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CurrentBatchScan {
    //Declare Table Columns
    private IntegerProperty currentBatchID;
    private IntegerProperty currentScanID;

    //Constructor
    public CurrentBatchScan() {
        this.currentBatchID = new SimpleIntegerProperty();
        this.currentScanID = new SimpleIntegerProperty();
    }

    //currentBatchID
    public int getCurrentBatchID() {
        return currentBatchID.get();
    }
    public void setCurrentBatchID(int currentBatchID) {
        this.currentBatchID.set(currentBatchID);
    }
    public IntegerProperty currentBatchIDProperty() {
        return currentBatchID;
    }

    //currentBatchID
    public int getCurrentScanID() {
        return currentScanID.get();
    }
    public void setCurrentScanID(int currentScanID) {
        this.currentScanID.set(currentScanID);
    }
    public IntegerProperty currentScanIDProperty() {
        return currentScanID;
    }
}
