/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.belajaroop;

/**
 *
 * @author Admin
 */
public class CeleratesJavaFundamental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // membuat object instance sebagai berikut 
        mobil namaObjek = new mobil();
        
        //namaObjek.rangkaMobil = "AE8992993993993933";
        String merkMobil = namaObjek.merkMobil;
       // String rangkaMobil = namaObjek.rangkaMobil;
        
        System.out.println(merkMobil +" " +" rangka: " +namaObjek.rangkaMobil);
       
       //Memanggil method procedure pada object mobil
       //namaObjek.nyalakanMesin();
       //namaObjek.matikanMesin();
       
       String nyala = "nyalakan mesin";
       namaObjek.nyalakanMesin(nyala);
       
       String mati = "matikan mesin";
       namaObjek.matikanMesin(mati);
       //atau bisa juga dengan 
       //int jarakTempuh = namaObjek.jarakTempuh();
       //int waktuTempuh = namaObjek.waktuTempuh();
       
       int kecepatanMobil = namaObjek.kecepatanMobil();
       System.out.println(kecepatanMobil);
       System.out.println();
       System.out.println(namaObjek.jarakTempuh());
       System.out.println(namaObjek.waktuTempuh());
       
    }
    
}
