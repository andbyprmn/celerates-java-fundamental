
import java.util.Scanner;
import model.Feed;
import model.Story;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {

  
    public static void main(String[] args) {
        
        //mendeklarasi objek baru
        Story stories = new Story();
        Feed feeds = new Feed();
        
        //menggunakan method setter 
        stories.setFoto("About Us");
        stories.setTanggal("05-05-2019");
        stories.setCaption("#CeleratesYourWay");
                
        //menggunakan method setter 
        feeds.setFoto("English day");
        feeds.setCaption("#CeleratesYourWay");
        feeds.setLike(57);
        feeds.setComments("interesting");
        
        
        //menggunakan method getter 
        System.out.println("foto story: "  +stories.getFoto());
        System.out.println("tanggal story: " +stories.getTanggal());
        System.out.println("caption story: " +stories.getCaption());
        System.out.println();
        //menggunakan method 
        System.out.println("foto feed: " +feeds.getFoto());
        System.out.println("caption feed: "+feeds.getCaption());
        System.out.println("Like dalam feed: "+feeds.getLike());
        System.out.println("comments feed: "+feeds.getComments());
    }
    
}
