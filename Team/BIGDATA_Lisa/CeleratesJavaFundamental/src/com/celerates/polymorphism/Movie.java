/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.polymorphism;

/**
 *
 * @author Lisa Fita Sari
 */
public class Movie {
    private String judul;
    private int tahun;
    
    public void negara(){
        System.out.println("default");
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
