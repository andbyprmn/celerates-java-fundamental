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
public class GajiBersih {
    public static void main(String[] args) {
        System.out.print("Input     : ");
        Scanner s = new Scanner(System.in);
        int gajikotor = s.nextInt();
        
        double potongan = (0.1*gajikotor);
        double gajibersih = gajikotor - potongan;
        System.out.println("Gaji Bersih : " + gajibersih);
    }
    
}
