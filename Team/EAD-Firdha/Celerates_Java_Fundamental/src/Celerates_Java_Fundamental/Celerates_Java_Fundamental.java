/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Celerates_Java_Fundamental;

class Celerates_Java_Fundamental {
    
    public static void main(String[] args) {
        
        Mobil myMobs = new Mobil ();
        myMobs.warnaMobil = "red";
        myMobs.rangkaMobil = "8897";
        
        //menampung hasil output
        String merkMobil = myMobs.merkMobil;
        String rangkaMobil = myMobs.rangkaMobil;
        int maxSpeed = myMobs.maxSpeed;
        
        //merubah tipe data
        int rangkaMobil1 = Integer.valueOf(myMobs.rangkaMobil);
        
        System.out.println(myMobs.merkMobil + " "+ rangkaMobil + " " + rangkaMobil1);
        
        
        //memanggil objek method procedure
        String nyala = "Nyalakan mesin";
        myMobs.nyalakanMesin(nyala);
        myMobs.matikanMesin();
        
        //memanggil objek method function
        System.out.println(myMobs.maxSpeed);
        
        System.out.println("Jarak tempuh : " + myMobs.jarakTempuh(60, 3600));
        
        System.out.println("Waktu tempuh : " + myMobs.waktuTempuh(90, 60));
    }
    
}
