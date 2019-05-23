package com.celerates.model;

public class Feed {

    private String foto1, caption1, comments;
    private int like;

    // Setter collection
    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public void setCaption1(String caption1) {
        this.caption1 = caption1;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setLike(int like) {
        this.like = like;
    }

    // Getter colletion
    public String getFoto1(){
        return this.foto1;
    }

    public String getCaption1(){
        return this.caption1;
    }

    public String getComments(){
        return this.comments;
    }

    public int getLike(){
        return this.like;
    }
}
