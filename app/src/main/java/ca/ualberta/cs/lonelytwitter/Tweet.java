package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/**
 * Created by nbelayne on 1/16/18.
 */

public abstract class Tweet {
    private String message;
    private Date date;

    Tweet(String message){
        this.message = message;
        date = new Date();
    }

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String newMessage) throws TweetTooLongException{
        if (newMessage.length() < 160){
            this.message = newMessage;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date newDate){
        this.date = newDate;
    }

    public abstract Boolean isImportant();
}
