package domain;

public class PostLogo {
    private int ownerId;
    private String imageUrl;
    private String groupName;
    private String postAction;
    private int data;

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


    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

}
