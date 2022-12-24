package main;

public class Stock {
    // class variables (data fields)
    private static String symbol = "";
    private static String name = "";
    private static double previousClosingPrice = 0;
    private static double currentPrice = 0;

    // stock {} no-arg constructor
    public Stock() {
    }

    // stock {} constructor w/ data fields
    public Stock(String stockSymbol, String stockName) {
        Stock.symbol = stockSymbol;
        Stock.name = stockName;
    }

    // class method ()
    public double getChangePercent() {
        double percentChange = ((Stock.currentPrice / Stock.previousClosingPrice) - 1) * 100.0;
        return ((Math.round(percentChange * 10)) / 10.0);
    }

    public void setStockPrices(double previousClosing, double current) {
        Stock.previousClosingPrice = previousClosing;
        Stock.currentPrice = current;
    }
}
