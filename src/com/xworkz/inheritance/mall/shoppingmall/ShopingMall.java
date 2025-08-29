package com.xworkz.inheritance.mall.shoppingmall;

import com.xworkz.inheritance.InheritanceRunner;

public class ShopingMall extends InheritanceRunner {

    public ShopingMall() {
        super();
        System.out.println("shopping mall const is invoked");
    }

    public boolean toShop(){
        System.out.println("Shopping");
        return true;
    }
}
