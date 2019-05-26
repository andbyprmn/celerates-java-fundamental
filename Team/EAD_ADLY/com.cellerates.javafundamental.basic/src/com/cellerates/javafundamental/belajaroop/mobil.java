package com.celerates.belajaroop;


public class mobil {
    String merkMobil = "Toyota";
    String warnaMobil;
    String tipeMobil;
    int maxSpeed = 40;
    final String rangkaMobil = "AE879872920030";
  
    //Method precodure 
    void nyalakanMesin(String nyala){
        System.out.println("mesin menyala");
    }
    
    void matikanMesin(String mati){
        System.out.println("mesin mati");
    }
    
    //method function
    int kecepatanMobil(){
        if(maxSpeed == 20) 
            return 20;
        return maxSpeed; 
    }
    
    int jarak = 90; 
    int kecepatan = 60; 
    int waktu = 3600; 
    
    
    int jarakTempuh(){
        int hitungJarak = kecepatan*waktu; 
        return hitungJarak; 
    }
    
    
    
    int waktuTempuh(){
        int hitungwaktu = jarak/kecepatan; 
        return hitungwaktu;
    }
}
