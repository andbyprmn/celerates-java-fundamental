
package com.celerates.overridingmain;

import com.celerates.overriding.anak;


public class Mainover {


    public static void main(String[] args) {
        //memanggil overriding dan keyword super
        anak objanak = new anak();
        //overriding
        objanak.alamat();
        //menggunakan super
        objanak.alamatparent();
    }
    
}
