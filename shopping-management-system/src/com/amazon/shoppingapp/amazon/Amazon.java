package com.amazon.shoppingapp.amazon;

public class Amazon {
    private int productId;
    private  String productName;
    private  double productPrice;

    public int getProductId(){
        return  productId;
    }
    public  String getProductName(){
        return  productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
