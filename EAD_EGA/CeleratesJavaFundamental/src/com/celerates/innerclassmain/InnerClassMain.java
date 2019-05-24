package com.celerates.innerclassmain;

import com.celerates.innerclass.Keluarga;
import com.celerates.innerclass.Keluarga.Ayah;

public class InnerClassMain {
    public static void main(String[] args){
        // Deklarasi objek (instance class)
        Keluarga objKeluarga = new Keluarga();
        // Call inner clas
        Ayah innerKeluarga = objKeluarga.new Ayah();

        innerKeluarga.umur = 60;
        System.out.println(innerKeluarga.umur);
    }
}
