package celeratesjavafundamental;
import java.util.Scanner;

public class Latihan5 {
    
    public static void main(String[] args) {
        PopulateObjek lingkaran = new PopulateObjek();

        Scanner input = new Scanner (System.in);
        
        int n;
        int i;
        int a, b;
        int diameter;
        int jarijari;
        int tinggi;
        
        
        System.out.println("PROGRAM PERHITUNGAN VOLUME BANGUN RUANG\n");
     
        System.out.println("Masukan diameter = ");
        a = input.nextInt();
        System.out.println("Masukan tinggi = ");
        b = input.nextInt();
        
        System.out.println("\n1. Volume Tabung ialah = " + lingkaran.voltabung(a, b));
        System.out.println("2. Volume Kerucut ialah = " + lingkaran.volkerucut(a, b));
        System.out.println("3. Volume Bola ialah = " + lingkaran.volbola(a));
      
    }
    
  }