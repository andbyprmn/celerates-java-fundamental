/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instacelerates;

import model.Feed;
import model.Story;

/**
 *
 * @author Muhammad Hanif
 */
public class MainClass {
    public static void main(String[] args) {
        
        Feed feed = new Feed();
        Story story = new Story();
        
        story.setFoto("pantai");
        story.setTgl("23 May 2019");
        story.setCaption("#visitindonesia");
        
        feed.setFoto("Surfing");
        feed.setCaption("Try surfing for the firs time");
        feed.setComments("wow cool!");
        feed.setLike(178);
        
        System.out.println(
                "Story: " +
                "\nFoto: " +
                story.getFoto() +
                "\nTanggal: " +
                story.getTgl() +
                "\ncaption: " +
                story.getCaption() +
                "\n"
        );
       
        System.out.println(
                "Feed: " +
                "\nFoto: " +
                feed.getFoto() +
                "\nCaption: " +
                feed.getCaption() +
                "\nComments: " +
                feed.getComments() +
                "\nLike: " +
                feed.getLike()
        );
        
    }
    
}
