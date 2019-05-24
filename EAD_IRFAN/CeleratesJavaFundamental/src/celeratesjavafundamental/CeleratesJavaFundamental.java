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
public class CeleratesJavaFundamental {
    
    public static void main(String[] args) {
      
        Mobil objMobil = new Mobil();
        String merkMobil = objMobil.merkMobil;
        String warnaMobil = objMobil.warnaMobil;
        String tipeMobil = objMobil.tipeMobil;
        
        System.out.println("Brand : " + merkMobil + "\n" 
                + "Color : " + warnaMobil + "\n"
                + "Type : " + tipeMobil + "\n");
        
        // method procedure
        String start = "On";
        objMobil.startEngine(start);
        
        String stop = "Off";
        objMobil.stopEngine(stop);
        
        // method function
        int carSpeed = objMobil.carSpeed();
        System.out.println(objMobil.carSpeed() + " Km/h");
        
        System.out.println("Jarak tempuh = " + objMobil.jarakTempuh(60, 3600));
        System.out.println("Jarak tempuh = " + objMobil.waktuTempuh(1, 2));
        
    }
    
}
