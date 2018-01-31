package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a the mood of a tweet.
 *
 * @author nbelayne
 * @version 1.5
 * @see AngryTweetMood
 * @see HappyTweetMood
 */
public abstract class TweetMood {
    private Date date;

    /**
     * Retrieves date
     *
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets tweet date
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Constructs a TweetMood object
     *
     * @param newDate
     */
    public TweetMood(Date newDate){
        this.date = newDate;
    }

    /**
     * Constructs a TweetMood object
     */
    public TweetMood(){
        date = new Date();
    }

    /**
     * Returns string that describes the mood
     */
    public abstract String myMoodIs();
}