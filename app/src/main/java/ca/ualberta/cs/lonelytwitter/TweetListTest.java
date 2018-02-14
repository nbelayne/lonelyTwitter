package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by nbelayne on 2/13/18.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        Tweet tweet2 = new NormalTweet("deleting tweet");
        tweets.add(tweet2);
        Tweet tweet3 = new NormalTweet("help!!!");
        tweets.add(tweet3);
        tweets.getCount();
        assertEquals(3, 3);
        Tweet tweet4 = new NormalTweet("adding tweet");
        try{
            tweets.add(tweet4);
            assertTrue(false);
        }
        catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        //using index
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());

        ArrayList<Tweet> newList = tweets.getTweets();
        assertNotSame(newList, tweets);

    }

    public void testDeleteTweet(){

        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("hello");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }
}
