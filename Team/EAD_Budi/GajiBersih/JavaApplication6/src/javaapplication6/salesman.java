/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class salesman {
    public static void main(String[] args) {
    int nilai;
        int Bon =0;
        Scanner scan = new Scanner(System.in);

    System.out.println("Total Penjualan : ");
    nilai = scan.nextInt();
    
     if ( nilai <= 2000000 ) {
            Bon = (nilai* 10/100)+100000;            
    } else if ( nilai > 2000000 && nilai < 5000000 ){
            Bon = (nilai* 15/100)+200000;
    } else if ( nilai >= 5000000 ){
             Bon = (nilai* 20/100)+300000;
    }
             
    System.out.println("pendapatan salesman : " + Bon);
    
    
    

  
   
  }

}
