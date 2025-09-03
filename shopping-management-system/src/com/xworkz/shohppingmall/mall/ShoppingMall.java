package com.xworkz.shohppingmall.mall;


import com.xworkz.shohppingmall.shop.Shop;

public class ShoppingMall {

        Shop[] shops=new Shop[13];
        int index;

        public  boolean addShop(Shop s) {
            boolean isAdded = false;
            if (s != null) {
                shops[index++] = s;
                isAdded = true;
            }
            return isAdded;
        }

    public void getAllDetails() {
        System.out.println("All shops Details ...");
            for(Shop shop : shops){
                System.out.println("Shop name : "+shop.getShopName());
                System.out.println("Shop Id : "+shop.getShopId());
                System.out.println("Location : "+shop.getLocation());
                System.out.println("Owner : "+shop.getShopOwner());
                System.out.println("--------------------");
            }
    }
}
