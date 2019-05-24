/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instacelerates;
import java.io.IOException;
import static java.lang.System.in;
import java.util.Scanner;
import model.feed;
import model.story;

/**
 *
 * @author ACER
 */
public class Main {
    private static Scanner sc;
     public static void main(String[] args) throws IOException {
         
         
         
		sc = new Scanner(System.in);
                System.out.println(" **************************************************************** ");
                System.out.println("Selamat Datang di Program InstaCelerates");
                System.out.println(" **************************************************************** ");
		
         
       story insta = new story(); 
         System.out.println(" Masukan Foto Story: ");
         insta.setFoto  (sc.nextLine());
         System.out.println(" Masukan Tanggal Story: ");
         insta.setTanggal (sc.nextLine());
         System.out.println(" Masukan Caption Story: ");
         insta.setCaption (sc.nextLine());         
         
         feed gram = new feed();  
         System.out.print(" Masukan Foto Feed: ");
         gram.setFotoFeed (sc.nextLine());
         System.out.print(" Masukan Caption Feed: ");
         gram.setCaptionFeed(sc.nextLine());
         System.out.print(" Masukan Comments Feed: ");
         gram.setCommentsFeed(sc.nextLine());
         System.out.print(" Masukan Like Feed: ");
         gram.setLikeFeed(sc.nextInt());
         
         
         System.out.println("Foto Story: " + insta.getFoto());
	 System.out.println("Tanggal Story: " + insta.getTanggal() );
	 System.out.println("Caption Story: " + insta.getCaption());
         
         System.out.println("Foto Feed : " + gram.getFotoFeed());
         System.out.println("Caption Feed: " + gram.getCaptionFeed());
         System.out.println("Like Feed: " + gram.getLikeFeed());
         System.out.println("Comments Feed: " + gram.getCommentsFeed());
      //   System.exit(0);
    }
}
