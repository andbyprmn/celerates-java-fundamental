
package com.celerates.polymorphism;

public class Informasi extends Movie {
    
    //objek bisa dijadikan parameter
    public void info (Movie m) {
        m.setJudul("Avengers End Game");
        m.setTahun(2019);
        System.out.println(m.getJudul());
        System.out.println(m.getTahun());
    }
}
