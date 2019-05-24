/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Lisa Fita Sari
 */
public class perulangan {
    public static void main (String[] args) {
        int jml = 0;
        for(int i = 0; i < 5; i++){
            jml += i;
            System.out.println(jml);
        }
        int[] nilaiArray = {30,30,60};
        for(int cetakArray : nilaiArray){
            System.out.println(cetakArray);
        }
    }
}
