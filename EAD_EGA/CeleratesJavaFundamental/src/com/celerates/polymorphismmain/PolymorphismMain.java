package com.celerates.polymorphismmain;

import com.celerates.polymorphism.Avengers;
import com.celerates.polymorphism.Informasi;
import com.celerates.polymorphism.Movie;

public class PolymorphismMain {
    public static void main(String[] args) {
        // TODO : Inheritance
        Avengers objAvengers = new Avengers();

        // TODO : Polymorhphism
        Movie objMovie = new Avengers();
        objMovie.negara();

        Movie objMovieInfo = new Movie();
        Informasi objInfo = new Informasi();
        objInfo.info(objMovieInfo);

    }
}
