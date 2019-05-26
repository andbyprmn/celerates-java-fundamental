package com.celerates.talent;

public class Talents {

        static String nik;
        String nama;
        public String alamat;
        protected int umur;

        // Keyword 'this'
        public static void niKaryawan(String nik){

            System.out.println(nik);

        }

        // Constructor dan Overloading
        public Talents(){
            System.out.println("constructor tanpa parameter");
        }

        public Talents(String message){
            System.out.println(message);
        }
}
