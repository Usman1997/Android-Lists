package com.example.user.lists.models;

/**
 * Created by User on 10/8/2016.
 */

public class ListModel {

    String title = "";
    String description = "";
    int image;

    public ListModel(String title,String description,int image) {
        this.title = title;
        this.description = description;
        this.image =image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {

        return description;
    }
}
