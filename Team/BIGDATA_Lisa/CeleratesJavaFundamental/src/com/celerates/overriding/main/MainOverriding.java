/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celerates.overriding.main;

import com.celerates.overriding.Anak;

/**
 *
 * @author Lisa Fita Sari
 */
public class MainOverriding {
    public static void main(String[] args){
        Anak objAnak = new Anak();
        objAnak.alamat();
        objAnak.alamatParent();
    }
}
