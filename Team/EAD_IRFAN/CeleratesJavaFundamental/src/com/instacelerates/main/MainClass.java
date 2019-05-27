package com.instacelerates.main;

import com.instacelerates.models.Feed;
import com.instacelerates.models.Story;
import com.instacelerates.models.insta;

public class MainClass {

    public static void main(String[] args) {
        
        insta objInsta = new insta();
        
        // Story
        Story story = new Story();
        
//        story.setFoto("ocean.jpg");
        story.setTgl("23/05/2019");
//        story.setCaption("What a beautiful ocean");
        
        System.out.println("---InstaCelerates Story---" + "\n"); 
        System.out.println("Tgl : " + story.getTgl() + "\n"); 
     
        
        // Feed
        Feed feed = new Feed();
        
//        feed.setFoto("bounty.jpg");
//        feed.setCaption("Gold hunter");
        feed.setLike(128);
        feed.setComments("It's a great choice ever!");
        
        System.out.println("---InstaCelerates Feed---" + "\n");
        System.out.println("Like : " + feed.getLike());
        System.out.println("Comments : " + feed.getComments());
         
    }
    
}
