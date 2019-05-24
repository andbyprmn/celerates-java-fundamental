/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Arrays;

/**
 *
 * @author hendy nurfriyanto
 */
public class PerulanganJava {
         public static void main(String[] args) {
             
        int a = 0;
        int b = 0;
        System.out.println();
        System.out.println("Perulangan do while:");
        do {
            b++;
            System.out.println(b);
            a+=b;
        } 
        while ( b <10);
        System.out.println("Totalnya =" + a);
             
                     int i = 0;
                     int y =0;
        System.out.println();
        System.out.println("Perulangan while:");

        while (i < 10) {
            i ++;
            System.out.println( i );
            y+=i;
        }{
        System.out.println( "toatl= "+y );

        }
      int[] j = {1,2,3,4,5,6,7,8,9,10};
      int k=0;
     System.out.println();
     System.out.println("Perulangan For each :");

         for( int x : j ){
            System.out.println(x + " ");
            k+=x;
         }
         System.out.println("Total = " + k);
        
        int x,jml; 
                jml=0;
     System.out.println();
     System.out.println("Perulangan for:");
        for(x=1;x<=10;x++)  
        {
            jml+=x;
               System.out.print(x+" ");     
        }
        
        System.out.println(); 
        System.out.println("Total jumlah :"+jml);     
    }    
}
