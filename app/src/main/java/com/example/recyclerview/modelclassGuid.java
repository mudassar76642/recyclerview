package com.example.recyclerview;

public class modelclassGuid {
    String name;
    int picture;
    int upvote;

    public modelclassGuid(String name, int picture, int upvote) {
        this.name = name;
        this.picture = picture;
        this.upvote = upvote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getUpvote() {
        return upvote;
    }

    public void setUpvote(int upvote) {
        this.upvote = upvote;
    }
}
