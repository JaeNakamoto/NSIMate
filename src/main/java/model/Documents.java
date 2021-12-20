package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Documents {
    //Declare Documents Table Columns
    private IntegerProperty documents_id;
    private StringProperty document_url;

    //Constructor
    public Documents() {
        this.documents_id = new SimpleIntegerProperty();
        this.document_url = new SimpleStringProperty();
    }

    //documents_id
    public int getDocuments_id() {
        return documents_id.get();
    }

    public void setDocuments_id(int documents_id) {
        this.documents_id.set(documents_id);
    }

    public IntegerProperty documents_idProperty() {
        return documents_id;
    }

    //document_url
    public String getDocument_url() {
        return document_url.get();
    }

    public void setDocument_url(String document_url) {
        this.document_url.set(document_url);
    }

    public StringProperty document_urlProperty() {
        return document_url;
    }
}