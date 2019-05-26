package celeratesjavafundamental;

public class PopulateObjek {
    
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
    
    public double voltabung(int diameter, int tinggi){
        int jarijari = diameter/2;
        double volume = Math.PI*Math.pow(jarijari,2)*tinggi;
        return volume;
    }
    
    public double volkerucut(int diameter, int tinggi){
         int jarijari = diameter/2;
         double volume = Math.PI*Math.pow(jarijari, 2)*tinggi*(0.333);
         return volume;
    }
    
    public double volbola(int diameter){
         int jarijari = diameter/2;
         double volume = Math.PI*Math.pow(jarijari, 3)*(1.333);
         return volume;
    }
}
