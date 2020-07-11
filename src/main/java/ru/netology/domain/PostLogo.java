package ru.netology.domain;

public class PostLogo {
    private int ownerId;
    private String imageUrl;
    private String groupName;
    private String postAction;
    private int date;
    private boolean friendsOnly;


    public boolean isFriendsOnly() {
        return friendsOnly;
    }
    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }


    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }


    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    public String getPostAction() {
        return postAction;
    }
    public void setPostAction(String postAction) {
        this.postAction = postAction;
    }


    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }

}
