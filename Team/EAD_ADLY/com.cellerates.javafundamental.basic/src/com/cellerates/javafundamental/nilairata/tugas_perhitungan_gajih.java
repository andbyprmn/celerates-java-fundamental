/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.nilairata;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class tugas_perhitungan_gajih {
    public static void main(String[] args){
   
        int gajihkotor, gajihbersih, pajak;
        int potongan;
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukan gajih kotor");
        gajihkotor = masukan.nextInt();
        
        potongan = (10 * gajihkotor)/100;
        gajihbersih = gajihkotor - potongan; 
        
        System.out.println();
        System.out.println("Jadi gajih bersih yang diterima adalah : " + gajihbersih);
    
    }
}
