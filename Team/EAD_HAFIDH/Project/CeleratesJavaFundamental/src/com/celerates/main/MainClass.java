/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.main;

import com.celerates.model.Users;
import com.celerates.talent.Talents;

/**
 *
 * @author Hafidh Adhi
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Talents.niKaryawan2("Keyword Static bisa dipanggil tanpa membuat objek terlebih dahulu");
        
        
        Talents talent = new Talents();
        Talents talent2 = new Talents("Constructor dengan Parameter");
        talent.niKaryawan("9817387");
        
        Users user = new Users();
        
        user.setWebToken("hafidh123");
        
        if (user.getWebToken() != "hafidh123") {
            System.out.println("Session Telah Habis");
        }else{
            System.out.println("In Login");
        }
    }

}
