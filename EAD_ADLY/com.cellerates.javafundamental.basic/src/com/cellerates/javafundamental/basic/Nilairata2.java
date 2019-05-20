/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author Admin
 */
public class Nilairata2 {
    
    public static void main (String[] args){
        
        int[] array = {30, 30, 60}; 
        
        int jumlah = 0; 
        
        for(int i=0; i < array.length; i++){
        
            jumlah = jumlah + array[i];
        }
    
        int rata2 = jumlah/array.length;
        
        System.out.println("Nilai rata-ratnya adalah: " +rata2);
    }
    
}
