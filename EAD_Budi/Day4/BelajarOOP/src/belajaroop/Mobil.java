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
public class Mobil {
    String merkMobil ="Toyota";
    String warnaMobil="biru";
    String tipeMobil="inova";
    int maxSpeed=1000;
    String rangkaMobil="terpecah belah";

    
    //method procedure
    void nyalakanMesin(){
        System.out.print("Hello, sir what can I help?");
             
    }

    void matikanMesin() {
        System.out.print("mesin K.O");

    }

    int kecepatanMobil() {
        if(maxSpeed<1000)return 40;
        
            return maxSpeed;
    }
    
    int jarakTempuh(int jarak, int kecepatan){
        int hitungJarak = jarak*kecepatan;
        return hitungJarak;
    }
    
    int waktuTempuh(int jarak, int kecepatan){
        int hitungWaktu = jarak/kecepatan;
        return hitungWaktu;
    }
    
    
}
