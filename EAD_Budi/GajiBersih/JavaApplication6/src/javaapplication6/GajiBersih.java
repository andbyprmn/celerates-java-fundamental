/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class GajiBersih {
    public static void main(String[] args) {
    Scanner gaji = new Scanner(System.in);

    System.out.println("Masukan Gaji Kotor");
    int tax = 0;

    int salary = gaji.nextInt();
    tax = salary * 10/100;
    salary -= tax;
    
    

  
    System.out.println("Clean Salary: " + salary); 
  }
}
