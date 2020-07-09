package ru.netology.domain;

public class LikesInfo {
    private int likeId;
    private int count;
    private boolean like;


    public int getLikeId() {
        return likeId;
    }
    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }


    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }


    public boolean isLike() {
        return like;
    }
    public void setLike(boolean like) {
        this.like = like;
    }

}
