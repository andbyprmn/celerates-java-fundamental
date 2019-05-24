package com.celerates.main;

import java.util.Scanner;
import com.celerates.model.Feed;
import com.celerates.model.Story;

public class Main {
    public static void main(String[] args) {

        Story story = new Story();
        Feed feed = new Feed();

        // Feed
        System.out.print("Enter feed caption: ");
        Scanner inputCap = new Scanner(System.in);
        feed.setCaption(inputCap.nextLine());

        System.out.print("Enter feed photo: ");
        Scanner inputPho = new Scanner(System.in);
        feed.setFoto(inputPho.nextLine());

        System.out.print("Enter feed comments: ");
        Scanner inputCom = new Scanner(System.in);
        feed.setComments(inputCom.nextLine());

        System.out.println("Enter feed likes: ");
        Scanner inputLik = new Scanner(System.in);
        feed.setLike(inputLik.nextInt());

        // Story
        System.out.print("Enter story captions: ");
        Scanner inputC = new Scanner(System.in);
        story.setCaption(inputC.nextLine());

        System.out.print("Enter story photo: ");
        Scanner inputP = new Scanner(System.in);
        story.setFoto(inputP.nextLine());

        System.out.print("Enter date: ");
        Scanner inputT = new Scanner(System.in);
        story.setTanggal(inputT.nextLine());

        // Using getter method
        System.out.println("Caption feed: " + feed.getCaption());
        System.out.println("Foto feed: " + feed.getFoto());
        System.out.println("Comments feed: " + feed.getComments());
        System.out.println("Jumlah like feed: " + feed.getLike());
        System.out.println("Caption story: " + story.getCaption());
        System.out.println("Foto story: " + story.getFoto());
        System.out.println("Tanggal story: " + story.getTanggal());
    }
}