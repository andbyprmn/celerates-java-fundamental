/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.talent;

/**
 *
 * @author Lisa Fita Sari
 */
public class Talents {
    String nik;
    String nama;
        
    //Class modifier
    private String alamat;
    protected int umur;
    
    //static
    static String nik2;
    
    //keyword This
    public void niKaryawan(String nik){
        this.nik = nik;
        System.out.println(this.nik);
        
        umur = 23;
    }
        
    
    //Constructor & Overloading
    //Syarat harus sama dengan nama kelas
    //tidak menggunakan void serta tidak seperti function yang memiliki return
    public Talents(){
        System.out.println("Constructor tanpa parameter");
    }
    public Talents(String nik){
        System.out.println("Constructor menggunakan parameter");
    }
    public Talents(int message){
        System.out.println(message);
    }
    
    //Keyword static
    public static void niKaryawan2(String nik2){
        System.out.println(nik2);
    }
    
}
