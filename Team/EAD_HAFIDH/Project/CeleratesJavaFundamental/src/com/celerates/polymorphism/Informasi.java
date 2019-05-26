/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.polymorphism;

/**
 *
 * @author Hafidh Adhi
 */
public class Informasi extends Movie{
    
    public void info(Movie m){
        m.setJudul("Avengers End Game");
        m.setTahun(2019);
        System.out.println(m.getJudul());
        System.out.println(m.getTahun());
        System.out.println("");
    }
    
}
