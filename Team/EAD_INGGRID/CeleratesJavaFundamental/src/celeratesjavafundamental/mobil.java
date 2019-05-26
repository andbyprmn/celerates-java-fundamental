
package celeratesjavafundamental;

/**
 *
 * @author Inggrid
 */
public class mobil { //merupakan objek mobil yang berisi atribut
     //berisi atribut. ini adalah atribut dari mobil
    String merkmobil = "toyota"; //penambahan variabel final agar tidak bisa di edit di main
    String warnamobil;
    String tipemobil;
    int maxSpeed = 20;
    String rangkamobil;
    
    //untuk pemanggilan variabel/atribut => namaobjek.merkmobil;
    //untuk pemanggilan method => namaobjek.run(); 
    
    //method prosedur
    
    void nyalakanMesin(String nyalaDariObjek){
        System.out.println("Mesin hidup");
    }
    
    void matikanMesin(){
        System.out.println("Mesin mati");  
    }
    
    //method function
    int kecepatanMobil(){
        if(maxSpeed == 20) return 50;
        return 70;
    }
    
    //penggunaan paramater kecepatan dan waktu
    int jarakTempuh(int kecepatan, int waktu){
        
        int hitungJarak = kecepatan*waktu; 
        
        return hitungJarak;
    }
    
    int waktuTempuh(int jarak, int kecepatan){
        
        int hitungTempuh = jarak/kecepatan;
        
        return hitungTempuh;
    }
}