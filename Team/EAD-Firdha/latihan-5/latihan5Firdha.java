package Celerates_Java_Fundamental;

import java.util.Scanner;

public class latihan5Firdha {

    public static void main(String[] args) {

        //Program Menghitung Volume Bola
        System.out.println("---------------Program Menghitung Volume Bola------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("\nMasukan nilai diameter : ");
        double diameter = input.nextDouble();

        System.out.println("\nHasil Penghitungan Volume Bola : ");
        HitungVolume volBola = new HitungVolume();
        volBola.bola(diameter);

        //Program Menghitung Volume Tabung
        System.out.println("\n\n---------------Program Menghitung Volume Tabung------------------");

        //Input Nilai Diameter
        Scanner input1 = new Scanner(System.in);
        System.out.println("\nMasukan nilai diameter : ");
        double diameter1 = input1.nextDouble();

        //Input Nilai Tinggi
        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukan nilai tinggi : ");
        double tinggi = input2.nextDouble();

        System.out.println("\nHasil Penghitungan Volume Tabung : ");
        HitungVolume volTabung = new HitungVolume();
        volTabung.tabung(tinggi, diameter1);

        //Program Menghitung Volume Kerucut
        System.out.println("\n\n---------------Program Menghitung Volume Kerucut------------------");

        //Input Nilai Diameter
        Scanner input3 = new Scanner(System.in);
        System.out.println("\nMasukan nilai diameter : ");
        double diameter2 = input3.nextDouble();

        //Input Nilai Tinggi
        Scanner input4 = new Scanner(System.in);
        System.out.println("Masukan nilai tinggi : ");
        double tinggi1 = input4.nextDouble();

        System.out.println("\nHasil Penghitungan Volume Kerucut : ");
        HitungVolume volKerucut = new HitungVolume();
        volKerucut.kerucut(tinggi1, diameter2);
    }
}
