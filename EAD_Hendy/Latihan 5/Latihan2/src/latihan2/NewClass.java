/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;


/**
 *
 * @author hendy nurfriyanto
 */
public class NewClass {
    
   public void bola(int diameter){
    int radius = diameter/2;
    double v = (1.333)*Math.PI*Math.pow(radius,3);
       System.out.println(v);
    }
   
    public void tabung (double tinggi, double diameter) {
        double volumeT = (Math.PI*tinggi*Math.pow(diameter, 2))/4;
        System.out.println(volumeT);
    }
    
    public void kerucut(int diameter){
    int radius = diameter/2;
    double volumekeru = (Math.PI*Math.pow(radius,3))/3;
        System.out.println(volumekeru);
    }
}