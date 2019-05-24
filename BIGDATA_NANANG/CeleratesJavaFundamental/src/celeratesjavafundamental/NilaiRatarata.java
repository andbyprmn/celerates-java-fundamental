
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
public class NilaiRatarata {
    public static void main(String[] args) {
        // Menghitung Rata-Rata nilai
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Nilai a : ");
        // Membaca input berupa angka (Integer)
        int a = sc.nextInt();
    
        System.out.print("Nilai b : ");
        // Membaca input berupa angka (Integer)
        int b = sc.nextInt();
    
        System.out.print("Nilai c : ");
        // Membaca input berupa angka (Integer)
        int c = sc.nextInt();
    
        double jawab = (a + b + c) / 3.0;
        System.out.println("Rata-Rata : " + jawab);
    }
}
