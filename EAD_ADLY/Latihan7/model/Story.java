/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Story {
    private String foto; 
    private String tanggal; 
    private String caption; 

    
    //Remember: method getter dan setter harus diberikan 
    //modifier public karena akan diakses diluar kelas 
    
    // method getter
    public String getFoto() {
        return foto;
    }
    
    // method setter
    public void setFoto(String foto) {
        this.foto = foto;
    }

    //method getter
    public String getTanggal() {
        return tanggal;
    }
  
    //method setter
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    //method getter
    public String getCaption() {
        return caption;
    }

    //method setter
    public void setCaption(String caption) {
        this.caption = caption;
    }
 // method getter memiliki nilai kembalian sesuai dengan 
 // tipe data yang akan dikembalikan
 // method setter memiliki tugas untuk mengisi data kedalam
 // atribut atau variabel 
}
