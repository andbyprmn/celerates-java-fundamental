/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.talent;

/**
 *
 * @author Muhammad Hanif
 */
public class Talents {
    
        
        static String nik;
        String nama;
        String alamat;
        static int umur;
        
        //keyword this
        public static void nikKaryawan(String nik){ //<- dengan static, tidak perlu men-declare object apabila ingin digunakan
            Talents.nik = nik;
            System.out.println(Talents.nik);
        }
        
        
        //constructor overloading
        public Talents(){
            System.out.println("Constructor tanpa parameter");
        }
                                            //fungsi dengan nama yang sama namun
                                            //parameter berebeda disebut "overloading"
        public Talents(String message){
            System.out.println(message);
        }
    
}
