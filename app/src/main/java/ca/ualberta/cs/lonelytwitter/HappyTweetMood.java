package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a happy tweet.
 *
 * @author nbelayne
 * @version 1.5
 * @see TweetMood
 */

public class HappyTweetMood extends TweetMood {

    /**
     * Constructs an HappyTweetMood object
     */
    public HappyTweetMood(Date newDate){
        super(newDate);
    }

    /**
     * Constructs an HappyTweetMood object
     */
    public HappyTweetMood(){
        super();
    }

    /**
     * Returns a string that describes the mood
     *
     * @return happy string describing the mood of a HappyTweetMood object
     */
    public String myMoodIs(){
        String happy = "I'm feally soooo HAPPY right now!!!!!";
        return happy;
    }

}
