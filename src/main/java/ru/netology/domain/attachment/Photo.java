package ru.netology.domain.attachment;

public class Photo {
    private int id;
    private int albumId;
    private int ownerId;
    private int userId;
    private int date;
    private String text;
    private int width;
    private int height;
    private Sizes[] size;


    public Sizes[] getSize() {
        return size;
    }
    public void setSize(Sizes[] size) {
        this.size = size;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public int getAlbumId() {
        return albumId;
    }
    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }


    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }


    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }


    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }


    public java.lang.String getText() {
        return text;
    }
    public void setText(java.lang.String text) {
        this.text = text;
    }


    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }


    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }


}
