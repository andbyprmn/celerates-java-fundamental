/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author ACER
 */
public class whilelooping {
         public static void main(String args[]) 
    { 
        int x = 1; 
        int sum =0;
        int i =1;
  

        while (x <= 10) 
        { 
            System.out.println( x); 
  
            x++; 
        } 
        
        while (i <= 10)
        {
            
            sum +=i;
            i++;

        }
        System.out.println( "Jumlahnya " + sum); 
    } 
}
