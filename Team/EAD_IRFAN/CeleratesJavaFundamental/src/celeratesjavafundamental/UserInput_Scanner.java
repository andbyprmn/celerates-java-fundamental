/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celeratesjavafundamental;
import java.util.Scanner;

/**
 *
 * @author Mirfangg
 */
public class UserInput_Scanner {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String userName;
        
        // Enter username and press enter
        System.out.println("Enter username here:"); 
        userName = myScan.nextLine(); 
        
        System.out.println("Username is: " + userName);
    }
}
