public class Main {
    public static void main(String[] args) {
        ChatClient chat = new ChatClient(new AES());
        chat.send("Hello Youssef");
    }
}