package ru.netology.domain.attachment;

public class Answers {
    private int id;
    private String text;
    private int votes;
    private int rate;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }


    public int getVotes() {
        return votes;
    }
    public void setVotes(int votes) {
        this.votes = votes;
    }


    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

}
