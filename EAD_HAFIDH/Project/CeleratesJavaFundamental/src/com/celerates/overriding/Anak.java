/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.overriding;

/**
 *
 * @author Hafidh Adhi
 */
public class Anak extends Keluarga{
    
    @Override
    public void alamat(){
        System.out.println("Jakarta");
    }
    
    public void alamatParent(){
        super.alamat();
    }
    
}
