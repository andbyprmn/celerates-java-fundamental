/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;
/**
 *
 * @author Inggrid
 */
public class operatorAritmatika {
    public static void main(String[] args){
        System.out.println("PROGRAM KALKULATOR SEDERHANA");
        
        int a, b, tambah, kurang, bagi, kali, modulus;
        
        a = 20;
        b = 10;
 
        //operasi aritmatika
        tambah = a+b;
        kurang = a-b;
        kali = a*b;
        bagi = a/b;
        modulus = a%b;
        
        //menampilkan program
        System.out.println("Hasil Penjumlahan =  " + tambah);
        System.out.println("Hasil Pengurangan =  " + kurang);
        System.out.println("Hasil Perkalian = " + kali);
        System.out.println("Hasil Pembagian = " + bagi);
        System.out.println("Hasil Modulus = " + modulus);
         
    }
}
