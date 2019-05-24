/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.instacelerates.main;

import com.instacelerates.model.Feed;
import com.instacelerates.model.Insta;
import com.instacelerates.model.Story;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hafidh Adhi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Scanner in = new Scanner(System.in);
        Insta insta = new Insta();
        Story story = new Story();
        Feed feed = new Feed();

        String dateString = format.format(new Date());
        //Date date = format.parse("2009-12-31");

        System.out.println("====================================================");
        System.out.println("PROGRAM MEMBUAT STORY DAN FEED INSTACELERATES");
        System.out.println("====================================================");
        
        System.out.println("\nUPLOAD STORY");
        System.out.println("-----------------");
        System.out.print("Ambil Foto: ");
        story.setFoto(in.nextLine());
        story.setTglStory(format.format(new Date()));
        System.out.print("Tulis Caption: ");
        story.setCaption(in.nextLine());
        System.out.println("\nSTORY-MU");
        System.out.println("-----------------");
        System.out.println(story.getFoto());
        System.out.println(story.getTglStory());
        System.out.println(story.getCaption());
        
        System.out.println("\n\nTAMBAH FEED");
        System.out.println("-----------------");
        System.out.print("Ambil Foto: ");
        feed.setFoto(in.nextLine());
        System.out.print("Tulis Caption: ");
        feed.setCaption(in.nextLine());
        feed.setLikeFeed(200);
        feed.setCommentFeed("PENINGGI BADANNYA KAK!!!");
        System.out.println("\nFEEDMU-MU");
        System.out.println("-----------------");
        System.out.println(feed.getFoto());
        System.out.println(feed.getCaption());
        System.out.println(feed.getLikeFeed() + " Likes" + "\nComments:");
        System.out.println(feed.getCommentFeed());
    }

}
