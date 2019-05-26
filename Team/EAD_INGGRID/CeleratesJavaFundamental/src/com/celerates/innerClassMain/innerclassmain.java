
package com.celerates.innerClassMain;

import com.celerates.innerclass.Keluarga;
import com.celerates.innerclass.Keluarga.Ayah;

/**
 *
 * @author Inggrid
 */
public class innerclassmain {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //deklarasi objek
        
       Keluarga objkeluarga = new Keluarga();
       Ayah innerKeluarga = objkeluarga.new Ayah();
       
       innerKeluarga.umur = 60;
       System.out.println(innerKeluarga.umur);
       
    }
    
}
