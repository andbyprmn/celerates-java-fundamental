/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author hendy nurfriyanto
 */
//int rangka = new Integer(rangka);(untuk menghubah string balik ke integer)
//namaObjek.run();(untuk memanggil method)
//namaObjek.merkmobil;(untuk memanggil variabel di class)
//bila disuruh buat method function maka harus tanya tipe datanya apa karena method function membutuhkan tipe data

public class CeleratesJavaFundamental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mobil namaObject = new Mobil();
        String merkmobil = namaObject.merkmobil;
        String Warnamobil = namaObject.warna;
        String rangka = namaObject.rangka;
        int maxspeed = namaObject.maxspeed;
        
        System.out.println(merkmobil+" "+namaObject.warna+" "+namaObject.rangka+" "+namaObject.maxspeed);
        
        //memanggil method procedure
        //letak parameter > void namaProcedure(tipedata namavariabel){]
        String nyala ="nyalakan mesin";
        namaObject.hidupkanmesin(nyala);
        
        
        namaObject.matikanmesin();
        
        
          /*  int jarak2 = 90;
            int kecepatan = 60;
            int wak = 3900;
            */
        //memanggil method function
        //letak parameter > int namafunction(tipeDta namavariabel,tipeDta namavariabel2{}
        //1. namaObject.kecepatan();
        
        //2. int kecepata = namaObject.kecepatan();
        //      System.out.println(kecepata+" km");
        
        //3.
        System.out.println(namaObject.kecepatan()+" km");
        
        System.out.println("jarak tempuh = "+namaObject.jarak(60,3900));
        System.out.println("waktu tempuh = "+namaObject.waktu(90,60));
        
        
        
    }
    
}
