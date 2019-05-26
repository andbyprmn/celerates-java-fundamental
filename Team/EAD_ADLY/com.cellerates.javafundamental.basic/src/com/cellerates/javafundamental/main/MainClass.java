/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.main;

import com.celerates.model.Users;
import com.celerates.talent.Talents;

/**
 *
 * @author Admin
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Jika menggunakan static tidak perlu deklarasi 
        //object baru 
        //langsung panggil saja atribut dan methodnya 
        //talent.niKaryawan(no Nik-nya);
        
//        //buat object baru dengan command new 
//        Talents talent = new Talents();
//        
//        talent.niKaryawan("3201020507940007");
//        talent.alamat = "Jln Pancasila 2 No.14 Rt003/Rw 001"; 
        
        //deklarasikan object baru 
        Users user = new Users();
        //panggil atribut dan method lalu masukan nilai 
        user.setWebToken("Abgdadjadkajdadi");
        
        if(user.getWebToken() == "Abgdadjadkajdadi"){
            System.out.println("Sesioun telah habis");       
        }else{
            System.out.println("In login");
        }
    
    
    }
    
}
