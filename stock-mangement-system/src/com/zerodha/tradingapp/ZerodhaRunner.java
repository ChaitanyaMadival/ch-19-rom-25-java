package com.zerodha.tradingapp;

import com.zerodha.tradingapp.zerodha.Zerodha;

public class ZerodhaRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Zerodha stock = new Zerodha();

        stock.setStockHolderId(1);
        stock.setStockHolderName("Chaitanya N M");
        stock.setStockPrice(109.78);

        int stockHolderId = stock.getStockHolderId();
        String stockHolderName = stock.getStockHolderName();
        double stockPrice = stock.getStockHolderId();

        System.out.println("Stock ID: "+stockHolderId);
        System.out.println("Stock Holder Name: "+stockHolderName);
        System.out.println("Today's Stock Price: "+stockPrice);

        System.out.println("main ended");
    }
}
