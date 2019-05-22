/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.util.Scanner;

/**
 *
 * @author hendy nurfriyanto
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diameter;
        int tinggi;
        
        Scanner input = new Scanner(System.in);
        NewClass lingkaran = new NewClass();

        System.out.print("masukan diameter = ");
        diameter = input.nextInt();
        
        System.out.print("volume Bola=");
        lingkaran.bola(diameter);
        
        System.out.print("Masukan nilai tinggi : ");
        tinggi = input.nextInt();
        
        System.out.print("volume tabung=");
        lingkaran.tabung(tinggi, diameter);
        
        System.out.print("volume kerucut= ");
        lingkaran.kerucut(diameter);

        
       
    }
    
}
