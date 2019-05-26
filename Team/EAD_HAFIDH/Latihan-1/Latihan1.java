/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author Hafidh Adhi
 */
public class Latihan1 {
    public static void main(String[] args) {
        //Soal Nomor 1
        int a = 30;
        int b = 30;
        int c = 60;
        System.out.println("===================================================");
        System.out.println("Soal Pertama");
        System.out.println("===================================================");
        System.out.println("Angka Pertama: " + a);
        System.out.println("Angka Kedua: " + b);
        System.out.println("Angka Ketiga: " + c);
        System.out.println("\nRata-rata: " + (a+b+c)/3 );
        
        //Soal Nomor 2
        System.out.println("\n\n===================================================");
        System.out.println("Soal Kedua");
        System.out.println("===================================================");
        System.out.print("Masukkan Besaran Gaji Anda (tanpa RP): ");
        Scanner in = new Scanner(System.in);
        int gajiKotor = in.nextInt();
        System.out.println("Gaji Bersih Anda: " + (gajiKotor - (gajiKotor *= 0.1)) + "\n\n");
        
    }
}
