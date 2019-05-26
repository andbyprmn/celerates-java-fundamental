/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cth5;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class latihan5 {
    private static Scanner sc;
    
    public static void main(String[] args) {
        double radius, height;
		sc = new Scanner(System.in);
                System.out.println(" **************************************************************** ");
                System.out.println("Selamat Datang di Program Hitung Volume tabung,kerucut,dan bola ");
                System.out.println(" **************************************************************** ");
		System.out.println(" Masukan jari-jari lingkaran: ");
		radius = sc.nextDouble();
                System.out.println(" Masukan tinggi lingkaran: ");
		height = sc.nextDouble();
		

                PopulateObjek lingkaran = new PopulateObjek();
                lingkaran.hitungVolumeTabung(radius,height);
                lingkaran.hitungVolumeBola(radius);
                lingkaran.hitungVolumeKerucut(radius, height);
                System.out.println(" **************************************************************** ");
                System.out.println("Program hitung selesai biaya hitungnya 1 juta ");
                System.out.println(" **************************************************************** ");
	}
	
}
