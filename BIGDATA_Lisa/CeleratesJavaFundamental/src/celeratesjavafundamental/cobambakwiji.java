/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;
import java.util.Scanner;
/**
 *
 * @author Lisa Fita Sari
 */
public class cobambakwiji {
   

    public static void main(String[] args) {
        

Double a;


Scanner gaji = new Scanner(System.in);
System.out.println("masukan nilai gaji");
a=gaji.nextDouble();


if(a == 2000000 ){
    System.out.println("jasa didapat ="+ 100000*0.1*a); 
}else if(a>2000000 && a<5000000){
	System.out.println("jasa didapat ="+ 200000*0.2*a);
}else{
	System.out.println("jasa didapat ="+ 300000*0.2*a);
	}

    }
}
