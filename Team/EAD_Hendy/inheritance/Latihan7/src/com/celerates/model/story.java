/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.model;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author hendy nurfriyanto
 */
public class story extends Insta {
    public String tgl;



    public String getTgl() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    
    
    
}
