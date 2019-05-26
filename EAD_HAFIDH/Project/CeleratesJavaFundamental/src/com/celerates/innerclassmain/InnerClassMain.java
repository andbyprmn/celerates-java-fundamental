/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.innerclassmain;

import com.celerates.innerclass.Keluarga;
import com.celerates.innerclass.Keluarga.Ayah;
import com.celerates.innerclass.Keluarga.Ayah.Ayah1;

/**
 *
 * @author Hafidh Adhi
 */
public class InnerClassMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi objek
        Keluarga objKeluarga = new Keluarga();
        
        //call inner class
        Ayah innerKeluarga = objKeluarga.new Ayah();
        innerKeluarga.umur = 60;
        System.out.println(innerKeluarga.umur);
        
        //coba innerclass di dalam innerclass
        Ayah1 coba = innerKeluarga.new Ayah1();
        coba.tanggal = 90;
        System.out.println(coba.tanggal);
    }
    
}
