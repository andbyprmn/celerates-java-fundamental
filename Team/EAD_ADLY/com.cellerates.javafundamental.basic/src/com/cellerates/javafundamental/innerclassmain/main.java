
package com.celerates.innerclassmain;

import com.celerates.innerclass.Keluarga;


public class main {

    public static void main(String[] args) {
        //deklarasi objek 
        Keluarga objKeluarga = new Keluarga(); 
        
        //call innerclass
        Keluarga.Ayah innerKeluarga = objKeluarga.new Ayah();
        
        innerKeluarga.Umur = 65; 
        System.out.println(innerKeluarga.Umur);
    }
    
}
