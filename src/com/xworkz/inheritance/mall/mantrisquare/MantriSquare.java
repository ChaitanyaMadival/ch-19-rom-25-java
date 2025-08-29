package com.xworkz.inheritance.mall.mantrisquare;

import com.xworkz.inheritance.mall.shoppingmall.ShopingMall;

public class MantriSquare extends ShopingMall {
    public MantriSquare() {
        super();
        System.out.println("mantri square const is invoked\n");
    }
    @Override
    public boolean toShop(){
        System.out.println("Purchasing dress from Zudio \n");
        return true;
    }
}
