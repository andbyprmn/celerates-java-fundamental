/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.talent;

/**
 *
 * @author Hafidh Adhi
 */
public class Talents {

    String nik;
    static String nik2;
    String nama;
    public String alamat;
    protected int umur;

    //constructor
    public Talents() {
        System.out.println("Constructor Tanpa Parameter");
    }

    public Talents(String message) {
        System.out.println(message);
    }

    //keyword this
    public void niKaryawan(String nik) {
        this.nik = nik;
        System.out.println(this.nik);
        umur = 23;
    }
    
    //keyword static
    public static void niKaryawan2(String nik) {
        nik2 = nik;
        System.out.println(nik2);
    }
}
