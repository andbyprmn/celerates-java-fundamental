package com.celerates.main;
import com.celerates.talent.Talents;
import com.celerates.model.Users;

/**
 *
 * @author Nanang
 */
public class MainClass {
   
    public static void main(String[] args) {
     
        //Talents talent = new Talents();
        //System.out.println(talent); 
        //talent.namaku ("Nama: Nanang Suwandana");
        //talent.niKaryawan("NIK : 331632");
        //talent.alamatku ("Alamat: Jalan Raya Bogor");
        Talents.niKaryawan("331632");
        
        
        Users user = new Users ();
        
        user.setWebToken ("Nanang");
        
        if(user.getWebToken() != "Nanang"){
            System.out.println("Session telah habis!");
        }else{
            System.out.println("In login");
        
    }
    
    }
}
