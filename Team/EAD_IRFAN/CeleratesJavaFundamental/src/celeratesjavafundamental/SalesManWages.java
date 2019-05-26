/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;
import java.util.Scanner;

/**
 *
 * @author Mirfangg
 */
public class SalesManWages {
    public static void main(String[] args) {
      Scanner myScan = new Scanner(System.in);
      System.out.println("Pendapatan penjualan hari ini : ");
      
      double revenue = 0;
      int sales = myScan.nextInt(); 
      
      if (sales == 2000000) {
          revenue = 100000 + 0.1 * sales;
      }else if (sales <= 5000000 && sales > 2000000) {
          revenue = 2000000 + 0.15 * sales;
      }else if (sales > 5000000) {
          revenue = 3000000 + 0.2 * sales;
      }else {  
          System.out.println("Good luck!");
      }
      
      System.out.println("Pendapatan hari ini : " + revenue);
    }
}
