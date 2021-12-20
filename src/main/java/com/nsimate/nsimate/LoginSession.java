package com.nsimate.nsimate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public final class LoginSession {
    //Declare Session Table Columns
    private IntegerProperty user_id;
    private StringProperty firstname;
    private StringProperty lastname;
    private StringProperty username;
    private StringProperty password;
    private StringProperty user_privileges;

    //Constructor
    public LoginSession() {
        this.user_id = new SimpleIntegerProperty();
        this.firstname = new SimpleStringProperty();
        this.lastname = new SimpleStringProperty();
        this.username = new SimpleStringProperty();
        this.password = new SimpleStringProperty();
        this.user_privileges = new SimpleStringProperty();
    }

    //user_id
    public int getUser_id() {
        return user_id.get();
    }

    public void setUser_id(int user_id) {
        this.user_id.set(user_id);
    }

    public IntegerProperty user_idProperty() {
        return user_id;
    }

    //firstname
    public String getFirstname() {
        return firstname.get();
    }

    public void setFirstname(String firstname) {
        this.firstname.set(firstname);
    }

    public StringProperty firstnameProperty() {
        return firstname;
    }

    //lastname
    public String getLastname() {
        return lastname.get();
    }

    public void setLastname(String lastname) {
        this.lastname.set(lastname);
    }

    public StringProperty lastnameProperty() {
        return lastname;
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
    public String getUser_privileges() {
        return user_privileges.get();
    }

    public void setUser_privileges(String user_privileges) {
        this.user_privileges.set(user_privileges);
    }

    public StringProperty user_privilegesProperty() {
        return user_privileges;
    }
}
