
package com.celerates.polymormain;

import com.celerates.polymor.Informasi;
import com.celerates.polymor.avenger;
import com.celerates.polymor.movie;


public class polymormain {


    public static void main(String[] args) {
      //inheritance
       avenger objAve = new avenger();
        
       //polymor
        movie objmovie = new avenger();
        objmovie.negara();
        
        
        //Object as parameter
        movie objmovieinfo = new movie();
        Informasi objinfo = new Informasi();
        objinfo.info(objmovieinfo);

        
    }
    
}
