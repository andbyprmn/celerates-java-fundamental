
package com.celerates.polymorphismmain;

import com.celerates.polymorphism.Avengers;
import com.celerates.polymorphism.Informasi;
import com.celerates.polymorphism.Movie;

public class PolymorphismMain {

    public static void main(String[] args) {
        
        //inheritance
        Avengers objAvengers = new Avengers();
        
        //polymorphism suatu objek bisa jadi parameter, bisa jadi anak, bisa jadi parrent
        Movie objMovie = new Avengers();
        objMovie.negara();
        
    
        Movie objMovieInfo = new Movie();
        Informasi objInfo = new Informasi();
        objInfo.info(objMovieInfo);
    }
    
}
