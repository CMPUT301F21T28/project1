package com.example.addevent;

public class event {
    private String name;
    private int eventId;
    private String comments;
    private int imageId;
    public event(String name,int eventId){
        this.name = name;
        this.eventId = eventId;
    }
    public event(String name,int eventId,String comments){
        this.name = name;
        this.eventId = eventId;
        this.comments = comments;
    }
    public event(String name,int eventId,String comments,int imageId){
        this.name = name;
        this.eventId = eventId;
        this.comments = comments;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getEventId() {
        return eventId;
    }

    public String getComments() {
        return comments;
    }

    public int getImageId() {
        return imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
