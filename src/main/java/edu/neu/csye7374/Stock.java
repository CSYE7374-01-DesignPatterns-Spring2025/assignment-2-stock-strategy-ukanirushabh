package edu.neu.csye7374;

/**
 * Base stock class with trading functionality
 * @author Rushabh
 */
public abstract class Stock {
    protected String symbol;
    protected double price;
    protected StockStrategy strategy;
    protected static MarketStatus marketStatus = MarketStatus.OPEN;

    public Stock(String symbol, double price) {
        if (price <= 0) {
            throw new TradingException("Initial price must be positive");
        }
        this.symbol = symbol;
        this.price = price;
    }

    public void setStrategy(StockStrategy strategy) {
        if (marketStatus != MarketStatus.OPEN) {
            System.out.println("Cannot change strategy - " + marketStatus);
            return;
        }
        if (strategy == null) {
            throw new TradingException("Trading strategy cannot be null");
        }
        this.strategy = strategy;
    }

    public void updatePrice() {
        if (marketStatus != MarketStatus.OPEN) {
            System.out.println("Cannot update price - " + marketStatus);
            return;
        }
        
        if (strategy == null) {
            throw new TradingException("No trading strategy set for " + symbol);
        }
        
        this.price = strategy.calculatePrice(this.price);
    }

    public void displayInfo() {
        System.out.printf("%s - Current Price: $%.2f%n", symbol, price);
    }

    public static void setMarketStatus(MarketStatus status) {
        if (status == null) {
            throw new TradingException("Market status cannot be null");
        }
        marketStatus = status;
        System.out.println("\n*** " + status + " ***\n");
    }
}