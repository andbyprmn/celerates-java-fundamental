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
public class AverageOfNumbers {
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        
        // soal ke-1
        System.out.println("Input 1st number: ");
        int numb1 = in.nextInt();
        
        System.out.println("Input 2nd number: ");
        int numb2 = in.nextInt();
        
        System.out.println("Input 3rd number: ");
        int numb3 = in.nextInt();
        
        System.out.println("Average of these three numbers is: " +
                (numb1 + numb2 + numb3) / 3);
        
         // Soal ke-2
        System.out.println("Soal ke-2 : Menghitung gaji bersih");
        System.out.print("Besaran gaji kotor: ");
       
        int gajiKotor = in.nextInt();
        System.out.println("Gaji Bersih: " + (gajiKotor - (gajiKotor * 0.1)));
    }
}
