package com.celerates.overriding;


public class Anak extends Keluarga {
    
    public void alamat(){
        System.out.println("Jakarta");
    }
    
    public void alamatInduk(){
        super.alamat();
    }
}
