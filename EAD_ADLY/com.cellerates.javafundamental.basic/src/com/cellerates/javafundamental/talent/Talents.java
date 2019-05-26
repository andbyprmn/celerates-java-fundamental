/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.talent;

/**
 *
 * @author Admin
 */
public class Talents {
    String Nik; 
    String Nama; 
    public String alamat; 
    int umur ; 
    
    //Jika menggunakan access modifier static 
    // static String Nik; 
    // protected static int umur; 
    
    
    //public static void niKaryawan (String Nik){
    // nik = nik; 
    //System.out.println(nik);
    //}
    
    
    //Gunakan keyword thsi 
    public void niKaryawan(String Nik){
        this.Nik = Nik;
        System.out.println(this.Nik);
    }
    
    //Constructor & Overloading 
    
    // tanpa parameter
    public Talents(){
        System.out.println("Tanpa parameter");
    }
    
    public Talents(String Nik){
        System.out.println("dengan parameter");
    }
    
}
