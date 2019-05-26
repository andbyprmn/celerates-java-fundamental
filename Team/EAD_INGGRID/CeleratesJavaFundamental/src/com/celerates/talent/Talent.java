
package com.celerates.talent;

/**
 *
 * @author Inggrid
 */
public class Talent {
    
        String  nik; //static String nik //penggunaan variable dengan static
        String nama;
        public String alamat;
        protected int umur; //protected static int umur //penggunaan variable dengan static
        
        //keyword 'this'
        public void niKaryawan(String nik){
            this.nik = nik;
            System.out.println(this.nik);
            
            umur = 23;
        }
        
        //keyword 'static'
        //public static void niKaryawan(String nik){
            //nik = nik;
            //System.out.println(nik);
        //}
        
        //constructor dan overloading
        public Talent(){
            System.out.println("Constructor tanpa parameter");
        }
        
        public Talent(String message){
            System.out.println(message);
        }
        
        
}
