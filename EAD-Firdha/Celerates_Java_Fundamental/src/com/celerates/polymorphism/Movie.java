
package com.celerates.polymorphism;

public class Movie {
    String judul;
    int tahun;

    public void negara() {
        System.out.println("Default");
    }    
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    
}
