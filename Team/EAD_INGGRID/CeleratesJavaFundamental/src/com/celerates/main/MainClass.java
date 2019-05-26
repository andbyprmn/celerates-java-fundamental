package com.celerates.main;

import com.celerates.model.Users;
import com.celerates.talent.Talent;

/**
 *
 * @author Inggrid
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        Talent talent = new Talent();
        talent.niKaryawan("17973096");
        talent.alamat= "Jln Raya Bogor";
        
        //contoh pemanggilan constructor
        
        //Talent talent = new Talent(); --> Talent setelah new adalah nama constructor pada class talent
        //System.out.println(talent); --> const tanpa parameter
        //Talent talent = new Talent("Constructor dengan parameter"); --> Talent setelah new adalah nama constructor pada class talent
        //System.out.println(talent);
        
        //penggunaan enkapsulasi
        
        Users user = new Users();
        
        user.setWebToken("IMAE179730962");
        System.out.println(user.getWebToken());
        
//        if(user.getWebToken() != "IMAE17973096"){
//            System.out.println("Session telah habis!");
//        }else{
//            System.out.println("In Login");
//        }
        
        
    }
    
}
