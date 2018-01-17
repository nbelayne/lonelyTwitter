package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by nbelayne on 1/16/18.
 */

public class IsHappy extends TweetMood {
    public IsHappy(Date newDate){
        super(newDate);
    }

    public IsHappy(){
        super();
    }

    public String myMoodIs(){
        String happy = "I'm feally soooo HAPPY right now!!!!!";
        return happy;
    }

}
