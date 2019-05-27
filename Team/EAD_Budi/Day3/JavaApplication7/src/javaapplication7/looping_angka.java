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
public class looping_angka {
    public static void main(String args[]) 
    { 
      
        for (int x = 1; x <= 10; x++) 
            
            System.out.println( x); 
        
        int sum = 0; 

        for (int i = 1; i <= 10; i++) {

        sum += i; 

        }

        System.out.println("Jumlahnya " + sum);
       
    } 
    
   
}   
