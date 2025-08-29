package com.xworkz.inheritance.shoe.brand;

import com.xworkz.inheritance.InheritanceRunner;

public class Brand extends InheritanceRunner {
    public Brand() {
        super();
        System.out.println("brand const is invoked");
    }

    public boolean sellShoes(){
        System.out.println("Manufacture Shoes");
        return true;
    }
}
