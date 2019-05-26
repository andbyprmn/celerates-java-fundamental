package com.celerates.MainClass;

import com.celerates.InnerClass.Keluarga;
import com.celerates.InnerClass.Keluarga.Ayah;

public class InnerClassMain {

    public static void main(String[] args) {
        
        // deklarasi objek (syarat pertama)
        Keluarga objKeluarga = new Keluarga ();
        
        // call inner class (syarat kedua)
        Ayah innerKeluarga = objKeluarga.new Ayah ();
        
        
        innerKeluarga.umur = 60;
        innerKeluarga.nama = "Suyono";
        
        System.out.println(innerKeluarga.nama);
        System.out.println(innerKeluarga.umur);
    }
    
}
