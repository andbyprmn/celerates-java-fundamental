
package com.instacelerates.main;

import com.instacelerates.model.feed;
import com.instacelerates.model.story;
import java.util.Scanner;

public class MainClass {
     public static void main(String[] args) {
         
        //Setter and Getter
        System.out.println("====================================================");
        System.out.println("===============PROGRAM INSTACELERATES===============");
        System.out.println("====================================================");
        
        //Untuk kelas Story
         story stories = new story();
         System.out.println("\n---------------Story Informations------------------");
        
        //Input Foto Story
        Scanner inputFotoStory = new Scanner(System.in);
        System.out.println("\nMasukan foto story : ");
        String fotoSto = inputFotoStory.nextLine();

        //Input Tanggal Story
        Scanner inputTanggalStory = new Scanner(System.in);
        System.out.println("\nMasukan tanggal story : ");
        String tanggalSto = inputTanggalStory.nextLine();
        
        //Input Caption Story
        Scanner inputCaptionStory = new Scanner(System.in);
        System.out.println("\nMasukan caption story : ");
        String captionSto = inputCaptionStory.nextLine();
        
       
        //Output Foto Story
        System.out.println("\n=========Story Informations : ==========");
        System.out.println("Foto Story : " + fotoSto);
        stories.getFotoStory();
      
        //Output Tanggal Story
        System.out.println("Tanggal Story : " + tanggalSto);
        stories.getTanggalStory();
       
        //Output Caption Story
        System.out.println("Caption Story : " + captionSto);
        stories.getCaptionStory();
         
        System.out.println("=====================================================");
         
         
        
        
        //Untuk kelas Feed
        feed feeds = new feed();
        System.out.println("---------------Feed Informations------------------");
        
        //Input Foto Feed
        Scanner inputFotoFeed = new Scanner(System.in);
        System.out.println("\nMasukan foto feed : ");
        String fotoFee = inputFotoFeed.nextLine();
         
        //Input Caption Feed
        Scanner inputCaptionFeed = new Scanner(System.in);
        System.out.println("\nMasukan caption foto feed : ");
        String captionFee = inputCaptionFeed.nextLine();
        
        //Input Like Feed
        Scanner inputLikeFeed = new Scanner(System.in);
        System.out.println("\nMasukan total like foto feed : ");
        int likeFee = inputLikeFeed.nextInt();
        
        //Input Comments Feed
        Scanner inputCommentsFeed = new Scanner(System.in);
        System.out.println("\nMasukan comments foto feed : ");
        String commentsFee = inputCommentsFeed.nextLine();
        
        
        
        //Output Foto Feed
        System.out.println("\n\n=========Feed Informations : =========");
        System.out.println("Foto feed : " + fotoFee);
        feeds.getFotoFeed();
      
        //Output Caption Feed
        System.out.println("Caption feed : " + captionFee);
        feeds.getCaptionFeed();
       
        //Output Like Feed
        System.out.println("Total Like feed : " + likeFee);
        feeds.getLikeFeed();
        
        //Output Comments Feed
        System.out.println("Comments feed : " + commentsFee);
        feeds.getCaptionFeed();
         
        System.out.println("=====================================================");
        
     }
}
