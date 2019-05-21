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
public class Latihan2 {
    public static void main(String[] args) {
        double pendapatan = 0;
        
        System.out.print("Masukkan Hasil Jual Anda (tanpa RP): ");
        Scanner in = new Scanner(System.in);
        int hasilJual = in.nextInt();
        
        if(hasilJual <= 2000000)
            pendapatan = 0.1 * hasilJual + 100000;
        else if (hasilJual <= 5000000)
            pendapatan = 0.15 * hasilJual + 200000;
        else
            pendapatan = 0.2 * hasilJual + 300000;
        
        System.out.println("Pendapatan Anda: " + (int)pendapatan + "\n\n");
        in.close();
        
    }
}
