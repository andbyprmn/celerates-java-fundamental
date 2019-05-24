/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author hendy nurfriyanto
 */
public class ubahtipedata {
     public static void main(String[] args){
        //Default Variable
        String air = "100";
        int api = 100;
        
        //Konversi Data String ke Integer
        int padamkan = api - Integer.parseInt(air);
        System.out.println("Persentase Api: "+padamkan+"%");
    }
}
