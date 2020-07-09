package domain;

public class RepostsInfo {
    private int repostId;
    private int repostCount;
    private boolean reposted;


    public int getRepostId() {
        return repostId;
    }
    public void setRepostId(int repostId) {
        this.repostId = repostId;
    }


    public int getRepostCount() {
        return repostCount;
    }
    public void setRepostCount(int repostCount) {
        this.repostCount = repostCount;
    }


    public boolean isReposted() {
        return reposted;
    }
    public void setReposted(boolean reposted) {
        this.reposted = reposted;
    }

}
