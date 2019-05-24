/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Lisa Fita Sari
 */
public class CeleratesJavaFundamental {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil namaObjek = new Mobil();
        namaObjek.merkMobil = "Honda";
        namaObjek.warnaMobil = "Putih";
        
        String merkMobil = namaObjek.merkMobil;
        String warnaMobil = namaObjek.warnaMobil;
        
        System.out.println(merkMobil);
        System.out.println(warnaMobil);
        
        //memanggil method procedure pada objek mobil
        String nyala = "Nyalakan mesin!";
        namaObjek.nyalakanMesin(nyala);
        namaObjek.matikanMesin();
        
        //memanggil method function pada objek mobil
        int kecepatanMobil = namaObjek.kecepatanMobil();
        System.out.println(kecepatanMobil);
        
        System.out.println("jarak tempuh = " + namaObjek.jarakTempuh());
        System.out.println("kecepatan mobil = " + namaObjek.kecepatanMobil());
       
//        int jarak2 = 90;
//        int kecepatan2 = 60;
//        int waktu2 = 3600;
        
        System.out.println("jarak tempuh = " + namaObjek.jarakTempuh2(60, 3600));
//        System.out.println("kecepatan mobil = " + namaObjek.kecepatanMobil2(90, 60));
    
    }
  }


