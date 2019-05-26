
package com.celerates.polymorphism;

/**
 *
 * @author Inggrid
 */

//sebagai class parent
public class Movie {
    private String judul;
    private int tahun;

    public void negara(){
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
