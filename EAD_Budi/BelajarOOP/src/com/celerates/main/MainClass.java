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
 * @author ACER
 */
public class MainClass {
 public static void main(String[] args){
    // Talents talent = new Talents("messagesss");
    // System.out.println(talent);
 //    talent.niKaryawan("1239i");
  //   talent.alamat ="jalan-jalan";
  Users user = new Users();
  user.setWebtoken("1");
  if (user.getWebToken()!="Asun"){
      System.out.println("Session telah habis");
  }else{
      System.out.println("In Login");
  }
          
             }
}
