package com.amazon.shoppingapp;

import com.amazon.shoppingapp.amazon.Amazon;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Amazon product = new Amazon();

        product.setProductId(1);
        product.setProductName("Noise-Head Set");
        product.setProductPrice(2500.50);

        int productId = product.getProductId();
        String productName = product.getProductName();
        double productPrice = product.getProductPrice();

        System.out.println("Product ID: "+productId);
        System.out.println("Product Name: "+productName);
        System.out.println("Price: "+productName);


        System.out.println("main ended");
    }
}
