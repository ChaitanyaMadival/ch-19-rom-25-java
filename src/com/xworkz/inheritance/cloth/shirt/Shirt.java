package com.xworkz.inheritance.cloth.shirt;

import com.xworkz.inheritance.cloth.cloth.Cloth;

public class Shirt extends Cloth {

    public Shirt() {
        super();
        System.out.println("shirt const is invoked\n");
    }

    @Override
    public  boolean produceCloth(){
        System.out.println("Manufacture Shirts");
        return true;
    }
}
