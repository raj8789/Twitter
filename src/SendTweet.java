import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class SendTweet {
    public static void main(String[] args) throws TwitterException {
        String tw="";
        for (int i=0;i< args.length;i++)
        {
            tw=tw+args[i];
            tw=tw+"  ";
        }
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = null;
        try {
            status = twitter.updateStatus(tw);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        System.out.println("Successfully updated the status to [" + status.getText() + "].");
    }
}
