package com.celerates.polymorphism;

public class Movie {
    private String judul;
    private int tahun;
    
    public void negara() {
        System.out.println("Default");
    }
    
    // judul
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    // tahun
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
}
