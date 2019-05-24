/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.innerclassmain;

import com.celerates.innerclass.Keluarga;
import com.celerates.innerclass.Keluarga.Ayah;

/**
 *
 * @author Lisa Fita Sari
 */
public class InnerClassMain {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
        //deklarasi objek
        Keluarga objekKeluarga = new Keluarga();
        //call inner class
        Ayah innerKeluarga = objekKeluarga.new Ayah();
        
        innerKeluarga.umur = 60;
        System.out.println( "Umur Ayah adalah " + innerKeluarga.umur);
        
    }
    
}
