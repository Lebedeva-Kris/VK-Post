package ru.netology.domain;

public class Post {
    private int signerId;
    private String photoUrl;
    private String postType;
    private boolean read;
    private boolean favorite;


    public boolean isFavorite() {
        return favorite;
    }
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }


    public int getSignerId() {
        return signerId;
    }
    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }


    public String getPhotoUrl() {
        return photoUrl;
    }
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }


    public String getPostType() {
        return postType;
    }
    public void setPostType(String postType) {
        this.postType = postType;
    }


    public boolean isRead() {
        return read;
    }
    public void setRead(boolean read) {
        this.read = read;
    }

}
