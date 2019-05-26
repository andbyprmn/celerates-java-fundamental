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
public class Mobil {
    //Attribute
    String merkMobil = "Toyota";
    String warnaMobil;
    String tipeMobil;
    int maxSpeed = 80 ;
    String rangkaMobil;
   
    //method procedure
    void injakGas(String cepatDariObjek){
        System.out.println(cepatDariObjek);
    }
    
    void injakRem(){
        System.out.println("Kecepatan berkurang");
    }
    
    //method function
    int kecepatanMobil(){
       if (maxSpeed==10) return 80;
       return maxSpeed;
    }
    int jarak = 90;
    int kecepatan = 60;
    int waktu = 3600;
    
    int jarakTempuh(int kecepatan, int waktu){
        int hitungJarak = kecepatan*waktu/60;   
        return hitungJarak;
    }
    
    int waktuTempuh (int jarak, int keceptan){
        jarak = 90;
        kecepatan = 60;
        int hitungWaktu = jarak/kecepatan;
        
        return hitungWaktu;
    }
    }
