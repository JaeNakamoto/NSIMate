package com.nsimate.nsimate;

public final class LoginSession {
    private static LoginSession instance;

    private static String username;
    private static String password;
    private static String privileges;

    public LoginSession(String username, String password, String privileges) {
        this.username = username;
        this.password = password;
        this.privileges = privileges;
    }

    public static LoginSession getInstance(String username, String password, String privileges) {
        if(instance == null) {
            instance = new LoginSession(username, password, privileges);
        }
        return instance;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static String getPrivileges() {
        return privileges;
    }

    public void cleanUserSession() {
        username = "";
        privileges = "";
    }
}
