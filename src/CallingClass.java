import twitter4j.TwitterException;
public class CallingClass {
    public static void main(String[] args) {
        LatestTweet lt=new LatestTweet();
        SendTweet st=new SendTweet();
        int ch=Integer.parseInt(args[0]);
        if(ch==1)
        {
            try {
                st.sendTweet(args);
            } catch (TwitterException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                lt.latestTweet();
            } catch (TwitterException e) {
                e.printStackTrace();
            }
        }
    }
}
