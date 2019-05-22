package latihan5;

import java.util.Scanner;

public class Latihan5 {
    
    public static void main(String[] args) {
        PopulateObjek lingkaran = new PopulateObjek();
        lingkaran.hitungLuasLingkaran(20);
        System.out.println(lingkaran.luasLingkaran(20)+"\n");
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Diameter: "); 
        double diameter = s.nextDouble();
        System.out.print("Tinggi: "); 
        double tinggi = s.nextDouble();
        System.out.println("");
        
        lingkaran.volumeKerucut(diameter, tinggi);
        lingkaran.volumeTabung(diameter, tinggi);
        lingkaran.volumeBola(diameter);
    }
    
}
