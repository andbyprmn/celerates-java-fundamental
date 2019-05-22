/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cth5;
/**
 *
 * @author ACER
 */
class PopulateObjek {
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
    
    public void hitungVolumeTabung(double jari2, double height){
        double Volume = ((22*jari2*jari2*height)/7);
        System.out.format("\n The Volume of a Cyclinder = %.2f\n ", Volume);
}
  public void hitungVolumeKerucut(double jari2, double height){
        double Volume = (1.0/3) * Math.PI  * jari2 * jari2 * height;
        System.out.format("\n The Volume of a Cone = %.2f\n ", Volume);
}
    public void hitungVolumeBola(double jari2){
        double Volume = (4*22*jari2*jari2*jari2)/(3*7);
        System.out.format("\n The Volume of a Sphere = %.2f\n ", Volume);
}
   
}