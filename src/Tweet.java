import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Tweet {
    private String date;
    private String time;
    private String text;
    private int retweets;
    private int likes;
    
    /**
     * 
     * @param date A YYYY/MM/DD format of the date
     * @param time The time in HH:MM:SS format
     * @param text The text of the tweet
     * @param retweets How many retweets the tweet has
     * @param likes How many likes the tweet has
     */
    public Tweet(String date, String time, String text, int retweets, int likes) {
        this.date = date;
        this.time = time;
        this.text = text;
        this.retweets = retweets;
        this.likes = likes;
    }
    
    /**
     * Load in all of the Nintendo America tweets from the
     * text file provided with the assignment
     * @return An array of all tweets
     */
    public static Tweet[] getAllTweets() {
        ArrayList<Tweet> tweets = new ArrayList<Tweet>();
        File file = new File("Data/tweets.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String date = br.readLine();
            while (date != null) {
                String time = br.readLine();
                String text = br.readLine();
                int retweets = Integer.parseInt(br.readLine());
                int likes = Integer.parseInt(br.readLine());
                Tweet tweet = new Tweet(date, time, text, retweets, likes);
                tweets.add(tweet);
                date = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Tweet[] ret = new Tweet[tweets.size()];
        for (int i = 0; i < tweets.size(); i++) {
            ret[i] = tweets.get(i);
        }
        return ret;
    }
    
    
    /**
     * Setup a toString method in the tweets that prints out 
     *      date, time
     *      retweets =  number of retweets
     *      likes =  number of likes
     *      text
     * Then, use this method to loop through the first five tweets in 
     * the list and print them out using the toString method
     * @param tweets An array of tweets
     */
    public static void printFirstFive(Tweet[] tweets) {
        // TODO: Fill this in
    }
    
    /**
     * Setup a comparator that sorts the tweets in ascending order
     * by date, and print out the first 5 tweets in order by date
     * @param tweets An array of tweets
     */
    public static void printFirstFiveByDate(Tweet[] tweets) {
        // TODO: Fill this in
    }
    
    /**
     * Find the tweet with the most likes
     * @param tweets An array of tweets
     * @return The tweet with the most likes
     */
    public static Tweet getMostPopularTweet(Tweet[] tweets) {
        return null; // TODO: fill this in
    }
    
    /**
     * Print out the 200 words that are used the most
     * @param tweets An array of tweets
     */
    public static void printMostUsedWords(Tweet[] tweets) {
        
    }
    
    public static void main(String[] args) {
        Tweet[] tweets = Tweet.getAllTweets();
        // TODO: Call your methods to test them
    }
}
