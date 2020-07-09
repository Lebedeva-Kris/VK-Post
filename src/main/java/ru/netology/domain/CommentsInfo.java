package ru.netology.domain;

public class CommentsInfo {
    private int commentId;
    private int commentCount;
    private boolean canComment;


    public int getCommentId() {
        return commentId;
    }
    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }


    public int getCommentCount() {
        return commentCount;
    }
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }


    public boolean isCanComment() {
        return canComment;
    }
    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

}
