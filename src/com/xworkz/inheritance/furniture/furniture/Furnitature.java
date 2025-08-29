package com.xworkz.inheritance.furniture.furniture;

import com.xworkz.inheritance.InheritanceRunner;

public class Furnitature extends InheritanceRunner {

    public Furnitature() {
        super();
        System.out.println("furniture const is invoked");
    }

    public boolean makeFurniture(){
        System.out.println("Manufacture Furniture");
        return true;
    }
}
