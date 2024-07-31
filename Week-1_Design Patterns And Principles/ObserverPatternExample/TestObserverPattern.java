package ObserverPatternExample;

// TestObserverPattern.java
public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Set stock price and notify observers
        stockMarket.setStockPrice(100.0);
        stockMarket.setStockPrice(105.5);

        // Remove an observer and notify again
        stockMarket.removeObserver(webApp);
        stockMarket.setStockPrice(110.0);
    }
}
