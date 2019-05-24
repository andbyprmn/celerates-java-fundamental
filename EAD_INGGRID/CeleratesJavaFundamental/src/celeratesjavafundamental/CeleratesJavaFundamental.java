
package celeratesjavafundamental;
//import java.io --> merupakan library yang ingin digunakan
/**
 *
 * @author Inggrid
 */
        
public class CeleratesJavaFundamental { //merupakan kelas
//SENSITIVE CASE
//HANYA BOLEH ADA 1 VOID MAIN DI JAVA
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //merupakan method
        
        //int jarak = 90;
        //int kecepatan = 60;
        //int waktu = 3600;
    
        
        mobil namaobjek = new mobil(); //penamaan variabel namaobjek terserah dengan user. tidak harus
        //nama objek.
        
        //kegunaannya untuk mengubah value yang ada di mobil
        //tapi jika tidak ingin ada perubahan bisa langsung dilakukan print
        namaobjek.merkmobil = "toyota";
        namaobjek.rangkamobil = "AE1797";
        namaobjek.warnamobil = "Maroon";
               
        //namaobjek.merkmobil = "Honda"; contoh cara mengganti value didalam fungsi main
        //String merkmobil = namaobjek.merkmobil;
        
        System.out.println(namaobjek.merkmobil+" "+namaobjek.warnamobil+" "+namaobjek.rangkamobil);
        
        //memanggil method prosedur pada objek mobil
        //dengan penggunaan parameter
        String nyala = "Nyalakan Mesin!";
        namaobjek.nyalakanMesin(nyala);
        namaobjek.matikanMesin();
        
        //cara pemanggilan dari method function dibagi jadi 3
//       1. int kecepatanMobil = namaobjek.kecepatanMobil();
//        System.out.println(namaobjek.kecepatanMobil());
        
        int kecepatanMobil = namaobjek.kecepatanMobil(); //bisa juga dipanngil seperti ini
        System.out.println(kecepatanMobil);

//dibawah ini contoh yang ketiga
        //System.out.println("kecepatan mobil = " + namaobjek.kecepatanMobil());
        System.out.println("jarak tempuh = " + namaobjek.jarakTempuh(60, 3600/60)); //dipanggil langsung seperti ini juga bisa
        System.out.println("waktu tempuh = " + namaobjek.waktuTempuh(90, 60));
        
    }
    
}
