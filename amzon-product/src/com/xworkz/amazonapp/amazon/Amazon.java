package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;

public class Amazon {

    Product[] products = new Product[19];
    int index;


    public  boolean addProduct(Product product){
        boolean isProductAddded = false;

        if(products != null){
            products[index++] = product;
            isProductAddded= true;
        }else System.out.println("Invalid product");

        return isProductAddded;
    }

    public  void getProductDetails(){
        for(Product product : products){
            System.out.println("Product Id : "+product.getProductId());
            System.out.println("Product name : "+product.getProductName());
            System.out.println("Product Brand: "+product.getBrand());
            System.out.println("Product Price : "+product.getPrice());
            System.out.println("Rating : "+product.getRating());
            System.out.println("--------------------");
        }
    }
}
