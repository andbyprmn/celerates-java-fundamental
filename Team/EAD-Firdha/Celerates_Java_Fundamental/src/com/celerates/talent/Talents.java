/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.talent;

/**
 *
 * @author Firdha
 */
public class Talents {
        static String nik;
        String nama;
        public String alamat;
        protected static int umur;
        
        //constructor
        // method juga, tetapi tidak pake tipe data dan tidak ada return
        public Talents() {
        System.out.println("Constructor Tanpa Parameter");
        }
        
        public Talents(String message) {
        System.out.println(message);
        }
        
        
        //keyword this
        public static void niKaryawan(String nik) {
            /*this.nik = nik;
            System.out.println(this.nik); */
            umur = 23;
            nik = "547521621";
        }       
      
}
