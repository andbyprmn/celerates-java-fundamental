/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.polymorphism;

/**
 *
 * @author ACER
 */
public class Informasi extends Movie{
    public void info(Movie m){
        m.setJudul("Avenger Infinity War");
        m.setTahun(2018);
        System.out.println(m.getJudul());
         System.out.println(m.getTahun());
    }
}
