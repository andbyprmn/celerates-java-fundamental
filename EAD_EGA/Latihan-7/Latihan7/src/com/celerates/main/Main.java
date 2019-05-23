package com.celerates.main;

import com.celerates.model.Feed;
import com.celerates.model.Story;

public class Main {
    public static void main(String[] args) {
        // Feed
        Feed likes = new Feed();
        Feed caption = new Feed();
        Feed photo = new Feed();
        Feed comments = new Feed();
        likes.setLike(1000);
        caption.setCaption1("Ini adalah caption");
        photo.setFoto1("Sumringah");
        comments.setComments("Banyak komen!");

        // Story
        Story captions = new Story();
        Story photo1 = new Story();
        Story tanggal = new Story();
        captions.setCaption("Ini adalah caption story");
        photo1.setFoto("Sumringah banget");
        tanggal.setTanggal("2016-10-01");

        // Using getter method
        System.out.println("Foto story: " + photo1.getFoto());
        System.out.println("Tanggal story: " + tanggal.getTanggal());
        System.out.println("Caption story: " + captions.getCaption());
        System.out.println("Jumlah like feed: " + likes.getLike());
        System.out.println("Caption feed: " + captions.getCaption());
        System.out.println("Foto feed: " + photo.getFoto1());
        System.out.println("Comments feed: " + comments.getComments());

    }
}
