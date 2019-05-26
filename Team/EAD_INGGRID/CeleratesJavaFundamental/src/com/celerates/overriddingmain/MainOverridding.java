/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.overriddingmain;

import com.celerates.overridding.Anak;

/**
 *
 * @author Inggrid
 */
public class MainOverridding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Anak kecil = new Anak();
        kecil.alamat(); //kalau menggunakan prosedur langsung mencetak tanpa menggunakan syso
        //memanggil method dari parent
        kecil.alamatParent();
        
    }
    
}
