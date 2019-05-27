/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;


public class foreachlooping {
   
   public static void main(String args[]){  
   int arr[]={1,2,3,4,5,6,7,8,9,10};  
   int jml =0;
   for(int i:arr){  
     System.out.println(i);  
     jml +=i;
   }  
   System.out.println("Jumlahnya ="+ jml);
 }   
}  

