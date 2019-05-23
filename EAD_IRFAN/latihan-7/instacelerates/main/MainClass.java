package com.instacelerates.main;

import com.instacelerates.model.Feed;
import com.instacelerates.model.Story;

public class MainClass {

    public static void main(String[] args) {
        
        // Story
        Story story = new Story();
        
        story.setFoto("ocean.jpg");
        story.setTgl("23/05/2019");
        story.setCaption("What a beautiful ocean");
        
        System.out.println("---InstaCelerates Story---" + "\nFoto : " + story.getFoto() + 
                "\nTgl : " + story.getTgl() + 
                "\nCaption : " + story.getCaption() + "\n");
        
        
        // Feed
        Feed feed = new Feed();
        
        feed.setFoto("bounty.jpg");
        feed.setCaption("Gold hunter");
        feed.setLike(128);
        feed.setComments("It's a great choice ever!");
        
        System.out.println("---InstaCelerates Feed---" + "\nFoto : " + feed.getFoto() +
                "\nCaption : " + feed.getCaption() + 
                "\nLike : " + feed.getLike() +
                "\nComments : " + feed.getComments());
         
    }
    
}
