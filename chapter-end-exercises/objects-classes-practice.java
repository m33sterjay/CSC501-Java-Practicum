/*Ch9.Ex-9.2*/
public class TestStock {
    public static void main(String[] args) {
        Stock Oracle = new Stock("ORCL", "Oracle Corporation");
        Oracle.previousClosingPrice = 34.5;
        Oracle.currentPrice = 34.35;
        System.out.printf(getChangePercent());
    }
}

// class Stock {} instantiation
public class Stock {
    // class variables (data fields)
    private static String symbol = "";
    private static String name = "";
    private static double previousClosingPrice = 0;
    private static double currentPrice = 0;

    // stock {} no-arg constructor
    public Stock() {}

    // stock {} constructor w/ data fields
    public Stock(String stockSymbol, String stockName) {
        Stock.symbol = this.stockSymbol;
        Stock.name = this.stockName;
    }

    // class method ()
    private static double getChangePercent() {
        double percentChange = (this.currentPrice / this.previousClosingPrice) - 1.0;
        return percentChange;
    }
}



/** The Stock class) Following the example of the Circle class in Section 9.2,
design a class named Stock that contains:
■■ A string data field named symbol for the stock’s symbol.
■■ A string data field named name for the stock’s name.
■■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
■■ A double data field named currentPrice that stores the stock price for the
current time.
■■ A constructor that creates a stock with the specified symbol and name.
■■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
Draw the UML diagram for the class then implement the class. 
Write a test pro- gram that creates a Stock object with the stock symbol ORCL, the name Oracle Corporation, and the previous closing price of 34.5. 
Set a new current price to 34.35 and display the price-change percentage */