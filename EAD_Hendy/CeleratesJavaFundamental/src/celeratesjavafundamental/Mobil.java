/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author hendy nurfriyanto
 */
public class Mobil {
    String merkmobil;
    String warna = "Black";
    String tipemobil ="Cendol";
    int maxspeed = 40;
    String rangka ="123kenyang";
    
    //method procedure
    void hidupkanmesin(String nyalaaja){
        System.out.println(nyalaaja);
    }
     
    void matikanmesin(){
        System.out.println("mesin mati");
    }
    //method function
    int kecepatan(){
    if(maxspeed<=30)
        return 50;
    else
        return 70;
    }
    
    int jarak(int kecepatan, int wak){
        int hitungjr = kecepatan*wak/60;
        
        return hitungjr;
    }
    int waktu(int jarak2, int kecepatan){
    int hitungwk = jarak2/kecepatan;
        
        return hitungwk;
    
    }
    
    
}
