/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author Hafidh Adhi
 */


public class CeleratesJavaFundamental {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hellow World");
        Mobil mobilKu = new Mobil();
        mobilKu.merkMobil = "Honda";
        mobilKu.rangkaMobil = "88987";
        
        String merkMobil = mobilKu.merkMobil;
        String rangkaMobil = mobilKu.rangkaMobil;
        
        int rangkaMobil1 = Integer.valueOf(rangkaMobil);
        int rangkaMobil2 = new Integer(rangkaMobil);
        int rangkaMobil3 = Integer.parseInt(rangkaMobil);
        
        System.out.println(merkMobil + " " + mobilKu.rangkaMobil +
                " " + rangkaMobil1 + " " + rangkaMobil2 + 
                " " + rangkaMobil3);
        
        //memanggil method procudure pada objek mobil
        String nyala = "Nyalakan Mesin";
        mobilKu.nyalakanMesin(nyala);
        mobilKu.matikanMesin();
        
        //memanggil method function pada objek mobil
        //mobilKu.maxSpeed = 10;
        int jarak = 90;
        int kecepatan = 60;
        int waktu = 3600;
        
        System.out.println(mobilKu.kecepatanMobil());
        System.out.println("Jarak Tempuh Mobil: " + mobilKu.jarakTempuh(60, 3600));
        System.out.println("Waktu Tempuh Mobil: " + mobilKu.waktuTempuh(90, 60));
    }
    
}
