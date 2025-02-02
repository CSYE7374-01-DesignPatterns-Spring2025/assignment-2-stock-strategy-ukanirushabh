package edu.neu.csye7374;

/**
 * Bull market strategy implementation
 * @author Rushabh
 */
public class BullMarketStrategy implements StockStrategy {
    private static final double GROWTH_RATE = 0.05; // 5% growth in bull market

    @Override
    public double calculatePrice(double currentPrice) {
        return currentPrice * (1 + GROWTH_RATE);
    }
}