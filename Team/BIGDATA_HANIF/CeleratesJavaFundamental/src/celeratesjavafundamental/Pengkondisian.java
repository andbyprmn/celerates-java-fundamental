/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

import java.util.Scanner;

/**
 *
 * @author Muhammad Hanif
 */
public class Pengkondisian {
    public static void main(String[] args) {
        //if, else if & else
        System.out.print("input if, else if, & else: ");
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        if (a > 100){
            System.out.println("Statement 1");
        }
        else if (a > 50){
            System.out.println("Statement 2");
        }
        else{
            System.out.println("Statement 3");
        }
        
        //switch case
        System.out.print("input switch-case: ");
        int b = s.nextInt();
        
        switch (b){
            case 1:
                System.out.println("Switch 1");
                break;
            case 2:
                System.out.println("Switch 2");
                break;
            case 3:
                System.out.println("Switch 3");
                break;
            case 4:
                System.out.println("Switch 4");
                break;
            default:
                System.out.println("switch default");
        }
    }
    
}
