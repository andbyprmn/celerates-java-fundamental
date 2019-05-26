/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.classmain;

import com.celerates.innerclass.Keluarga;
import com.celerates.innerclass.Keluarga.Ayah;

/**
 *
 * @author ACER
 */
public class InnerClassMain {
    public static void main(String[] args){
        Keluarga objKeluarga = new Keluarga();
        Ayah innerKeluarga = objKeluarga.new Ayah();
        
        innerKeluarga.umur = 60;
        System.out.println(innerKeluarga.umur);
    }
}
