package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an normal tweet.
 *
 * @author nbelayne
 * @version 1.5
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs a NormalTweet object
     *
     * @param message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a NormalTweet object
     *
     * @param message
     * @param date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns false if object is an NormalTweet object
     *
     * @return false
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
