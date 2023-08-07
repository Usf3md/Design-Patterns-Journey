public class Main {
    public static void main(String[] args) {
        Stock iphone = new Stock("M", 100);
        Stock samsung = new Stock("S", 80);
        Stock xiaomi = new Stock("X", 50);
        Stock nokia = new Stock("N", 20);

        StatusBar statusBar = new StatusBar();
        statusBar.addStock(iphone);
        statusBar.addStock(samsung);
        statusBar.addStock(xiaomi);
        statusBar.addStock(nokia);

        iphone.setPrice(1000);
        iphone.setPrice(110);
    }
}