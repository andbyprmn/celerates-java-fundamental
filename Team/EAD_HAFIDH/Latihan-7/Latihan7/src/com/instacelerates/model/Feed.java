/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.instacelerates.model;

/**
 *
 * @author Hafidh Adhi
 */
public class Feed extends Insta{
    
    private int likeFeed;
    private String commentFeed;

    public int getLikeFeed() {
        return likeFeed;
    }

    public void setLikeFeed(int likeFeed) {
        this.likeFeed = likeFeed;
    }

    public String getCommentFeed() {
        return commentFeed;
    }

    public void setCommentFeed(String commentFeed) {
        this.commentFeed = commentFeed;
    }
}
