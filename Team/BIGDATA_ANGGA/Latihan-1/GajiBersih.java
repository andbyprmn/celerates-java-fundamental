/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;
/**
 *
 * @author AnggaFMP
 */
public class GajiBersih {
    
    public static void main (String[]args){
        
        System.out.println("Input: ");
        Scanner s = new Scanner (System.in);
        int gajikotor = s.nextInt();
        
        Double potongan = 0.1*gajikotor;
        Double gajibersih = gajikotor - potongan;
        
        System.out.println(gajibersih);
     
    }
    
}
