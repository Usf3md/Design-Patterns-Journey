import Gmail.GmailClient;

public class GmailProvider implements EmailProvider {
    GmailClient gmailClient;

    public GmailProvider(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }

}
