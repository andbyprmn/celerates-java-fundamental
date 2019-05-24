/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.overridingmain;

import com.celerates.overriding.Anak;

/**
 *
 * @author Hafidh Adhi
 */
public class OverridingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anak objAnak = new Anak();
        objAnak.alamat();
        objAnak.alamatParent();
    }
    
}
