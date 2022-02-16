package com.nsimate.nsimate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class LoginSession {
    //Declare Session Table Columns
    private IntegerProperty operator_id;
    private StringProperty first_name;
    private StringProperty last_name;
    private StringProperty username;
    private StringProperty password;
    private StringProperty user_privilege;

    //Constructor
    public LoginSession() {
        this.operator_id = new SimpleIntegerProperty();
        this.first_name = new SimpleStringProperty();
        this.last_name = new SimpleStringProperty();
        this.username = new SimpleStringProperty();
        this.password = new SimpleStringProperty();
        this.user_privilege = new SimpleStringProperty();
    }



    //user_id
    public int getOperator_id() {
        return operator_id.get();
    }
    public void setOperator_id(int operator_id) {
        this.operator_id.set(operator_id);
    }
    public IntegerProperty operator_idProperty() {
        return operator_id;
    }

    //first_name
    public String getFirst_name() {
        return first_name.get();
    }
    public void setFirst_name(String first_name) {
        this.first_name.set(first_name);
    }
    public StringProperty first_nameProperty() {
        return first_name;
    }

    //last_name
    public String getLast_name() {
        return last_name.get();
    }
    public void setLast_name(String last_name) {
        this.last_name.set(last_name);
    }
    public StringProperty last_nameProperty() {
        return last_name;
    }

    //username
    public String getUsername() {
        return username.get();
    }
    public void setUsername(String username) {
        this.username.set(username);
    }
    public StringProperty usernameProperty() {
        return username;
    }

    //password
    public String getPassword() {
        return password.get();
    }
    public void setPassword(String password) {
        this.password.set(password);
    }
    public StringProperty passwordProperty() {
        return password;
    }

    //user_privileges
    public String getUser_privilege() {
        return user_privilege.get();
    }
    public void setUser_privilege(String user_privilege) {
        this.user_privilege.set(user_privilege);
    }
    public StringProperty user_privilegeProperty() {
        return user_privilege;
    }
}
