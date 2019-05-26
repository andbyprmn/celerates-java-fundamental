package com.celerates.talent;

public class Talents {    
    
    static String nik;
    String nama;
    public String alamat;
    protected int umur;
    
    // keyword 'this'
    public void namaKaryawan(String nama){
        this.nama = nama;
        System.out.println("Nama : " + this.nama);
    }
    
    public static void niKaryawan(String nik){
        nik = nik;
        System.out.println("NIK : " + nik);
    }
    
    public void alamatKaryawan(String alamat){
        this.alamat = alamat;
        System.out.println("Alamat : " + this.alamat);
    }
    
    
    // Constructor & Overloading
    public Talents() {
        System.out.println("Constructor tanpa parameter");
    }
    
    public Talents(String message) {  // using String
        System.out.println("message");
    }
    
    public Talents(int x) {  // using int
        System.out.println(8);
    }
    
}
