/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;
/**
 *
 * @author Inggrid
 */
public class PerulanganJava {
    public static void main(String[] args){
        
        System.out.println("LEARN LOOPING IN JAVA\n");
        
        int hasil = 0, hasil2 = 0, hasil3 = 0, hasil4 = 0,i = 1;
        
        System.out.println("PROGRAM FOR");
        
        for(i = 1; i <=10; i++){
            hasil +=i;
            System.out.println(i);
        }
        System.out.println("total = " + hasil + "\n");
        
        System.out.println("PROGRAM WHILE");
        
        
        i = 1; //melakukan inisiasi ulang
        while(i<=10){
            hasil2 +=i;
            System.out.println(i);
            i++;
        }
        System.out.println("total = " + hasil2 + "\n");   
        
        System.out.println("PROGRAM DO WHILE");
        
        
        i = 1; //melakukan inisiasi ulang
        do{
            System.out.println(i);
            hasil3 += i;
            i++;
        }while(i<=10);
        System.out.println("total = " + hasil3 + "\n");
        
        System.out.println("PROGRAM FOR EACH");

        int nilai[]= {1,2,3,4,5,6,7,8,9,10};
        
        for(int a:nilai){
            hasil4+=a;
            System.out.println(a);
        }
        System.out.println("total = " + hasil4);
    }
   
}
