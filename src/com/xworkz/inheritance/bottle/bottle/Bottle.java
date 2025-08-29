package com.xworkz.inheritance.bottle.bottle;

import com.xworkz.inheritance.bottle.plastic.Plastic;

public class Bottle extends Plastic {
    public  Bottle(){
        super();
        System.out.println("bottle const is invoked \n");
    }

    @Override
    public boolean fillWater(){
        System.out.println("Contain Lemon Water\n");
        return true;
    }
}
