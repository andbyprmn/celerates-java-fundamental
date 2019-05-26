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
public class komisisalesman {
    
    public static void main(String[] args){
        
        int jualan, komisi, pendapatan, komisi3;
    
        
        
        Scanner masukan = new Scanner(System.in);
        
       //menampilkan inputan dari hasil penjualan:
      System.out.println("Masukan jualan hari ini");
      jualan = masukan.nextInt();
      
      
      if(jualan ==  2000000){
          komisi = (jualan*10)/100;
          pendapatan = komisi + 100000; 
        System.out.println("Pendapatan sales hari ini: " +pendapatan);
        }
      else if(jualan > 2000000 & jualan<= 50000){
          komisi = (jualan*10)/100;
          pendapatan = komisi + 200000;
        System.out.println("Pendapatan sales hari ini: "+pendapatan);
        }
      else if( jualan> 5000000){
          komisi = (jualan*10)/100;
          pendapatan = komisi + 300000;
        System.out.println("Pendapatan sales hari ini: "+pendapatan);        
        }    
      else{
          komisi = (jualan*10)/100;
        System.out.println("Pendapatan sales hari ini: "+komisi);
      }
    }
}