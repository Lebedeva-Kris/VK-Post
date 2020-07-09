package domain;

public class PostLogo {
    private int id;
    private String imageUrl;
    private String groupName;
    private String postAction;
    private int postData;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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


    public int getPostData() {
        return postData;
    }
    public void setPostData(int postData) {
        this.postData = postData;
    }

}
