package com.celerates.perulangan;

/**
 *
 * @author Admin
 */
public class perulanganJava {
    
    public static void main(String[] args){
    
        int angkaAwal; 
        int angkaAwal2 = 1; 
        int jumlah = 0; 
        int jumlah2 = 0; 
        int jumlah3 = 0; 
        int nilai2 = 1;
        int Arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int jumlah4 = 0; 
        
        System.out.println("Menggunakan perulangan for");
        for(angkaAwal = 1; angkaAwal <=10; angkaAwal++){
            jumlah = jumlah + angkaAwal; 
            
            System.out.println("angka: " + angkaAwal);
           // System.out.println("Total Keluaran : " i++ );
        }
        System.out.println("Total Penjumlahannya: " +jumlah);
           
        
        System.out.println();
        System.out.println("Menggunakana perulangan while");
        while (angkaAwal2<=10){
            System.out.println("angka: " +angkaAwal2);
            jumlah2 = jumlah2 + angkaAwal2;
            angkaAwal2++;    
        }   
            System.out.println("Jumlah total perulangan while: " +jumlah);
           
        System.out.println();
        System.out.println("Menngunakan perulangan Do while");  
        do{
            System.out.println("Angka : " +nilai2);
            jumlah3 = jumlah3 + nilai2; 
                
            nilai2++; 
        }while(nilai2 <= 10); 
        System.out.println("Total jumlah perulangan Do while : " +jumlah3);
            
     
        System.out.println();
        System.out.println("Perulangan dengan for each");
        for(int i:Arr){
        jumlah4 = jumlah4 + i; 
        System.out.println("Angka: " +i);
        }
        System.out.println("Total jumlah perulangan for each : " +jumlah4);
    }
}


