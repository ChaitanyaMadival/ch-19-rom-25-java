package com.xworkz.inheritance.bottle.plastic;

import com.xworkz.inheritance.InheritanceRunner;

public class Plastic extends InheritanceRunner {
    public  Plastic(){
        super();
        System.out.println("plastic const is invoked");
    }

    public boolean fillWater(){
        System.out.println("Contain plain Water\n");
        return true;
    }
}
