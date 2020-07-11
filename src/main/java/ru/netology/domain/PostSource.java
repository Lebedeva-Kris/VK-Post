package ru.netology.domain;

public class PostSource {
    private int sourceId;
    private String type;
    private String platform;
    private String date;
    private String url;


    public int getSourceId() {
        return sourceId;
    }
    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }


    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }


    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }


}
