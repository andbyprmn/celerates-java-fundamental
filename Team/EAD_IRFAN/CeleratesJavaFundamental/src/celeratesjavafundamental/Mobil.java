/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Mirfangg
 */
public class Mobil {
    
    // Attributes
    String merkMobil = "Rolls Royce"; 
    String warnaMobil = "Black";
    String tipeMobil = "SUV";
    int maxSpeed = 100;
    String rangkaMobil = "256497";
  
    // method procedure
    void startEngine(String startFromObject) {
        System.out.println("Turn " + startFromObject);
    }
    
    void stopEngine(String stopFromObject) {
        System.out.println("Turn " + stopFromObject);
    }
    
    // method function
    int carSpeed() {
        if(maxSpeed==10) 
            return 80;
        return maxSpeed;
    }
    
    int jarak = 90;
    int kecepatan = 60;
    int waktu = 3600;
    
    int jarakTempuh(int kecepatan, int waktu) {
        
        int hitungJarak = kecepatan*waktu/60;
        
        return hitungJarak;
    }
    
    int waktuTempuh(int jarak, int kecepatan) {
        jarak = 90;
        kecepatan = 60;
        int hitungWaktu = jarak/kecepatan;
        
        return hitungWaktu;
    }
    
}
