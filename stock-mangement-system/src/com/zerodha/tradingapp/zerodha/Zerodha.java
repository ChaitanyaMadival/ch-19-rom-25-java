package com.zerodha.tradingapp.zerodha;

public class Zerodha {
    private int stockHolderId;
    private  String stockHolderName;
    private double stockPrice;

    public int getStockHolderId() {
        return stockHolderId;
    }

    public String getStockHolderName() {
        return stockHolderName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockHolderId(int stockHolderId) {
        this.stockHolderId = stockHolderId;
    }

    public void setStockHolderName(String stockHolderName) {
        this.stockHolderName = stockHolderName;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }
}
