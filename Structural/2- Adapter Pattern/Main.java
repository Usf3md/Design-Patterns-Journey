import Gmail.GmailClient;

public class Main {
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();
        emailClient.addProvider(new GmailProvider(new GmailClient()));
        emailClient.downloadEmails();
    }
}