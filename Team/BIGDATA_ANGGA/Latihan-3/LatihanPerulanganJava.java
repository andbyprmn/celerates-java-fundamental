/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author AnggaFMP
 */
public class LatihanPerulanganJava {
    
    public static void main (String[]args){
        
        //While
        int i = 0;
        int s = 0;
        while (i<10){
            i++;
            s+=i;
            System.out.print("output 'while': " + i + "\n");      
    }
    System.out.print("output 'while': " + s + "\n");
        
        //Do-While
        int x = 0;
        int d = 0;
        do{
            x++;
            d+=x;
            System.out.print("output 'do-while': " + x + "\n");
        }while (x < 10 );
        System.out.print("output 'while': " + d + "\n");
        
     //For
        int a = 0;
        for (int v = 1; v <= 10; v++) {
            a+=i;
            System.out.print("output 'for': " + i + "\n");
        }
        System.out.print("total 'for': " + a + "\n" + "\n");
        
    //For Each
        int b = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int j: arr){
            b+=j;
            System.out.print("output 'foreach': " + j + "\n");
        }
        System.out.print("total 'foreach': " + b + "\n" + "\n");
        

    

    }
    
    
   
}
        
    
   

 
        
        
    


