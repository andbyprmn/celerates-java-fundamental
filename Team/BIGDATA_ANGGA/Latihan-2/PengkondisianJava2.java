/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author AnggaFMP
 */
public class PengkondisianJava2 {
    
    public static void main(String[]args){
        
        System.out.println("Uang Jasa Sales: ");
        Scanner s = new Scanner (System.in);
        int hasiljual = s.nextInt();
        
        if (hasiljual>5000000){
           Double total = (hasiljual*0.3)+300000+hasiljual;
           System.out.println(total);
        }
         
        else if (hasiljual>2000000){
            Double total2 = (hasiljual*0.15)+200000+hasiljual;
            System.out.println(total2);
            }
        
        else if (hasiljual==2000000){
            Double total3 = (hasiljual*0.1)+100000+hasiljual;
            System.out.println(total3);
            }
        
        else {
            System.out.println(hasiljual);
            
        }
            
        }
            
    
}
