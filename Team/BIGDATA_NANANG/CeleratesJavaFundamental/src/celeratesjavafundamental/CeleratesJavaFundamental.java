/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Nanang
 */
public class CeleratesJavaFundamental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // disebut objek 
        Mobil namaObjek = new Mobil();
        namaObjek.rangkaMobil = "123456";
        namaObjek.warnaMobil = "Merah";
        String rangkaMobil = namaObjek.rangkaMobil;
        int rangkaMobilInt = new Integer (rangkaMobil);
        
        System.out.println(rangkaMobil+" "+namaObjek.warnaMobil);
        
        //memanggil method procedure pada objek mobil
        String cepat ="Injak Gas";
        namaObjek.injakGas(cepat);
        
        namaObjek.injakRem();
    
        int kecepatanMobil = namaObjek.kecepatanMobil();
        System.out.println(namaObjek.kecepatanMobil());
        
        System.out.println("jarak tempuh = "+ namaObjek.jarakTempuh(60,3600));
        System.out.println("waktu tempuh = "+ namaObjek.waktuTempuh(1,2));
        
    }
}
