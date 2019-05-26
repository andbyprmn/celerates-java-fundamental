/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.Feed;
import Model.Story;

/**
 *
 * @author Lisa Fita Sari
 */
public class mainclass {
    public static void main(String[] args){
        Story story = new Story();
        Feed feed = new Feed();
        
        //memanggil objek Story
        story.setFoto("Foto Story terbaru!");
        System.out.println("Foto Story : " + story.foto);
        
        story.setTanggal("23 Mei 2019");
        System.out.println("Tanggal Story : " + story.tanggal);
        
        story.setCaption("Hari ini panas banget ya, semoga neraka gak bocor");
        System.out.println("Caption Story : " + story.caption);
        
        //memanggil objek Feed
        feed.setFoto("Foto Feed terbaru!");
        System.out.println("Foto feed : " + feed.foto);
        
        feed.setCaption("Panas sih, tapi puasa harus tetep penuh dong");
        System.out.println("Caption feed : " + feed.caption);
        
        feed.setLike(160789);
        System.out.println("Jumlah Likes" + feed.like + " likes");
        
        feed.setComments("Semangat yaa!");
        System.out.println("Comments feed : " + feed.comments);
        
        
    }
}
