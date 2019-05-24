/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;
import java.util.Scanner;  // Import the Scanner class
/**
 *
 * @author Nanang
 */
public class Latihan2 {
     public static void main(String[] args) {
    System.out.println("============Penjualan============");     
         System.out.println("Masukkan besarnya penjualan: ");
         Scanner sal = new Scanner(System.in);
         int sales = sal.nextInt();
         
         double penghasilan=0;
         
     if (sales==2000000)  {
         penghasilan = 100000 + (0.1*sales);
     }
     else if (sales>2000000 && sales<=5000000){
         penghasilan = 200000 + (0.15*sales);
     }
     else if (sales>5000000) {
          penghasilan = 300000 + (0.2*sales);
     }
     else{
         System.out.println("Tingkatkan penjualan");
     }
     
     System.out.println("Penghasilan hari ini :" + penghasilan);
}
}