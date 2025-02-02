package edu.neu.csye7374;

/**
 * Custom exception for trading operations
 * @author Rushabh
 */
public class TradingException extends RuntimeException {
    public TradingException(String message) {
        super("Trading Error: " + message);
    }
}