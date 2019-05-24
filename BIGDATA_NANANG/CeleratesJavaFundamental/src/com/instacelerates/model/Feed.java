package com.instacelerates.model;

public class Feed extends insta {
    private int like;
    private String comments;
   
    public int getLike(){
       return this.like;
	}
   
    public void setLike(int like){
       this.like = like;
       
       }
   
    public String getComments(){
       return this.comments;
	}
   
    public void setComments(String comments){
       this.comments = comments;
}
}