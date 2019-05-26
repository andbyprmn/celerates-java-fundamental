package celeratesjavafundamental;

public class HitungVolume {
       
    //fungsi
    public double luasLingkaran(int diameter){
        int jari2 = diameter/2;
        double luas = Math.PI*Math.pow(jari2, 2);
        return luas;
    }
    
    //procedure
    public void hitungLuasLingkaran(int jari2){
        double luas = Math.PI*Math.pow(jari2, 2);
        System.out.println(luas);
    }
    //Volume bola
     public void hitungVolumeBola(double diameter){
        double volume = Math.PI*Math.pow(diameter/2, 3)*4/3;
        System.out.println(volume);
     }
     
     //Volume tabung
     public void hitungVolumeTabung(double diameter, double tinggi){
        double volume = Math.PI*Math.pow(diameter/2, 2)*tinggi;
        System.out.println(volume);
         }
     
     //Volume kerucut
     public void hitungVolumeKerucut(double diameter, double tinggi){
        double volume = Math.PI*Math.pow(diameter/2, 2)*tinggi/3;
        System.out.println(volume);
}
}
