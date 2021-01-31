/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Naveen Prasad
 */
public class user {
    private String username;
    private int userage;
    private Post posts[];

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the userage
     */
    public int getUserage() {
        return userage;
    }

    /**
     * @param userage the userage to set
     */
    public void setUserage(int userage) {
        this.userage = userage;
    }

    /**
     * @return the posts
     */
    public Post[] getPosts() {
        return posts;
    }

    /**
     * @param posts the posts to set
     */
    public void setPosts(Post[] posts) {
        this.posts = posts;
    }
    
}
