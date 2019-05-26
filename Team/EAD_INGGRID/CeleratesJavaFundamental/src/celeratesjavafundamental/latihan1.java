/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author Inggrid
 */
public class latihan1 {
    public static void main(String[] args){
        System.out.println("PROGRAM PERHITUNGAN RATA-RATA");
        
        int a, b, c;
        float rerata;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Nilai Pertama = ");
        a = input.nextInt();
        System.out.println("Masukan Nilai Kedua = ");
        b = input.nextInt();
        System.out.println("Masukan Nilai Ketiga = ");
        c = input.nextInt();
        
        rerata = (a+b+c)/3;
        
        System.out.println("\nRata-rata = " + rerata);
        
        
        
    }
}