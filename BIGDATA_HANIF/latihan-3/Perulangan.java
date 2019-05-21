/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Muhammad Hanif
 */
public class Perulangan {
    public static void main(String[] args) {
        
        // for
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            a+=i;
            System.out.print("output 'for': " + i + "\n");
        }
        System.out.print("total 'for': " + a + "\n" + "\n");
        
        //foreach
        int b = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int j: arr){
            b+=j;
            System.out.print("output 'foreach': " + j + "\n");
        }
        System.out.print("total 'foreach': " + b + "\n" + "\n");
        
        // While
        int k = 0;
        int c = 0;
        while (k<10){
            k++;
            c+=k;
            System.out.print("output 'while': " + k + "\n");
        }
        System.out.print("total 'while': " + c + "\n" + "\n");
        
        // Do While
        int l = 0;
        int d = 0;
        do{
            l++;
            d+=l;
            System.out.print("output 'do while': " + l + "\n");
        }while(l<10);
        System.out.print("total 'do while': " + d + "\n");
        
        
    }
    
}
