
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Hanif
 */
public class latihan5 {

    /**
     * @param args the command line arguments
     */
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
