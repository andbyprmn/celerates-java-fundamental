package celeratesjavafundamental;

public class PopulateObjek {
    
    //deklarasi variabel
    int diameter;
    double tinggi = 10;

    //menghitung volume tabung
    public double volumeTabung(int diameter){
        double volTabung = Math.PI * Math.pow((diameter / 2) , 3) * tinggi;
        return volTabung;
        
    }
    
    //menghitung volume bola
    public double volumeBola(int diameter){
        double volBola = Math.PI * Math.pow((diameter / 2) , 3)*(4/3);
        return volBola;
        
    }
    
    //menghitung volume kerucut
    public double volumeKerucut(int diameter){
        double volKerucut = ( Math.PI * Math.pow((diameter / 2), 2) ) / 3;
        return volKerucut;
    }
}
    
    
