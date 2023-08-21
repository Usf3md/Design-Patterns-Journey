import java.util.List;

public class TwitterApi {
    private String appKey;
    private String appSecret;

    public TwitterApi(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public List<Tweet> getRecentTweets() {
        TwitterClient twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(getAccessToken());
    }

    private String getAccessToken() {
        OAuth oAuth = new OAuth();
        String requestToken = oAuth.requestToken(appKey, appSecret);
        return oAuth.getAccessToken(requestToken);
    }
}
