import java.util.Scanner;

public class PopulateObjek {

    //fungsi
    public double luasLingkaran(int diameter){
        int jari2 = diameter/2;
        double luas = Math.PI*Math.pow(jari2, 2);
        return luas;
    }

    // menghitung volume tabung dalam satuan cm^3
    public double volumeTabung(int diameter, int tinggi) {
        int radius = diameter/2;
        double volume = Math.PI*Math.pow(radius, 2)*tinggi;
        return volume;
    }

    // menghitung volume kerucut dalam satuan cm^3
    public double volumeKerucut(int diameter, int tinggi) {
        int radius = diameter/2;
        double volume = 1f/3f*Math.PI*Math.pow(radius, 2)*tinggi;
        return volume;
    }

    // menghitung volume bola dalam satuan cm^3
    public double volumeBola(int diameter) {
        int radius = diameter/2;
        double volume = 4f/3f*Math.PI*Math.pow(radius, 3);
        return volume;
    }

    //procedure
    public void hitungLuasLingkaran(int jari2){
        double luas = Math.PI*Math.pow(jari2, 2);
        System.out.println(luas);
    }

}
