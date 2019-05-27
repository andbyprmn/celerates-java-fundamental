package com.celerates.talent;

public class Talents {
           
            String nik;
            String nama;
            public String alamat;
            int umur;
            
            public void niKaryawan(String nik){
                this.nik = nik;
                System.out.println(this.nik);
               
           }
            public Talents(){
                System.out.println("Constructor tanpa parameter");
            }
            public Talents(String message){
                System.out.println(message);
            }
        } 
