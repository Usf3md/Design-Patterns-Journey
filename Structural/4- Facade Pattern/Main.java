public class Main {
  public static void main(String args[]) {
    TwitterApi client = new TwitterApi("appKey", "secret");
    client.getRecentTweets();
  }
}
