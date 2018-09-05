package com.schaldrac.rxjava.model;

public class Post
{
    public int userId;
    private int id ;
    public String title ;
    public String body;

    public Post() {
    }

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }


}
