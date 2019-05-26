package com.celerates.model;

public class Feed extends Insta{
    private String comments;
    private int like;

    // Setter collection
    public void setComments(String comments) { this.comments = comments; }
    public void setLike(int like) { this.like = like; }

    // Getter colletion
    public String getComments(){ return this.comments; }
    public int getLike(){ return this.like; }
}