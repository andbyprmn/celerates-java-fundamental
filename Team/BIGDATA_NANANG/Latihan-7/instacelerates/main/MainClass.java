package com.instacelerates.main;
import com.instacelerates.model.Feed;
import com.instacelerates.model.Story;
import com.instacelerates.model.insta;

public class MainClass {
    public static void main(String[] args) {
        
        insta objinsta = new insta();
    
        System.out.println("==== Latihan 7 Enscapsulation ====");
        System.out.println();
        
        Story cobastory = new Story();
        Feed cobafeed = new Feed();
        
        //Story
        cobastory.setFoto("Tertawa lepas");
        System.out.println("Foto Story : " + cobastory.getFoto());
        
        cobastory.setTgl("25 Mei 2019");
        System.out.println("Tanggal Story : " + cobastory.getTgl());
        
        cobastory.setCaption("Nikmati setiap hari dengan tertawa hahaha");
        System.out.println("Caption Story : " + cobastory.getCaption());
        
         System.out.println();
        
        //Feed
        cobafeed.setFoto("Senyum manja");
        System.out.println("Foto Feed : " + cobafeed.getFoto());
        
        cobafeed.setCaption("Udah senyumin ajaaa");
        System.out.println("Caption Feed : " + cobafeed.getCaption());
        
        cobafeed.setLike(1000);
        System.out.println("Like Feed : " + cobafeed.getLike());
        
        cobafeed.setComments("Senyummu mengalihkan duniakuu uwuuuu");
        System.out.println("Comments Feed : " + cobafeed.getComments());
    }
    
}
