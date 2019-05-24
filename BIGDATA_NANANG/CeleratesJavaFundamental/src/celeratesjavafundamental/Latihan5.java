package celeratesjavafundamental;
import java.util.Scanner;

public class Latihan5 {
    
    public static void main(String[] args) {
        HitungVolume lingkaran = new HitungVolume();
        System.out.print("Luas Lingkaran :");
        System.out.println(lingkaran.luasLingkaran(20));
      
        System.out.println();
        System.out.println("======Menghitung Volume Bangun Ruang======");
        
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Diameter: "); 
        double diameter = s.nextDouble();
        System.out.print("Masukkan Tinggi: "); 
        double tinggi = s.nextDouble();
        System.out.println("");
        
        System.out.print("Volume Bola :");
        lingkaran.hitungVolumeBola(diameter);
        
        System.out.print("Volume Tabung :");
        lingkaran.hitungVolumeTabung(diameter,tinggi);
        
        System.out.print("Volume Kerucut :");
        lingkaran.hitungVolumeKerucut(diameter,tinggi);
    }
    

}


    
