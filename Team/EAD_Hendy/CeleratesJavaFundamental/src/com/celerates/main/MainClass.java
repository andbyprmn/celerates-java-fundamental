/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.main;

import com.celerates.model.Users;
import com.celerates.talent.Talents;

public class MainClass {


    public static void main(String[] args) {
   
            Talents talent = new Talents();//static tidak perlu ini
            System.out.println(talent);
            talent.nikKaryawan("929292");
            talent.alamat = "kolak";
            
            //pemanggilan constructor
            //Talents talent = new Talents < nama constructor("constructor menggunakan para");
            //System.out.println(talent);
            //pemanggilan statis
            //talent.nikKaryawan("929292");
            //static gak perlu deklarasi object
            
            //untuk set dan get name
            Users user= new Users();
            
            user.setWebtoken("hendy");
            
            if(user.getWebtoken() == "hendy"){
                System.out.println("Session telah abis");
            }else{
                System.out.println("in Login");
                
            }
        
    }
    
}
