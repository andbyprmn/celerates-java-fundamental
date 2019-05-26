package com.celerates.overriding;

public class Anak extends Keluarga {
    
    @Override
    public void alamat() {
        System.out.println("Bandung");
    }
    
    public void alamatParent() {
        super.alamat();
    }
    
    public void kecamatanParent() {
        super.kecamatan();
    }
    
}
