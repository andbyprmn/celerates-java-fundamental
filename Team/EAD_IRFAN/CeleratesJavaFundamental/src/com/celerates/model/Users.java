package com.celerates.model;

public class Users {
    
    String webToken;
    String username;
    String password;
    int flagLogin;
    Boolean flagBoolean;
    
    // webToken
    public String getWebToken() {
        return webToken;
    }

    public void setWebToken(String webToken) {
        this.webToken = webToken;
    }
    
    // username
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    // password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // getflaglogin
    public int getFlagLogin() {
        return flagLogin;
    }

    public void setFlagLogin(int flagLogin) {
        this.flagLogin = flagLogin;
    }
    
    // getflagboolean
    public Boolean getFlagBoolean() {
        return flagBoolean;
    }

    public void setFlagBoolean(Boolean flagBoolean) {
        this.flagBoolean = flagBoolean;
    }
    
}
