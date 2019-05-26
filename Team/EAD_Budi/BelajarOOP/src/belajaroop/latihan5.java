/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaroop;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class latihan5 {
    private static Scanner sc;

	public static void main(String[] args) {
		double radius, height;
		sc = new Scanner(System.in);
	
		System.out.println(" Please Enter the Radius and Height of a Cone : ");
		radius = sc.nextDouble();
		height = sc.nextDouble();
		
		VolumeOfCone(radius, height);

	}
	public static void VolumeOfCone(double radius, double height) {
		double length, SA, Volume, LSA;
		length = Math.sqrt(radius * radius + height * height);
		SA = Math.PI  * radius * (radius + length);
		Volume = (1.0/3) * Math.PI  * radius * radius * height;
		LSA = Math.PI  * radius * length;
		
		System.out.format(" The Length of a Side (Slant)of a Cone = %.2f", length);   
		System.out.format("\n The Surface area of a Cone = %.2f", SA);
		System.out.format("\n The Volume of a Cone = %.2f", Volume);
		System.out.format("\n The Lateral Surface area of a Cone = %.2f", LSA);
	}

}
