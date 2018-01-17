package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nbelayne on 1/16/18.
 */

public abstract class TweetMood {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TweetMood(Date newDate){
        this.date = newDate;
    }

    public TweetMood(){
        date = new Date();
    }

    public abstract String myMoodIs();
}