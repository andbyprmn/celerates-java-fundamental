package latihan5;

public class PopulateObjek {
    
    //fungsi
    double jari2(double diameter){
        return diameter/2;
    }
    
    public double luasLingkaran(double diameter){
        double luas = Math.PI*Math.pow(jari2(diameter), 2);
        return luas;
    }
    
    //procedure
    public void hitungLuasLingkaran(double diameter){
        double luas = Math.PI*Math.pow(jari2(diameter), 2);
        System.out.println(luas);
    }
    
    //volume kerucut
    void volumeKerucut(double diameter, double tinggi){
        double volume = (Math.PI * Math.pow(jari2(diameter), 2) * tinggi) / 3;
        System.out.print("Volume Kerucut: "+volume+"\n");
    }
    
    //volume tabung
    void volumeTabung(double diameter, double tinggi){
        double volume = Math.PI * Math.pow(jari2(diameter), 2) * tinggi;
        System.out.print("Volume Tabung: "+volume+"\n");
    }
    
    //volume bola
    void volumeBola(double diameter){
        double volume = (4 * Math.PI * Math.pow(jari2(diameter), 3)) / 3;
        System.out.print("Volume Bola: "+volume+"\n");
    }
}
