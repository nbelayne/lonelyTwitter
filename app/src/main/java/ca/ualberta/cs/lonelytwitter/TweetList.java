package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by nbelayne on 2/13/18.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){

        tweets.add(tweet);
    }

    public void addTweet(Tweet tweet){
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        else{
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet){

        for(Tweet newTweet : tweets){
            if(newTweet.getMessage().equals(tweet.getMessage())
                    && newTweet.getDate().equals(tweet.getDate())){
                return true;
            }
        }
        return false;
    }

    public Tweet getTweet(int index){

        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){

        Collections.sort(tweets, new Comparator<Tweet>() {
            @Override
            public int compare(Tweet tweet1, Tweet tweet2) {
                return tweet1.getDate().compareTo(tweet2.getDate());
            }
        });

        return tweets;
    }

    public void delete(Tweet tweet){

        tweets.remove(tweet);
    }

    public int getCount(){

        return tweets.size();
    }
}
