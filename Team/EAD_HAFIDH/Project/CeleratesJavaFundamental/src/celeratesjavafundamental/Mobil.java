/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Hafidh Adhi
 */
public class Mobil {
    String merkMobil = "Toyota";
    String warnaMobil;
    String tipeMobil;
    int maxSpeed = 10;
    String rangkaMobil;
    

    //method procedure
    void nyalakanMesin(String nyalaDariObjek) {
        System.out.println(nyalaDariObjek);
    }

    void matikanMesin() {
        System.out.println("Mesin Mati");
    }

    //method function
    int kecepatanMobil(){
        if (maxSpeed == 10)
            return 40;
        return maxSpeed;
    }
    
    int jarakTempuh(int kecepatan, int waktu){
        int hitungJarak = kecepatan * waktu / 60;
        return hitungJarak;
    }
    
    int waktuTempuh(int jarak, int kecepatan){
        int hitungWaktu = jarak / kecepatan;
        return hitungWaktu;
    }
}
