/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;
import java.util.Scanner;

/**
 *
 * @author AnggaFMP
 */
public class HasilHitungVolumeBangun {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        
  
        System.out.print("Diameter: ");
        double diameter = s.nextDouble();
        System.out.print("Tinggi: ");
        double tinggi = s.nextDouble();
        
        
        HitungVolumeBangun lingkaran = new HitungVolumeBangun();
        lingkaran.hitungLuasLingkaran(diameter);
        lingkaran.hitungVolumeTabung(diameter, tinggi);
        lingkaran.hitungVolumeKerucut(diameter, tinggi);
        lingkaran.hitungVolumeBola(diameter);
        
        
    
    }

}
    

