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
       a.foto ="aggresive mang";
       a.tgl ="20-04-1993";
       a.caption="rahasia itu merupakan hal yang ...";
       b.foto ="ceria";
       b.caption="terbuka itu merupakan hal yang paling....";
       b.like= 300000;
       b.comment=" saya suka yang seperti ini";
       
       //printnya foto story
        System.out.println("foto :");
        System.out.println("Foto strory ="+a.foto);
        System.out.println("tanggal ="+a.tgl);
        System.out.println("Caption = "+a.caption);
        System.out.println(" ");
        
        //print feed
        System.out.println("fotoynya :");
        System.out.println("foto feed = "+b.foto);
        System.out.println("caption = "+b.caption);
        System.out.println("like =" +b.like);
        System.out.println("commentnya =" +b.comment);
    }
    
}
