/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bruno Araujo
 */
public class PostModel
{
    /* Value type variables */
    private String title;
    private String content;
    private int likes;
    
    /* Reference type variables (objects) */
    private Date moment;
    private ArrayList<Comment> listComments;

    /* Constructor */
    public PostModel()
    {
        
    }

    public PostModel(String title, String content, int likes, Date moment)
    {
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.moment = moment;
    }
    
    /* Class members */
    public void addComment(Comment c)
    {
        this.listComments.add(c);
    }
    
    public void removeComment(Comment c)
    {
        this.listComments.remove(c);
    }
    
    public void addAllComment(ArrayList<Comment> c)
    {
        this.listComments.addAll(c);
    }
    
    public void clearAllComment()
    {
        this.listComments.clear();
    }

    /* Getters & Setters */
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public int getLikes()
    {
        return likes;
    }

    public void setLikes(int likes)
    {
        this.likes = likes;
    }

    public Date getMoment()
    {
        return moment;
    }

    public void setMoment(Date moment)
    {
        this.moment = moment;
    }
}
