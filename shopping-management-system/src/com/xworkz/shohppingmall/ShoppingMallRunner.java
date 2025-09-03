package com.xworkz.shohppingmall;

import com.xworkz.shohppingmall.mall.ShoppingMall;
import com.xworkz.shohppingmall.shop.Shop;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Shop shop1 = new Shop();
        shop1.setShopId(1);
        shop1.setShopName("Trendy Fashions");
        shop1.setLocation("Ground Floor - G1");
        shop1.setShopOwner("Anita Verma");

        Shop shop2 = new Shop();
        shop2.setShopId(2);
        shop2.setShopName("TechWorld");
        shop2.setLocation("First Floor - F2");
        shop2.setShopOwner("Rohit Mehta");

        Shop shop3 = new Shop();
        shop3.setShopId(3);
        shop3.setShopName("Gadget Galaxy");
        shop3.setLocation("Second Floor - S3");
        shop3.setShopOwner("Kavya Rao");

        Shop shop4 = new Shop();
        shop4.setShopId(4);
        shop4.setShopName("Book Haven");
        shop4.setLocation("First Floor - F4");
        shop4.setShopOwner("Sandeep Kulkarni");

        Shop shop5 = new Shop();
        shop5.setShopId(5);
        shop5.setShopName("Home Decor Hub");
        shop5.setLocation("Ground Floor - G5");
        shop5.setShopOwner("Ritika Sharma");

        Shop shop6 = new Shop();
        shop6.setShopId(6);
        shop6.setShopName("Shoe Stop");
        shop6.setLocation("Second Floor - S6");
        shop6.setShopOwner("Aman Kapoor");

        Shop shop7 = new Shop();
        shop7.setShopId(7);
        shop7.setShopName("Kid's Planet");
        shop7.setLocation("First Floor - F7");
        shop7.setShopOwner("Meenal Desai");

        Shop shop8 = new Shop();
        shop8.setShopId(8);
        shop8.setShopName("Cosmetics & More");
        shop8.setLocation("Second Floor - S8");
        shop8.setShopOwner("Pooja Nair");

        Shop shop9 = new Shop();
        shop9.setShopId(9);
        shop9.setShopName("Fitness Store");
        shop9.setLocation("Ground Floor - G9");
        shop9.setShopOwner("Vikram Joshi");

        Shop shop10 = new Shop();
        shop10.setShopId(10);
        shop10.setShopName("Jewels & Gems");
        shop10.setLocation("First Floor - F10");
        shop10.setShopOwner("Neha Reddy");

        Shop shop11 = new Shop();
        shop11.setShopId(11);
        shop11.setShopName("Stationery World");
        shop11.setLocation("Second Floor - S11");
        shop11.setShopOwner("Rajiv Bansal");

        Shop shop12 = new Shop();
        shop12.setShopId(12);
        shop12.setShopName("Mobile Mania");
        shop12.setLocation("Ground Floor - G12");
        shop12.setShopOwner("Tanvi Bhatt");

        Shop shop13 = new Shop();
        shop13.setShopId(13);
        shop13.setShopName("Luxury Watches");
        shop13.setLocation("First Floor - F13");
        shop13.setShopOwner("Sameer Khan");

        ShoppingMall mall = new ShoppingMall();
        mall.addShop(shop1);
        mall.addShop(shop2);
        mall.addShop(shop3);
        mall.addShop(shop4);
        mall.addShop(shop5);
        mall.addShop(shop6);
        mall.addShop(shop7);
        mall.addShop(shop8);
        mall.addShop(shop9);
        mall.addShop(shop10);
        mall.addShop(shop11);
        mall.addShop(shop12);
        mall.addShop(shop13);

        mall.getAllDetails();

        System.out.println("main ended");
    }
}
