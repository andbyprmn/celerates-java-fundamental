/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celerates_Java_Fundamental;
import java.util.Scanner;  // Import the Scanner class

public class Latihan1 {
     public static void main(String[] args) {
          /*No 1
        program untuk menghitung nilai rata2 dari tiga angka berikut ini 30, 30, 60.
        */
       
        int values[] = { 30, 30, 60};

        int sum = 0;
        for (int i = 0; i < values.length; i++)
        sum += values[i];

        double average = ((double) sum) / values.length;
        
        System.out.println("Rata-rata dari nilai tersebut : " + average);
        
        
        /*No 2
        program untuk menghitung gaji bersih setelah dipotong pajak 10%
        */
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Masukan gaji kotor : ");

        int gajiKotor = myObj.nextInt();  // Read user input
        
        double potongan = gajiKotor * 0.1;
        double gajiBersih = gajiKotor - potongan;
        
         System.out.println("Gaji Bersih : " + gajiBersih);
       
        
     }
}
