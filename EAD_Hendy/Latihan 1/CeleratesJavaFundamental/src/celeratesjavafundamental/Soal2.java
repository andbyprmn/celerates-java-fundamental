/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author hendy nurfriyanto
 */
public class Soal2 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan=new Scanner (System.in);
       
        String nama_karyawan;
        long gapokok;

       
        System.out.print ("Nama Karyawannya adalah = ");
        nama_karyawan=masukan.next();
        System.out.print ("Gajipokonya berjumlah = Rp. ");
        gapokok=masukan.nextLong();
        long PPh=(long) (0.1*gapokok);
        long gaji_bersih=gapokok-PPh;
       
        System.out.println("PPh = 10%");
        System.out.println("PPh = Rp"+PPh);
        System.out.println("Gaji Bersih = Rp. "+gaji_bersih);
    }
    
}
