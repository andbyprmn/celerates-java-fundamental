package com.celerates.main;

import java.util.Scanner;
import com.celerates.model.Feed;
import com.celerates.model.Story;

public class Main {
    public static void main(String[] args) {
        // Feed
        Feed caption = new Feed();
        System.out.print("Enter feed caption: ");
        Scanner inputCap = new Scanner(System.in);
        caption.setCaption1(inputCap.nextLine());

        Feed photo = new Feed();
        System.out.print("Enter feed photo: ");
        Scanner inputPho = new Scanner(System.in);
        photo.setFoto1(inputPho.nextLine());

        Feed comments = new Feed();
        System.out.print("Enter feed comments: ");
        Scanner inputCom = new Scanner(System.in);
        comments.setComments(inputCom.nextLine());

        Feed likes = new Feed();
        System.out.println("Enter feed likes: ");
        Scanner inputLik = new Scanner(System.in);
        likes.setLike(inputLik.nextInt());

        // Story
        Story captions = new Story();
        System.out.print("Enter story captions: ");
        Scanner inputC = new Scanner(System.in);
        captions.setCaption(inputC.nextLine());

        Story photo1 = new Story();
        System.out.print("Enter story photo: ");
        Scanner inputP = new Scanner(System.in);
        photo1.setFoto(inputP.nextLine());

        Story tanggal = new Story();
        System.out.print("Enter date: ");
        Scanner inputT = new Scanner(System.in);
        tanggal.setTanggal(inputT.nextLine());

        // Using getter method
        System.out.println("Caption feed: " + caption.getCaption1());
        System.out.println("Foto feed: " + photo.getFoto1());
        System.out.println("Comments feed: " + comments.getComments());
        System.out.println("Caption story: " + captions.getCaption());
        System.out.println("Foto story: " + photo1.getFoto());
        System.out.println("Tanggal story: " + tanggal.getTanggal());
        System.out.println("Jumlah like feed: " + likes.getLike());
    }
}
