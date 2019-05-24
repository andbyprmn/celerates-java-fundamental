package latihan5;
import java.util.Scanner;

public class PopulateObjek {
    
    //fungsi
    public double luasLingkaran(int diameter){
        int jari2 = diameter/2;
        double luas = Math.PI*Math.pow(jari2, 2);
        return luas;
    }

    // menghitung volume tabung dalam satuan cm^3
    public double volumeTabung(int diameter) {
        int radius = diameter/2;
        int t = 10;
        double volume = Math.PI*Math.pow(radius, 2)*t;
        System.out.println("Volume tabung dengan tinggi 10 cm : ");
        return volume;
    }

    //procedure
    public void hitungLuasLingkaran(int jari2){
        double luas = Math.PI*Math.pow(jari2, 2);
        System.out.println(luas);
    }

}
