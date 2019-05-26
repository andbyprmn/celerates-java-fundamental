package com.celerates.latihan5_oop;

import java.util.Scanner;


public class Latihan5 {
    
    public static void main(String[] args) {
        
        int diameter; 
        int tinggi; 
        
        
        
        
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan nilai diameter: ");
        diameter = masukan.nextInt();
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan nilai tinggi: ");
        tinggi = inputan.nextInt();
        
        System.out.println();
        PopulateObjek volumeBola = new PopulateObjek();
        System.out.println("Volume bola adalah: "  );
        volumeBola.hitungVolumBola(diameter);
       
        System.out.println();
        System.out.println("Volume kerucut adalah: ");
        PopulateObjek volumeKerucut = new PopulateObjek();
        volumeKerucut.hitungVolumKerucut(diameter, tinggi);
        
        System.out.println();
        System.out.println("Volume tabung adalah: ");
        PopulateObjek volumeTabung = new PopulateObjek();
        volumeTabung.hitungVolumeTabung(diameter, tinggi);
        
    }
    
}
