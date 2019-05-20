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
public class Pendapatan {
    public static void main (String[] args) {            
        int pendapatanHariItu = 10000000;
        double komisi;
        int uangJasa;
        if(pendapatanHariItu <= 2000000){
            uangJasa = 100000;
            komisi = 0.1 * pendapatanHariItu;
        }else if(pendapatanHariItu > 2000000 && pendapatanHariItu < 5000000){
            uangJasa = 200000;
            komisi = 0.15 * pendapatanHariItu;
        }else{
            uangJasa = 300000;
            komisi = 0.2 * pendapatanHariItu;
        }
        double pendapatanSales = (double) (uangJasa + komisi);
        System.out.println("Pendapatan sales hari itu sebesar " + pendapatanSales);
    }
}
