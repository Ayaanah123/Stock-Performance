public class Main {
    public static void main(String[] args) {
        StockData stockData = new StockData();
        Stock bestPerformingStock = stockData.getBestPerformingStock();

        if (bestPerformingStock != null) {
            System.out.println("The best performing stock is: " + bestPerformingStock.getName());
        } else {
            System.out.println("No stock data available.");
        }
    }
}

