/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;
import java.util.Scanner;

/**
 *
 * @author Nanang
 */
public class Latihan1 {
    public static void main(String[] args) {
         // Soal 1 latihan-1: Menghitung Nilai Rata-rata
        System.out.println("Soal pertama : Menghitung nilai rata-rata");
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Nilai a : ");
        int a = sc.nextInt();
    
        System.out.print("Nilai b : ");
        int b = sc.nextInt();
    
        System.out.print("Nilai c : ");
        int c = sc.nextInt();
    
        double jawab = (a + b + c) / 3.0;
        System.out.println("Rata-Rata : " + jawab);
        
        System.out.println("===============Pindah Nomor===============");
        // Soal 2 latihan-1: Menghitung Gaji Bersih
        System.out.println("Soal kedua : Menghitung gaji bersih");
        System.out.print("Besaran gaji kotor: ");
        Scanner in = new Scanner(System.in);
        int gajiKotor = in.nextInt();
        System.out.println("Gaji Bersih: " + (gajiKotor - (gajiKotor * 0.1)));
        }
}
