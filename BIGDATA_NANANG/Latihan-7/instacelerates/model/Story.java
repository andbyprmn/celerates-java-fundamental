package com.instacelerates.model;

/**
 *
 * @author Nanang
 */
public class Story {
   private String foto;
   private String tgl;
   private String caption;
    
   public String getFoto(){
       return this.foto;
	}
   
   public void setFoto(String foto){
       this.foto = foto;
	}
   
    public String getTgl(){
       return this.tgl;
	}
   
    public void setTgl(String tgl){
       this.tgl = tgl;
    }
    
   public String getCaption(){
       return this.caption;
	}
   
   public void setCaption(String caption){
       this.caption = caption;
       
       
     }
}