/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.overriding;

/**
 *
 * @author Lisa Fita Sari
 */
public class Anak extends Keluarga{
    
    //@Overidding
    public void alamat(){
        System.out.println("Jakarta");
    }
    
    //Keyword super
    public void alamatParent(){
        super.alamat();
    }
    
}
