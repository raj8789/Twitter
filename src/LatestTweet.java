import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.List;

public class LatestTweet {
    public  void latestTweet() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status1 : statuses) {
            System.out.println(status1.getUser().getName() + ":" +
                    status1.getText());
        }
    }
}
