/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.polymorphismmain;

import com.celerates.poplymorphism.Avengers;
import com.celerates.poplymorphism.Informasi;
import com.celerates.poplymorphism.Movie;

/**
 *
 * @author Muhammad Hanif
 */
public class PolymorphismMain {
    
    public static void main(String[] args) {
        //inheritance
        Avengers objAvengers = new Avengers();
        
        //polymorphism
        Movie objMovie = new Avengers();
        objMovie.negara();
        
        //object as parameter
        Movie objMovieInfo = new Movie();
        Informasi objInfo = new Informasi();
        objInfo.info(objMovieInfo);
    
    }
    
}
