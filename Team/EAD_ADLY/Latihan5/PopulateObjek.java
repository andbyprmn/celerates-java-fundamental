package latihan5;

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
    
    
    public void hitungVolumBola(int diameter){
        int radius = diameter/2; 
        double volumeB = (1.33333)*Math.PI*Math.pow(radius, 3);
        System.out.println(volumeB);
    }
    
    public void hitungVolumKerucut(int diameter, int tinggi){
        int radius2 = diameter/2; 
        double volumeR = (0.333333)*Math.PI*Math.pow(radius2, 2)*tinggi;
        System.out.println(volumeR);
    }
    
    public void hitungVolumeTabung(int diameter, int tinggi){
        int radius3 = diameter/2;
        double volumeT = Math.PI*Math.pow(radius3, 2) * tinggi;
        System.out.println(volumeT);
    }
    
}
