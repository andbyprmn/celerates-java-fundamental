/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Muhammad Hanif
 */
public class oop_mobil {
    String  merkMobil;
    String warnaMobil;
    String tipeMobil;
    int maxSpeed = 5;
    String nomorRangka;
    
    // method procedure
    void engineOn(String parameterOn){
        System.out.println(parameterOn + " Mesin menyala");
    }
    
    void engineOff(){
        System.out.println("mesin mati");
    }
    
    //method function
    int speed(){
        if(maxSpeed >= 10) return 70;
        return 40;
    }
    
//    int jarak = 90;
//    int kecepatan = 60;
//    int waktu = 3600;
    
    int jarakTempuh(int kecepatan, int waktu){
        int hitungJarak = kecepatan*waktu/60;
        
        return hitungJarak;
    }
    
    double waktuTempuh(double jarak, double kecepatan){
        double hitungWaktu = jarak/kecepatan;
        
        return hitungWaktu;
    }
    
    
}
