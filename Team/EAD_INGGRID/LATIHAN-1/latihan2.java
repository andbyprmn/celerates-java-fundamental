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
public class latihan2 {
    public static void main(String[] args){
        System.out.println("PROGRAM PERHITUNGAN GAJI");
        
        int gajib, gajik, pot, paj;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan gaji kotor anda = ");
        gajik = input.nextInt();
        
        pot = (gajik*10)/100;
        gajib = gajik-pot;
        
        System.out.println("\nGaji bersih yang anda terima sebesar = Rp " + gajib + ",-");
    }
}
