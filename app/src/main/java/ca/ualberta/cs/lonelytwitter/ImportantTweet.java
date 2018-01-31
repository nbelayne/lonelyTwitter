package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an important tweet.
 *
 * @author nbelayne
 * @version 1.5
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Constructs an ImportantTweet object
     *
     * @param message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an ImportantTweet object
     *
     * @param message
     * @param date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns true if object is an ImportantTweet object
     *
     * @return true
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
