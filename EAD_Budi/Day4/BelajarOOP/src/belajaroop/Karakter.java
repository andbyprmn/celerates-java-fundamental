/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaroop;

/**
 *
 * @author ACER
 */
public class Karakter {
    public static void main(String[] args){
        Mobil namaObjek = new Mobil();
        String merkMobil =  namaObjek.merkMobil;
        System.out.print("Merek mobilnya "+ merkMobil);
        sout
                
                
                
         int kecepatanMobil = namaObjek.kecepatanMobil();
        System.out.print(namaObjek.kecepatanMobil());
        
        namaObjek.nyalakanMesin();  
        int jarak = 90;
        int waktu = 3600;
        int kecepatan = 100;
        
       
    System.out.print(namaObjek.jarakTempuh(60,3600));
    System.out.print(namaObjek.waktuTempuh(60,3600));
    }
}