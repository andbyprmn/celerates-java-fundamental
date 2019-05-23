package com.celerates.model;

public class Story {
    private String foto, tanggal, caption;

    // Setter collection
    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }

    // Getter collection
    public String getFoto() {
        return this.foto;
    }

    public String getCaption(){
        return this.caption;
    }

    public String getTanggal(){
        return this.tanggal;
    }
}