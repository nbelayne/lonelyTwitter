package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Contains two methods that retrieve the parameters of a tweet
 *
 * @author nbelayne
 * @version 1.5
 * @see Tweet
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
