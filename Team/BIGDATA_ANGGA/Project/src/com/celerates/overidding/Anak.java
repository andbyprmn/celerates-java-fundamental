/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.overidding;

/**
 *
 * @author Muhammad Hanif
 */
public class Anak extends Keluarga{
    
    //overidding
    public void alamat(){
        System.out.println("Jakarta");
    }
    
    public void alamatParent(){
        super.alamat();
    }
    
}
