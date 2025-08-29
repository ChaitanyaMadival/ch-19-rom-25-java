package com.xworkz.inheritance.shoe.bata;

import com.xworkz.inheritance.shoe.brand.Brand;

public class Bata extends Brand {
    public Bata() {
        super();
        System.out.println("bata const is invoked\n");
    }

    @Override
    public boolean sellShoes(){
        System.out.println("Manufacture Shoes for men");
        return true;
    }
}
