
package com.celerates.polymorphism;

public class Informasi extends Movie {
    
    public void info(Movie m){
        m.setJudul("End Game");
        m.setTahun(2019);
        System.out.println(m.getJudul());
        System.out.println(m.getTahun());
    }
    
}
