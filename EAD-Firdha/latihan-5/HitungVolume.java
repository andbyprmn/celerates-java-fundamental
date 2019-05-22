
package Celerates_Java_Fundamental;

public class HitungVolume {
    //Menghitung Volume Bola
    //Method Procedure
    public void bola(double diameter){
        double volumeBola = (Math.PI*Math.pow(diameter, 3))/6;
        System.out.println(volumeBola);
    }
    
    
    //Menghitung Volume Tabung
    //Method Procedure
    public void tabung (double tinggi, double diameter) {
        double volumeTabung = (Math.PI*tinggi*Math.pow(diameter, 2))/4;
        System.out.println(volumeTabung);
    }
    
    
    //Menghitung Volume Kerucut
    public void kerucut (double tinggi, double diameter) {
        double volumeKerucut = (Math.PI*tinggi*Math.pow(diameter, 2))/12;
        System.out.println(volumeKerucut);
    }
    
    
}
