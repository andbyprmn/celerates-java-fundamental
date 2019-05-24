package com.celerates.main;

import com.celerates.talent.Talents;
import com.celerates.model.Users;

public class MainClass {
    
    public static void main(String[] args) {
        
//        Talents talent = new Talents();
//        System.out.println(talent);
        
//        talent.namaKaryawan("Muhamad Irfan");
//        talent.niKaryawan("1401144478");
//        talent.alamatKaryawan("Jl. Kenanga Terusan No. 32");
//        Talents.niKaryawan("1401144478");
        
        Users user = new Users();
        
        user.setWebToken("megacreep");
        
        if(user.getWebToken() != "megacreeps"){
            System.out.println("Session has expired >_<`");
        } else {
            System.out.println("In login");
        }
    }
        
}

