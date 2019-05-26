
package com.celerates.polymorphismmain;

import com.celerates.polymorphism.Avanggers;
import com.celerates.polymorphism.Informasi;
import com.celerates.polymorphism.Movie;

public class PolymorphismMain {

    public static void main(String[] args) {
        //deklarasi objek baru pada inheritance atau pewarisan 
        Avanggers objAvanngers = new Avanggers();
        
        //polymorphism pada movie - avanggers
        Movie objMovie = new Avanggers();
        objMovie.negara();
        
        //Object as parameter 
        Movie objMovieInfo = new Movie();
        Informasi objInfo = new Informasi();
        objInfo.info(objMovieInfo);
        
        
        
    }
    
}
