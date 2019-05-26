/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;
import java.util.Scanner;
/**
 *
 * @author Inggrid
 */
public class latihanifelse {
    public static void main(String[] args){
        System.out.println("PROGRAM PERHITUNGAN GAJI SALESMAN PERHARI\n");
        
        Scanner input = new Scanner(System.in);
        
        int hasiljual, komisi, a, b, c; 
        
        System.out.println("Masukan hasil penjualan hari ini = ");
        hasiljual = input.nextInt();
        
        if (hasiljual <= 2000000){
            komisi = (hasiljual*10)/100;
            a = komisi+100000;
            System.out.println("\nGaji anda hari ini adalah = Rp " + a + ",-");
        }else if (hasiljual>2000000 & hasiljual <= 5000000){
            komisi = (hasiljual*15)/100;
            b = komisi+200000;
            System.out.println("\nGaji anda hari ini adalah = Rp " + b + ",-");
        }else if (hasiljual>5000000){
            komisi = (hasiljual*20)/100;
            c = komisi+300000;
            System.out.println("\nGaji anda hari ini adalah = Rp " +c + ",-");
        }
    }
}
