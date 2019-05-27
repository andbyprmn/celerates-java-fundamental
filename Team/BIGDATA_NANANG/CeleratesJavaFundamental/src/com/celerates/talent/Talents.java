package com.celerates.talent;

/**
 *
 * @author Nanang
 */
public class Talents {
    protected static String nik;
    String nama;
    public String alamat;
    protected int umur;
    
    //keyword 'this'
     public void namaku(String nama){
        this.nama=nama;
        System.out.println(this.nama);
    }
     
    public static void niKaryawan(String nik){
        nik=nik;
        System.out.println(nik);
    }
    
    public void alamatku (String alamat){
        this.alamat=alamat;
        System.out.println(this.alamat);
        
        umur = 23;
        
    }
    
    //Constructor @ overloading
    public Talents(){
        System.out.println("Constructor tanpa parameter");
    }

    public Talents (String message){
        System.out.println(message);
    }
    
}

