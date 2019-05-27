/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Hafidh Adhi
 */
public class PerulanganJava {
    public static void main(String[] args) {
        //Deklarasi
        int[] arrayAngka = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 0;
        int total = 0;
        
        //Kode
        System.out.println("===========================================================");
        System.out.println("Hasil dengan Metode Perulangan While");
        System.out.println("===========================================================");
        while (index < 10) {            
            System.out.print(arrayAngka[index] + ", ");
            total += arrayAngka[index];
            index++;
        }
        System.out.println("Hasil Penjumlahannya: " + total + "\n\n");
        
        index = 0;
        total = 0;
        System.out.println("===========================================================");
        System.out.println("Hasil dengan Metode Perulangan Do-While");
        System.out.println("===========================================================");
        do {            
            System.out.print(arrayAngka[index] + ", ");
            total += arrayAngka[index];
            index++;
        }
        while (index < 10);
        System.out.println("Hasil Penjumlahannya: " + total + "\n\n");
        
        index = 0;
        
        total = 0;
        System.out.println("===========================================================");
        System.out.println("Hasil dengan Metode Perulangan For");
        System.out.println("===========================================================");
        for (; index < 10; index++) {
            System.out.print(arrayAngka[index] + ", ");
            total += arrayAngka[index];
        }
        System.out.println("Hasil Penjumlahannya: " + total + "\n\n");
        
        total = 0;
        System.out.println("===========================================================");
        System.out.println("Hasil dengan Metode Perulangan For Each");
        System.out.println("===========================================================");
        for (int element : arrayAngka) {
            System.out.print(element + ", ");
            total += element;
        }
        System.out.println("Hasil Penjumlahannya: " + total + "\n\n");
    }
}
