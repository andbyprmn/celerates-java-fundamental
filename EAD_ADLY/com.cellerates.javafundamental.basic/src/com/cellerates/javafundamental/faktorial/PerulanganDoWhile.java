package com.celerates.faktorial;

/**
 *
 * @author andbyprmn
 */
public class PerulanganDoWhile {
    
    public static void main(String[] args) {
        double r = 1;
        do{
            r = Math.random();
            System.out.println(r);
        }
        while (r<0.99d);
    }
    
}
