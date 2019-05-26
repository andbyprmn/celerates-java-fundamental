/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Hanif
 */
public class CeleratesJavaFundamental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       oop_mobil obj = new oop_mobil();
       String merkMobil = obj.merkMobil;
       String nomorRangka = obj.nomorRangka;
       nomorRangka = "12345";
       merkMobil = "Honda";
       System.out.println(merkMobil + nomorRangka);
       
       // memanggil method
       obj.engineOn("Honda");
       obj.engineOff();
       System.out.println(obj.speed());
       
        System.out.println("jarak tempuh: "+obj.jarakTempuh(60,3600));
        System.out.println("waktu tempuh: "+obj.waktuTempuh(126,60));
    }
  }  
