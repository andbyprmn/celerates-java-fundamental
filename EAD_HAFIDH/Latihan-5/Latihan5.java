/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author Hafidh Adhi
 */
public class Latihan5 {
    public static void main(String[] args) {
        HitungVolume bangun = new HitungVolume();
        
        System.out.println("====================================================");
        System.out.println("PROGRAM PENGHITUNG VOLUME TABUNG, KERUCUT, DAN BOLA");
        System.out.println("====================================================");
        
        bangun.bgnTabung();
        bangun.bgnKerucut();
        bangun.bgnBola();
    }
}
