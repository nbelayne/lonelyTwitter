package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nbelayne on 1/16/18.
 */

public class isAngry extends TweetMood {

    public isAngry(Date newDate){
        super(newDate);
    }

    public isAngry(){
        super();
    }

    public String myMoodIs(){
        String angry = "I'm feally soooo ANGRY right now!!!!!";
        return angry;
    }
}
