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
 * @author Firdha
 */
public class MainClass {
     public static void main(String[] args) {
         
         //Constructor
         /*Talents talent = new Talents();
         Talents talent2 = new Talents("Constructor dengan Parameter");
         talent.niKaryawan("9817387");
         Talents.niKaryawan("523621218218");
         */
         
         
         //setter and getter

         Users user = new Users();
         
         //contoh kondisi
         user.setWebToken("maulidyafs");
         
         if (user.getWebToken() != "maulidyafs") {
             System.out.println("Session telah habis");
         }
         else {
             System.out.println("In Login");
         }
         
         
     }
     
     
}
