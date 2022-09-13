package it.euris.ires.examples.structural.proxy.example1;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterServiceImpl implements TwitterService {

    private static final String TWITTER_CONSUMER_KEY = "KEY";
    private static final String TWITTER_SECRET_KEY = "KEY";
    private static final String TWITTER_ACCESS_TOKEN = "TOKEN";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "TOKEN";

    @Override
    public String getTimeline(String screenName) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        StringBuilder builder = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    builder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return builder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println(message);
    }
}