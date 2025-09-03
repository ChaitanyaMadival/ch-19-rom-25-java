package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class ProductRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Headset");
        product1.setBrand("Noise");
        product1.setPrice("3500");
        product1.setRating("4.5");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Smartwatch");
        product2.setBrand("Fire-Boltt");
        product2.setPrice("2999");
        product2.setRating("4.3");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Bluetooth Speaker");
        product3.setBrand("boAt");
        product3.setPrice("1999");
        product3.setRating("4.2");

        Product product4 = new Product();
        product4.setProductId("4");
        product4.setProductName("Smartphone");
        product4.setBrand("Samsung");
        product4.setPrice("18999");
        product4.setRating("4.6");

        Product product5 = new Product();
        product5.setProductId("5");
        product5.setProductName("Laptop");
        product5.setBrand("HP");
        product5.setPrice("52999");
        product5.setRating("4.4");

        Product product6 = new Product();
        product6.setProductId("6");
        product6.setProductName("Tablet");
        product6.setBrand("Lenovo");
        product6.setPrice("14999");
        product6.setRating("4.1");

        Product product7 = new Product();
        product7.setProductId("7");
        product7.setProductName("Fitness Band");
        product7.setBrand("Mi");
        product7.setPrice("2499");
        product7.setRating("4.0");

        Product product8 = new Product();
        product8.setProductId("8");
        product8.setProductName("Wireless Mouse");
        product8.setBrand("Logitech");
        product8.setPrice("799");
        product8.setRating("4.3");

        Product product9 = new Product();
        product9.setProductId("9");
        product9.setProductName("Mechanical Keyboard");
        product9.setBrand("Redragon");
        product9.setPrice("2999");
        product9.setRating("4.5");

        Product product10 = new Product();
        product10.setProductId("10");
        product10.setProductName("External Hard Drive");
        product10.setBrand("Seagate");
        product10.setPrice("4599");
        product10.setRating("4.4");

        Product product11 = new Product();
        product11.setProductId("11");
        product11.setProductName("Webcam");
        product11.setBrand("Logitech");
        product11.setPrice("2699");
        product11.setRating("4.2");

        Product product12 = new Product();
        product12.setProductId("12");
        product12.setProductName("Router");
        product12.setBrand("TP-Link");
        product12.setPrice("1799");
        product12.setRating("4.1");

        Product product13 = new Product();
        product13.setProductId("13");
        product13.setProductName("Power Bank");
        product13.setBrand("Ambrane");
        product13.setPrice("999");
        product13.setRating("4.3");

        Product product14 = new Product();
        product14.setProductId("14");
        product14.setProductName("Portable SSD");
        product14.setBrand("Samsung");
        product14.setPrice("7999");
        product14.setRating("4.7");

        Product product15 = new Product();
        product15.setProductId("15");
        product15.setProductName("Smart TV");
        product15.setBrand("Sony");
        product15.setPrice("34999");
        product15.setRating("4.6");

        Product product16 = new Product();
        product16.setProductId("16");
        product16.setProductName("Gaming Console");
        product16.setBrand("Sony PlayStation");
        product16.setPrice("39999");
        product16.setRating("4.8");

        Product product17 = new Product();
        product17.setProductId("17");
        product17.setProductName("eBook Reader");
        product17.setBrand("Amazon Kindle");
        product17.setPrice("8999");
        product17.setRating("4.4");

        Product product18 = new Product();
        product18.setProductId("18");
        product18.setProductName("VR Headset");
        product18.setBrand("Oculus");
        product18.setPrice("29999");
        product18.setRating("4.5");

        Product product19 = new Product();
        product19.setProductId("19");
        product19.setProductName("Action Camera");
        product19.setBrand("GoPro");
        product19.setPrice("32999");
        product19.setRating("4.6");


        Amazon amazon=new Amazon();
        amazon.addProduct(product1);
        amazon.addProduct(product2);
        amazon.addProduct(product3);
        amazon.addProduct(product4);
        amazon.addProduct(product5);
        amazon.addProduct(product6);
        amazon.addProduct(product7);
        amazon.addProduct(product8);
        amazon.addProduct(product9);
        amazon.addProduct(product10);
        amazon.addProduct(product11);
        amazon.addProduct(product12);
        amazon.addProduct(product13);
        amazon.addProduct(product14);
        amazon.addProduct(product15);
        amazon.addProduct(product16);
        amazon.addProduct(product17);
        amazon.addProduct(product18);
        amazon.addProduct(product19);

        amazon.getProductDetails();

        System.out.println("main ended");
    }
}
