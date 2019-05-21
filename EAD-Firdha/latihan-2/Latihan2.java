/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celerates_Java_Fundamental;
import java.util.Scanner;  // Import the Scanner class

public class Latihan2 {
    public static void main(String[] args) {
        //Menghitung pendapatan salesman
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Masukan hasil penjualan hari ini : ");

        double pendapatan = 0;
        
        int sales = myObj.nextInt();  // Read user input
        
        if (sales == 2000000) {
            pendapatan = 100000 + 0.1*sales;
        }
        else if (sales <= 5000000 && sales > 2000000) {
            pendapatan = 200000 + 0.15*sales;
        }
        else if (sales > 5000000) {
            pendapatan = 300000 + 0.2*sales;
        }
        else {
            System.out.println("semangat untuk menaikan penjualan!");
        }
        
        System.out.println("Pendapatan Anda hari ini : " + pendapatan);
    }
}
