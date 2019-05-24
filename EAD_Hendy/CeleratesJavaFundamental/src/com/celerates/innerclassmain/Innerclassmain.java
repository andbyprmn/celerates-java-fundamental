
package com.celerates.innerclassmain;

import com.celerates.innerclass.keluarga;
import com.celerates.innerclass.keluarga.ayah;


public class Innerclassmain {

    public static void main(String[] args) {
        //deklarasi object
        keluarga objkeluarga = new keluarga();
        //manggil inner
        ayah innerkeluarga = objkeluarga.new ayah();
        
        innerkeluarga.umur = 60;
        System.out.println(innerkeluarga.umur);
    }
    
}
