package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an angry tweet.
 *
 * @author nbelayne
 * @version 1.5
 * @see TweetMood
 */
public class AngryTweetMood extends TweetMood {

    /**
     * Constructs an AngryTweetMood object
     *
     * @param newDate
     */
    public AngryTweetMood(Date newDate){
        super(newDate);
    }

    /**
     * Constructs an AngryTweetMood object
     */
    public AngryTweetMood(){
        super();
    }

    /**
     * Returns a string that describes the mood
     *
     * @return angry string describing the mood of an AngryTweetMood object
     */
    public String myMoodIs(){
        String angry = "I'm feally soooo ANGRY right now!!!!!";
        return angry;
    }
}
