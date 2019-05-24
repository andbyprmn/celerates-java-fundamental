/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author hendy nurfriyanto
 */
import java.util.Scanner;

public class Soal1 {
      public static void main(String[] args){

        int array[], j, x;
    array = new int[100];
    float rata, total=0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan berapa angka ");
    x = scan.nextInt();
    for(j = 1; j <= x; j++){
      System.out.print("Nilai "+ j +" : ");
      array[j] = scan.nextInt();
      total = total + array[j];
    }
    rata = total/x;
    System.out.println("Totalnya adalah : " + total);
    System.out.println("rata-ratanya adalah : " + rata);
    
    }
}
