/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.latihanpemantapan;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Datakaryawan {
    
    public static void main(String[] args){

        String nama, alamat;
        int usia, gajih;
        
        //membuat scanner baru 
        Scanner masukan = new Scanner (System.in);
        
        //Tampilan output ke user 
        System.out.println();
        System.out.println("nama"); 
        nama = masukan.nextLine();
        System.out.println("Alamat:");
        alamat = masukan.nextLine();
        System.out.println();
        System.out.println("Usia");
        usia = masukan.nextInt();
        System.out.println("Gajih");
        gajih = masukan.nextInt();
        
        //menampilkan semua nilai yang telah tersimpan dimasing-masing variabel
        System.out.println();
        System.out.println("Nama karyawan: " +nama);
        System.out.println("Alamat tinggal karyawan: " + alamat);
        System.out.println("Usia karyawan: " +usia);
        System.out.println("Gajih yang diterima karyawan: " +gajih);
        
        
    }
    
}
