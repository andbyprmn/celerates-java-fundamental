package com.celerates.polymorphism;

import javax.print.DocFlavor;

public class Movie {

    public String judul;
    public int tahun;

    public void negara(){
        System.out.println("Default");
    }

    public String getJudul() { return judul; }

    public void setJudul(String judul){ this.judul = judul; }

    public int getTahun() { return tahun; }

    public void setTahun(int tahun){ this.tahun = tahun; }
}
