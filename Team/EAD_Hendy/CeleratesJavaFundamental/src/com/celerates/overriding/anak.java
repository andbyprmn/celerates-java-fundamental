
package com.celerates.overriding;

public class anak extends keluarga{
    
    //@overidding
    public void alamat(){
        
        System.out.println("Jakarta");
    }
    
    //keyword super untuk memanggil fungsi di parent
    public void alamatparent(){
        super.alamat();
    }
    
}
