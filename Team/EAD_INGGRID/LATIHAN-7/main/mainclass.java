
package main;

import com.latihan.model.Feed;
import com.latihan.model.Story;

/**
 *
 * @author Inggrid
 */
public class mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("PROGRAM LATIHAN DENGAN ENKAPSULASI\n");
        
        Story inistory = new Story();
        Feed inifeed = new Feed();
        
        inistory.setFoto("Foto tersenyum");
        System.out.println("Foto Story : " + inistory.getFoto());
        inistory.setTgl("17 Agustus 2018");
        System.out.println("Tanggal    : " + inistory.getTgl());
        inistory.setCaption("Dirgahayu Indonesia!");
        System.out.println("Caption    : " + inistory.getCaption());
        
        inifeed.setFoto("Foto pemandangan");
        System.out.println("\nFoto Feed  : " + inifeed.getFoto());
        inifeed.setCaption("nikmat Tuhan mana lagi yang kau dustakan?");
        System.out.println("Caption    : " + inifeed.getCaption());
        inifeed.setLike(3017);
        System.out.println("Like       : " + inifeed.getLike());
        inifeed.setComment("heart warming banget fotonya<3");
        System.out.println("Comment    : " + inifeed.getComment());
        
    }
    
}
