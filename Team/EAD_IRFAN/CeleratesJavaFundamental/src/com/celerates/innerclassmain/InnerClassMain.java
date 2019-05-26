package com.celerates.innerclassmain;

import com.celerates.innerclass.Keluarga;
import com.celerates.innerclass.Keluarga.Ayah;

public class InnerClassMain {
    public static void main(String[] args) {
        // deklarasi objek
        Keluarga objKeluarga = new Keluarga();
        
        // call innner class
        Ayah innerKeluarga = objKeluarga.new Ayah();
        
        innerKeluarga.umur = 60;
        System.out.println(innerKeluarga.umur);
        
    }
}
