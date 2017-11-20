package com.example.manish.recycleviewexample.model;

import java.io.Serializable;

/**
 * Created by Manish on 11/18/2017.
 */

public class President implements Serializable{
    private String name,duration,wiki_url,number_of_president;
    private Integer image;
    public President(String name,String duration,String wiki_url,Integer image,String number_of_president)
    {
        this.name=name;
        this.duration=duration;
        this.wiki_url =wiki_url;
        this.image =image;
        this.number_of_president=number_of_president;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getWiki_url() {
        return wiki_url;
    }

    public void setWiki_url(String wiki_url) {
        this.wiki_url = wiki_url;
    }

    public String getNumber_of_president() {
        return number_of_president;
    }

    public void setNumber_of_president(String number_of_president) {
        this.number_of_president = number_of_president;
    }



}
