/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author AnggaFMP
 */
public class HitungVolumeBangun {
    
   
    public void hitungLuasLingkaran(double diameter){
        double jari2 = diameter/2;
        double luasLingkaran = Math.PI*Math.pow(jari2, 2);
        System.out.println("Luas Lingkaran : " + luasLingkaran + "\n");
    }
    
    void hitungVolumeTabung(double diameter, double tinggi){
     double jari2 = diameter/2;
     double volumeTabung = Math.PI*Math.pow(jari2, 2)*tinggi;
     System.out.println("Volume Tabung : " + volumeTabung + "\n");
    
    }
    
    void hitungVolumeKerucut(double diameter, double tinggi){
        double jari2 = diameter/2;
        double volumeKerucut = (Math.PI*Math.pow(jari2, 2)*tinggi)/3;
        System.out.println("Volume Kerucut : " +volumeKerucut + "\n");
    }
    
    void hitungVolumeBola (double diameter){
        double jari2 = diameter/2;
        double volumeBola = (4*Math.PI*Math.pow(jari2, 3))/3;
        System.out.println("Volume Bola : " +volumeBola + "\n");
    }
        
}
    
   



