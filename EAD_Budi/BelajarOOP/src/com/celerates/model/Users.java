/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.model;

/**
 *
 * @author ACER
 */
public class Users {
      String webToken;
        String userName;
        String password;
        int flagLogin;
        Boolean flagBoolean;


    public String getWebToken() {
        return webToken;
    }

    public void setWebToken(String webToken) {
        this.webToken = webToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Boolean getFlag() {
        return flagBoolean;
    }

    public void setFlag(Boolean flag) {
        this.flagBoolean = flag;
    }
      
}