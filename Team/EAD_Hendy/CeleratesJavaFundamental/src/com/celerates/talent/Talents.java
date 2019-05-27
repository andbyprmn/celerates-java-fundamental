
package com.celerates.talent;


public class Talents {
        String nik;
        String nama;
        public String alamat;
        protected int umur;
        
        //keyword this
        public void nikKaryawan(String nik){
            this.nik = nik;
            System.out.println(this.nik);
            umur = 23;
         //nik = nik;
         //System.out.println(nik);
        //static tidak mendukung method this
            
       }
       //Constaractor & overload 
       public Talents(){
           
           System.out.println("Tanpa Paameter");
       
       }
       
       public  Talents(String message){
           System.out.println(message);
       
       }
       
}
