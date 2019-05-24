/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.overridding;

/**
 *
 * @author Inggrid
 */
public class Anak extends Keluarga {
    
    //konsep overridding
    public void alamat(){
        System.out.println("Jakarta");
    }
    
    //memanggil method dari orangtua
    public void alamatParent(){
        super.alamat();
    }
}
