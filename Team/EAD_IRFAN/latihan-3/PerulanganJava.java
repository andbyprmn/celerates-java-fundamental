/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Mirfangg
 */
public class PerulanganJava {
    public static void main(String[] args) {
        // For Loop
        System.out.println("----For Loop----");
        for (int f = 1; f <=10; f++) {
            System.out.println("Anak ke-" + f);
        }
        
        // Calculation using For Loop        
        int jml = 1;
        for (int i = 1; i <= 10; i++){
        jml += i; }
          System.out.println("For Loop Result : "+ jml + "\n");
        
          
        // While Loop
        System.out.println("----While Loop----");
        int x = 1, o = 0;
        while (x <= 10) {
            System.out.println("Mobil ke-" + x);
            o += x;
            x++;
        }
        
        // Calculation using While Loop
        System.out.println("While Loop Result : " + o + "\n");
        
        // Do While Loop
        System.out.println("----Do While Loop----");
        int y = 1, k = 0;
        do {
            System.out.println("Motor ke-" + y);
            k += y;
            y++;
        }
        while (y <= 10);
        
        // Calculation using Do While Loop
        System.out.println("Do While Loop Result : " + k);
    }
}
