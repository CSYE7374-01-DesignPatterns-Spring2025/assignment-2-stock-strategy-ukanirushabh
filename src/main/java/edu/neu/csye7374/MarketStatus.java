package edu.neu.csye7374;

/**
 * Market status indicator for trading hours
 * @author Rushabh
 */
public enum MarketStatus {
    OPEN("Market Open"),
    CLOSED("Market Closed"),
    HALTED("Trading Halted");
    
    private final String status;
    
    MarketStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return status;
    }
}