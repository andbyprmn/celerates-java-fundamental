/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.polymorphismmain;

import com.celerates.polymorphism.Avengers;
import com.celerates.polymorphism.Informasi;
import com.celerates.polymorphism.Movie;

/**
 *
 * @author AnggaFMP
 */
public class Polymorphismmain {
    
    public static void main (String[]args){
         
    //inheritance
    Avengers objAvengers = new Avengers();
    
    //polymorphism
    Movie objMovie = new Avengers();
    objMovie.negara();
        
    //Object as Parameter 
    Movie objMovieInfo = new Movie();
    Informasi objInfo = new Informasi();
    objInfo.info(objMovieInfo);
    
    }
    
   
}