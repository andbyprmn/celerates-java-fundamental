package celeratesjavafundamental;

public class PopulateObject {
     // fungsi
    public double luasLingkaran(int diameter){
        int jari2 = diameter/2;
        double luas = Math.PI*Math.pow(jari2, 2);
        return luas;
    }
    
    // procedure
    public void hitungLuasLingkaran(int jari2){
        double luas = Math.PI*Math.pow(jari2, 2);
        System.out.println(luas);
    }
    
    // volume tabung
    void volumeTabung(double diameter, double tinggi) {
      double jari2 = diameter/2;
      double volumeT = (Math.PI * Math.pow(jari2, 2) * tinggi) / 3;
      System.out.println(volumeT);
    }
    
    // volume kerucut
    void volumeKerucut(double diameter, double tinggi) {
      double jari2 = diameter/2;
      double volumeK = (Math.PI*Math.pow(jari2, 2) * tinggi) / 3;
      System.out.println(volumeK);
    }
     
    // volume bola
    void volumeBola(double diameter) {
      double jari2 = diameter/2;
      double volumeB = (Math.PI*Math.pow(jari2, 2)) / 3;
      System.out.println(volumeB);
    }
}
