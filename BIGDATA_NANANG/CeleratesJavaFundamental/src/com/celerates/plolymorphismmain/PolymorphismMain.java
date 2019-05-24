package com.celerates.plolymorphismmain;
import com.celerates.polymorphism.Avengers;
import com.celerates.polymorphism.Movie;
import com.celerates.polymorphism.Informasi;

public class PolymorphismMain {

    
    public static void main(String[] args) {
      // inheritance  
      Avengers objAvengers = new Avengers();
        
     //polymorphism
      Movie objMovie = new Avengers();
      objMovie.negara();

      // objek as informasi
      Movie objMovieInfo = new Movie();      
      Informasi objInfo = new Informasi();
      objInfo.info(objMovieInfo);
      
      
    }
    
}
