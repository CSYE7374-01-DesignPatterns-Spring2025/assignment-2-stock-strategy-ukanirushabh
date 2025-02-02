package edu.neu.csye7374;

/**
 * Strategy interface for calculating stock prices
 * @author Rushabh
 */
public interface StockStrategy {
    /**
     * Calculates the new stock price based on the strategy
     * @param currentPrice Current price of the stock
     * @return New calculated price
     */
    double calculatePrice(double currentPrice);
}