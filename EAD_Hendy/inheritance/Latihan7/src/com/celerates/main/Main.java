/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.main;

import com.celerates.model.story;
import com.celerates.model.feed;
public class Main {

    public static void main(String[] args) {
      
       story a = new story();
       feed b = new feed();
       a.setFoto("aggresive mang");
       a.setCaption("sedih membawa petaka");
       b.setFoto("Senyum dong");
       b.setCaption("senyum membawa berkah");
       b.setLike(99999999);
       b.setComment("Teeeeer baiiiik ....!");
       
       //printnya foto story
        System.out.println("foto :");
        System.out.println("Foto strory = "+a.getFoto());
        System.out.println("tanggal = "+a.getTgl());
        System.out.println("Caption = "+a.getCaption());
        System.out.println(" ");
        
        //print feed
        System.out.println("fotoynya :");
        System.out.println("foto feed = "+b.getFoto());
        System.out.println("caption = "+b.getCaption());
        System.out.println("like = " +b.getLike());
        System.out.println("commentnya = " +b.getComment());
    }
    
}
