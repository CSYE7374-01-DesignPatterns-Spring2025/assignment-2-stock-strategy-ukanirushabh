package edu.neu.csye7374;

/**
 * Driver class demonstrates the Stock Strategy pattern implementation
 * @author Rushabh
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        try {
            // Create stock instances
            Stock tesla = new TechStock("TESLA", 100.0);
            Stock apple = new TechStock("APPLE", 150.0);

            // Create market strategies
            StockStrategy bullMarket = new BullMarketStrategy();
            StockStrategy bearMarket = new BearMarketStrategy();

            // Display initial prices
            System.out.println("Initial Stock Prices (Before Strategy):");
            tesla.displayInfo();
            apple.displayInfo();

            // Demonstrate Strategy Pattern - Initial Application
            System.out.println("\nApplying Initial Strategies:");
            System.out.println("TESLA → Bull Market Strategy");
            System.out.println("APPLE → Bear Market Strategy");
            
            tesla.setStrategy(bullMarket);    // Tesla in bull market
            apple.setStrategy(bearMarket);     // Apple in bear market
            
            tesla.updatePrice();
            apple.updatePrice();
            
            System.out.println("\nAfter First Trading Day:");
            tesla.displayInfo();
            apple.displayInfo();

            // Demonstrate Strategy Pattern - Dynamic Strategy Switch
            System.out.println("\nDemonstrating Strategy Switch:");
            System.out.println("TESLA → Bear Market Strategy");
            System.out.println("APPLE → Bull Market Strategy");
            
            tesla.setStrategy(bearMarket);     // Tesla switches to bear market
            apple.setStrategy(bullMarket);      // Apple switches to bull market
            
            tesla.updatePrice();
            apple.updatePrice();
            
            System.out.println("\nAfter Strategy Switch:");
            tesla.displayInfo();
            apple.displayInfo();

        } catch (TradingException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n\n============Main Execution End===================");
    }
}