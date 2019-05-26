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
public class PerulanganJava {
    public static void main(String[] args) {
        // Perulangan for
        System.out.println("Hasil for adalah :");
        int i, jml;
        jml=0;
        for (i=1; i<=10; i++){
            jml=jml+i;
        System.out.println(i+" ");
        }
        System.out.println("Total jumlah :" +jml);
        System.out.println();
    
          // Perulangan while
    System.out.println("Hasil while adalah: ");
        int j = 1, a=0;
        while (j <= 10) {
            System.out.println(j);
            a+=j;
            j++;
        }
       System.out.println("Total jumlah :"+a);
       
            System.out.println();
    
            // Perulangan do while
    System.out.println("Hasil do while adalah: ");
       int k = 1, b=0;
       do {
           System.out.println(k);
           b+=k;
           k++;
       }
       while (k<=10);
        
       System.out.println("Total jumlah :"+b);
}
}
