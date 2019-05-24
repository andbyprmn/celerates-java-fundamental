/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.main;

import com.celerates.talent.Talents; //<-- import selalu di sematkan di bawah 
import com.scelerates.model.Users;
                                     //    package, kalau di atas akan error

/**
 *
 * @author Muhammad Hanif
 */
public class MainClass {
    public static void main(String[] args) {
        
//        Talents talent = new Talents();  //<- constructor akan otomatis dijalankan pada saat program run
//        // Talents talent = new Talents("isi parameter");  //<- bisa menggunakan parameter (gunakan salah satu)
//        talent.nikKaryawan("123456");
        Talents.nikKaryawan("1209421"); //<- kalau menggunakan static, tidak perlu seklarasi object
        
        Users user = new Users();
        
        user.setWebToken("asdfJHkjhvKU");
        
        if(user.getWebToken() != "asdfJHkjhvKU"){
            System.out.println("Session telah habis!");
        }else{
            System.out.println("in login");
        }
        
        
    }
    
}
