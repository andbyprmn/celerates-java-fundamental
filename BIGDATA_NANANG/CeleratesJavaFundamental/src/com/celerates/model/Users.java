package com.celerates.model;

public class Users {
    
    String webToken;
    String username;
    String password;
    int flagLogin;

    public String getWebToken() {
        return webToken;
    }

    public void setWebToken(String webToken) {
        this.webToken = webToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFlagLogin() {
        return flagLogin;
    }

    public void setFlagLogin(int flagLogin) {
        this.flagLogin = flagLogin;
    }

    public Boolean getFlagBoolean() {
        return flagBoolean;
    }

    public void setFlagBoolean(Boolean flagBoolean) {
        this.flagBoolean = flagBoolean;
    }
    Boolean flagBoolean;

}
