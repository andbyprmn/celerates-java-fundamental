package latihan5;

import celeratesjavafundamental.PopulateObjek;
import java.util.Scanner;

public class Latihan5 {
    
    public static void main(String[] args) {
        int diameter;
        
        Scanner nilaiDiameter = new Scanner(System.in);
        System.out.println("masukan nilai diameter lingkaran = ");
        diameter = nilaiDiameter.nextInt();
        
        
        PopulateObjek volume;
        volume = new PopulateObjek();
        
        double volTabung = volume.volumeTabung(diameter);
        System.out.println("Volume Tabung = " + volume.volumeTabung(diameter));
        
        double volBola = volume.volumeBola(diameter);
        System.out.println("Volume Bola= " + volume.volumeBola(diameter));
        
        double volKerucut = volume.volumeKerucut(diameter);
        System.out.println("Volume Kerucut = " + volume.volumeKerucut(diameter));
        
    }
    
}
