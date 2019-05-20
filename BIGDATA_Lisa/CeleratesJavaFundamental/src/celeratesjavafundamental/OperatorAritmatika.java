/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Lisa Fita Sari
 */
public class OperatorAritmatika {
    public static void main (String[] args) {            
        int A = 1589, B = 3847201;
        int C = A + B, D = B - A, E = A * B, G = B % A;
        float F = B / A;
        System.out.println("Variabel A = " + A);
        System.out.println("Variabel B = " + B);
        System.out.println("hasil Penjumlahan (A+B) = " + C);
        System.out.println("Hasil Pengurangan (B -A) = " + D);
        System.out.println("Hasil Perkalian (A*B)= " + E);
        System.out.println("Hasil Bagi (B/A)= "+ F);
        System.out.println("Sisa Bagi (B % A)= " + G);
    }
}
