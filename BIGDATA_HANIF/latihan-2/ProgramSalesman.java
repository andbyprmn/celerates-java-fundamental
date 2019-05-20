/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author Muhammad Hanif
 */
public class ProgramSalesman {
    public static void main(String[] args) {
        
        System.out.print("Input penjualan: Rp ");
        Scanner s = new Scanner (System.in);
        int sales = s.nextInt();
        
        if (sales > 5000000){
            double komisi = 0.2*sales;
            double total = (sales + 300000 + komisi);
            System.out.print("Pendapatan: Rp " + total + "\n");
        }
        
        else if (sales > 2000000){
            double komisi = 0.15*sales;
            double total = (sales + 200000 + komisi);
            System.out.print("Pendapatan: Rp " + total + "\n");
        }
        else if (sales == 2000000){
            double komisi = 0.10*sales;
            double total = (sales + 100000 + komisi);
            System.out.print("Pendapatan: Rp " + total + "\n");
        }
        else{
            System.out.print("Pendapatan: Rp " + sales + "\n");
        }
    }
    
}
