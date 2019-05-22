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
    
   public void bola(double diameter){
    double r = diameter/2;
    double v = (4/3)*Math.PI*Math.pow(r,3);
       System.out.println(v);
    }
   
    public void tabung (double tinggi, double diameter) {
        double vT = (Math.PI*tinggi*Math.pow(diameter, 2))/4;
        System.out.println(vT);
    }
    
    public void kerucut(int diameter){
    int r = diameter/2;
    double vk = (Math.PI*Math.pow(r,3))/3;
        System.out.println(vk);
    }
}