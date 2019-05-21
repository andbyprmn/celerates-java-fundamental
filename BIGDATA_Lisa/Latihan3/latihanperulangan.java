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
public class latihanperulangan {
    @SuppressWarnings("empty-statement")
    public static void main (String[] args) {
        // for untuk menampilkan bilangan integer 1 - 10
        System.out.println("for untuk menampilkan bilangan integer 1 - 10");
        for(int i = 1; i <= 10; i++){
            System.out.println(i+"");
        }
        
        //Printout total dari setiap 1-10 menggunakan for
        System.out.println("for untuk menampilkan total bilangan integer 1 - 10");
        int jml = 0;
        for(int total=1; total < 10; total++){
            jml += total;
            System.out.println(jml);
        }
        
        // while untuk menampilkan bilangan integer 1 - 10
        System.out.println("while untuk menampilkan bilangan integer 1 - 10");
        int a = 0;
        while(a < 10){
            a++;
            System.out.println(a+"");
        }
        
        // Printout total dari setiap 1-10 menggunakan while
        System.out.println("while untuk menampilkan total bilangan integer 1 - 10");
        int d = 0, e = 0; 
        while(e < 10){
            e++;
            d += e;
            System.out.println("" +d);
        }
        
        
        //Do while untuk menampilkan bilangan integer 1 - 10
        System.out.println("Do while untuk menampilkan bilangan integer 1 - 10");
        int b = 0;
        do{
        b++;
        System.out.println(b+"");
        }
        while(b < 10);
        
        // Printout total dari setiap 1-10 menggunakan do while
        System.out.println("do while untuk menampilkan total bilangan integer 1 - 10");
        int f = 0, g = 0;
        do{
        g++;
        f+=g;
        System.out.println(f);
        }
        while(g < 10);
        
        //For Each untuk menampilkan bilangan integer 1 - 10
        System.out.println("Foe Each untuk menampilkan bilangan integer 1 - 10");
        int[] nilaiArray = {1,2,3,4,5,6,7,8,9,10};
        for(int cetakArray : nilaiArray){
            System.out.println(cetakArray);
        }
        
        // Printout total dari setiap 1-10 menggunakan for each
        System.out.println("for each untuk menampilkan total bilangan integer 1 - 10");
        int totalArray = 0;
        int[] nilaiArray2 = {1,2,3,4,5,6,7,8,9,10};
        for(int cetakArray : nilaiArray2){
            totalArray += cetakArray;
            System.out.println(totalArray);
        }        
    }
}
