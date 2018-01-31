/*
 * Tweet
 *
 * Version 1.0
 *
 * January 30th, 2018
 *
 * Copyright © 2018 Team X. CMPUT301. University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student
 * Behaviour at University of Alberta. You can find a copy of the license in this project.
 * Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author nbelayne
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     */
    Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Retrieve message
     *
     * @return message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     *  Retrieve date
     *
     * @return date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets tweets date
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Checks if important
     *
     * @return true or false
     */
    public abstract Boolean isImportant();

    /**
     * Combine message and date into to a string
     *
     * @return date and message
     */
    public String toString() {
        return date.toString() + " | " + message;
    }

}
