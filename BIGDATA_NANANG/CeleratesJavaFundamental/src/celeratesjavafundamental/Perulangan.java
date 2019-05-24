/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Nanang
 */
public class Perulangan {
    public static void main(String[] args) {
    // Perulangan for
        System.out.println("========Perulangan For =======");
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
        
        System.out.println("========Perulangan For Contoh 2 =======");
          // Perulangan for contoh 2
        for (int i=0; i<5; i++){
            System.out.println(i);
      
        }
        
        System.out.println("======== Perulangan While =======");
        // Perulangan while 
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("======== Perulangan For Each =======");
        // Perulangan while 
        int[] bil = {30,30,60};
        for (int j: bil) {
            System.out.println(j);
    }
}
}

