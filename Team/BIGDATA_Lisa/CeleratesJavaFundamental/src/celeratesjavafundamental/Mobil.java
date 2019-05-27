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
public class Mobil {
    String merkMobil = "Toyota";
    String warnaMobil;
    String tipeMobil;
    int maxSpeed;
    String rangkaMobil;
    
    //method procedure
    void nyalakanMesin(String nyalaDariObjek){
        System.out.println("Nyalaka mesin!");
    }
    
    void matikanMesin(){
        System.out.println("Mesin mati");
    }
    
    //method function
    int kecepatanMobil(){
//        if(maxSpeed==10) return 40;
//        else 
            return 70;
    }
    
    int jarak = 90;
    int kecepatan = 60;
    int waktu = 3600;
    
    int jarakTempuh(){
        int hitungJarak = kecepatan * waktu;
        return hitungJarak;
    }
    
    int waktuTempuh(){
        int hitungWaktu = jarak / kecepatan ;
        return hitungWaktu;
    }
    
    int jarakTempuh2(int kecepatan2, int waktu2){
        int hitungJarak2 = kecepatan2 * waktu2;
        return hitungJarak2;
    }
    
}
