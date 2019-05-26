
package com.celerates.polymorphismmain;

import com.celerates.polymorphism.Avengers;
import com.celerates.polymorphism.Informasi;
import com.celerates.polymorphism.Movie;

/**
 *
 * @author Inggrid
 */
public class PolymorphismMain {

  
    public static void main(String[] args) {
        //inheritance
        Avengers objAvgr = new Avengers();
        
        //polimorfik
        Movie objMov = new Avengers();
        objMov.negara();
        
        //object as a parameter
        Movie objMovInf = new Movie();
        Informasi objInf = new Informasi();
        objInf.info(objMovInf);
    }
    
}
