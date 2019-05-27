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
 * @author Lisa Fita Sari
 */
public class MainClass {
    public static void main(String[] args){
        
        Talents talent = new Talents();
        talent.niKaryawan("96153159");
//      talent.alamat = "Jl Raya Bogor"; 
// gabisa diakses karena atribut private
        
        //memanggil contructor Talents
        Talents talentConstructor = new Talents("Constructor menggunakna parameter");
        System.out.println(talentConstructor);
        
        //memanggil keyword static
        //catatan harus dibuat public agar bisa diakses dibeda package
        //tidak perlu deklarasikan objek untuk memanggil static
        Talents.niKaryawan2("12345678");
        
        Users user = new Users();
        
        user.setWebToken("vsfvgneenuie");
        if (user.getWebToken() != "vsfvgneenuie"){
            System.out.println("Session berakhir!");
        }else{
            System.out.println("Session dimulai!");
        }
        
     
    }
}
