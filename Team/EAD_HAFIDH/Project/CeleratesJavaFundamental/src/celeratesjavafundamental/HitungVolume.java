/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author Hafidh Adhi
 */
public class HitungVolume {
    double diameter, tinggi;
    Scanner in = new Scanner(System.in);
    
    public void bgnTabung(){
        System.out.println("\nVOLUME TABUNG");
        System.out.println("-----------------");
        System.out.print("Masukkan Diameter Tabung: ");
        diameter = in.nextDouble();
        System.out.print("Masukkan Tinggi Tabung: ");
        tinggi = in.nextDouble();
        System.out.println("Hasil: " + Math.PI*Math.pow(diameter/2, 2)*tinggi);
    }
    
    public void bgnKerucut(){
        System.out.println("\nVOLUME KERUCUT");
        System.out.println("-----------------");
        System.out.print("Masukkan Diameter Kerucut: ");
        diameter = in.nextDouble();
        System.out.print("Masukkan Tinggi Kerucut: ");
        tinggi = in.nextDouble();
        System.out.println("Hasil: " + Math.PI*Math.pow(diameter/2, 2)*tinggi/3);
    }
    
    public void bgnBola(){
        System.out.println("\nVOLUME BOLA");
        System.out.println("-----------------");
        System.out.print("Masukkan Diameter Bola: ");
        diameter = in.nextDouble();
        System.out.println("Hasil: " + Math.PI*Math.pow(diameter/2, 3)*4/3);
    }
}
