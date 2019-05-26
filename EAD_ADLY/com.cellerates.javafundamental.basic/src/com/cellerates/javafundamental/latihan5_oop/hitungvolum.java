/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.latihan5_oop;

/**
 *
 * @author Admin
 */
public class hitungvolum {
    
    public double volumeBola(int diameter){
        int radius = diameter/2;
        double volume = (4/3)*Math.PI*Math.pow(radius, 3);
        return volume; 
 
    }
}
