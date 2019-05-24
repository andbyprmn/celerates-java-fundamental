
package com.celerates.model;


public class Users {
    
    String webtoken;
    String Username;
    String Password;
    int flaglogin;
    Boolean flagBoolean;

    //membuat set dan get name otomatis gunakan klik kanan insert code
    public String getWebtoken() {
        return webtoken;
    }

    public void setWebtoken(String webtoken) {
        this.webtoken = webtoken;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getFlaglogin() {
        return flaglogin;
    }

    public void setFlaglogin(int flaglogin) {
        this.flaglogin = flaglogin;
    }

    public Boolean getFlagBoolean() {
        return flagBoolean;
    }

    public void setFlagBoolean(Boolean flagBoolean) {
        this.flagBoolean = flagBoolean;
    }
    
    
    
}
