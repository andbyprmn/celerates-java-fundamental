/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;

/**
 *
 * @author Mirfangg
 */
public class OperatorAritmatika {
    public static void main(String[] args) {
        // Addition (+)
        int sum1 = 40 + 20;
        int sum2 = sum1 + 15;
        int sum3 = sum2 + sum1;
        System.out.println(sum3); // outputs 135
           
        // Substraction (-)
        int kurs1 = 100 - 25;
        int kurs2 = kurs1 - 10;
        int kurs3 = kurs2 - 5;
        System.out.println(kurs3); // outputs 60
                   
        // Multiplication (*)
        int mul1 = 100 * 3;
        int mul2 = mul1 * 2;
        int mul3 = mul2 * 10;
        System.out.println(mul3); // outputs 6000
        
        // Division (/)
        int div1 = 200 / 5;
        int div2 = div1 / 10;
        int div3 = div2 / 2;
        System.out.println(div3); // outputs 2
        
        // Modulo
        int mod = 15;
        int res = mod % 6;
        System.out.println(res);
    }
}
