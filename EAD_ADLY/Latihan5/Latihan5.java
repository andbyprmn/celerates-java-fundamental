package latihan5;

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
        System.out.println("Berapakah volume bola: "  );
        volumeBola.hitungVolumBola(diameter);
       
        System.out.println();
        System.out.println("Berapakah volume kerucut: ");
        PopulateObjek volumeKerucut = new PopulateObjek();
        volumeKerucut.hitungVolumKerucut(diameter, tinggi);
        
        System.out.println();
        System.out.println("Berapakah volume Tabung: ");
        PopulateObjek volumeTabung = new PopulateObjek();
        volumeTabung.hitungVolumeTabung(diameter, tinggi);
        
    }
    
}
