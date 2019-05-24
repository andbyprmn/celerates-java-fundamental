/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celerates_Java_Fundamental;

public class PerulanganJava {
    public static void main(String[] args) {
        //Perulangan menggunakan for
        //Menampilkan urutan angka
        System.out.println("Urutan angka dengan for:"); 
        for (int i=1; i<11; i++) {
           System.out.println(i);
        }
        
        //Menampilkan hasil penjumlahan angka
        int jml = 0;
        System.out.println("Hasil penjumlahan angka dengan for:"); 
         for (int i=1; i<11; i++) {
              jml += i;
         }
        System.out.println(jml);
        
         
        //Perulangan menggunakan while
         //Menampilkan urutan angka
        int i = 1;
        System.out.println("Urutan angka dengan while:"); 
        while (i < 11) {
            System.out.println(i);
            i++;
        }
        
        //Menampilkan hasil penjumlahan angka
        int jml_while = 0;
        i = 1;
        System.out.println("Hasil penjumlahan angka dengan while:"); 
        while (i < 11) {
            jml_while += i;
            i++;
        }
        System.out.println(jml_while);
        
        
        //Perulangan menggunakan do while
         //Menampilkan urutan angka
        i = 1;
        System.out.println("Urutan angka dengan do while:"); 
        do {
            System.out.println(i);
            i++;
        }
        while (i < 11);
        
        
        //Menampilkan hasil penjumlahan angka
        i = 1;
        int jml_do = 0;
        System.out.println("Hasil penjumlahan angka dengan do while:"); 
        do {
            jml_do += i;
            i++;
        }
        while (i<11);
        System.out.println(jml_do);
        
        
        //Perulangan menggunakan for each
         //Menampilkan urutan angka
         int [] tenArray = {1,2,3,4,5,6,7,8,9,10};
         System.out.println("Urutan angka dengan for each:"); 
         for (int cetakArray : tenArray) {
             System.out.println(cetakArray);
         }
        
         //Menampilkan hasil penjumlahan angka
        int jml_for = 0;
        System.out.println("Hasil penjumlahan angka dengan for each :"); 
         for (int cetakArray : tenArray) {
             jml_for += cetakArray;
         }
         System.out.println(jml_for);

    }
}
