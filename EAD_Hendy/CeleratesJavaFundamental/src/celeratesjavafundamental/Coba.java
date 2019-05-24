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
public class Coba {
    public static void main(String[] args) {
        // TODO code application logic here
       String full_name, name, last;


        // mebuat scanner baru
        Scanner baca = new Scanner(System.in);

        // Input
        System.out.println("Biodata");
        System.out.print("Nama 1st : ");
        name = baca.next();
        System.out.print("Name 2nd: ");
        last = baca.next();

        // proses
        full_name = name + last;

        // output
        System.out.println("Nama saya aslinya = "+ full_name);
    }
    
}
