package com.instacelerates.model;

/**
 *
 * @author Nanang
 */
public class Feed {
    private String foto;
    private String caption;
    private int like;
    private String comments;

   public String getFoto(){
       return this.foto;
	}
   
   public void setFoto(String foto){
       this.foto = foto;
	}
   
   public String getCaption(){
       return this.caption;
	}
   
   public void setCaption(String caption){
       this.caption = caption;
       }
   
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