package celeratesjavafundamental;

import java.util.Scanner;


public class Latihan_5 {
    public static void main(String[] args) {
        PopulateObject lingkaran = new PopulateObject();
        lingkaran.hitungLuasLingkaran(10);
     
        
        
        Scanner x = new Scanner(System.in);
        double diameter, tinggi;
        
        System.out.println("masukan diameter : ");
        diameter = x.nextDouble();
        System.out.println("masukan tinggi : ");
        tinggi = x.nextDouble();
        
        System.out.println("Volume Tabung adalah : "); 
        lingkaran.volumeTabung(diameter, tinggi);
        
        System.out.println("Volume Bola : ");
        lingkaran.volumeBola(diameter);
        
        System.out.println("Volume Kerucut : ");
        lingkaran.volumeKerucut(diameter, tinggi);
        
        

        
        
    }
}