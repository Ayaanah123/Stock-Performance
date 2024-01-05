class StockData {
    private Stock[] stocks;

    public StockData() {
        stocks = new Stock[5];
        stocks[0] = new Stock("Stock A", 100.50);
        stocks[1] = new Stock("Stock B", 150.75);
        stocks[2] = new Stock("Stock C", 120.25);
        stocks[3] = new Stock("Stock D", 90.80);
        stocks[4] = new Stock("Stock E", 200.00);
    }

    public Stock getBestPerformingStock() {
        if (stocks.length == 0) {
            return null;
        }

        Stock bestStock = stocks[0];

        for (int i = 1; i < stocks.length; i++) {
            if (stocks[i].getPrice() > bestStock.getPrice()) {
                bestStock = stocks[i];
            }
        }

        return bestStock;
    }
}
