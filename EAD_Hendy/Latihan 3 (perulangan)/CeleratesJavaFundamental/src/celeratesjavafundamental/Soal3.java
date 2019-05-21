/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author hendy nurfriyanto
 */
public class Soal3 {
    public static void main(String[] args) {
        // deklarasi variabel dan Scanner
        int Menjual, jasa = 0, bayar, komisi = 0;
        String Belanja;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Apakah anda ingin Membeli (ya/Tidak): ");
        Belanja = scan.nextLine();
        System.out.print("Pendapatan: ");
        Menjual = scan.nextInt();

        // proses
        if (Belanja.equalsIgnoreCase("ya")) {
            if (Menjual == 2000000) {
                jasa = 100000;
                komisi = (int) (0.1*Menjual);
            } else if (Menjual > 2000000 && Menjual < 5000000 ) {
                jasa = 200000;
                komisi = (int) (0.15*Menjual);
            }else if (Menjual > 5000000) {
                jasa = 300000;
                komisi = (int) (0.2*Menjual);
            } else {
                jasa = 0;
            }
        }

        // total yang harus dibayar
        bayar = komisi+jasa;

        // output
        System.out.println("Total Pendapatan Sales: Rp " + bayar);
        }  
    }

