package edu.neu.csye7374;

/**
 * Bear market strategy implementation
 * @author Rushabh
 */
public class BearMarketStrategy implements StockStrategy {
    private static final double DECLINE_RATE = 0.03; // 3% decline in bear market

    @Override
    public double calculatePrice(double currentPrice) {
        return currentPrice * (1 - DECLINE_RATE);
    }
}